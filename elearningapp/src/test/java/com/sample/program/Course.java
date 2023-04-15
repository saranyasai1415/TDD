package com.sample.program;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
	
	public class Course {
		@Test
		public void loginToSimplilearnApp() {
			System.setProperty("webdriver.gecko.driver","C:\\firefoxdriver\\geckodriver.exe");
			  WebDriver driver = new FirefoxDriver();
			driver.get("https://www.simplilearn.com/");
			driver.manage().window().maximize();
			String etitle = "Learning on Simplilearn";
			WebElement loginbtn = driver.findElement(By.xpath("//a[contains(text(),' Log in')]"));
			loginbtn.click();
			String atitle = driver.getTitle();
			boolean value = etitle.equals(atitle);
			if (value == true) {
				System.out.println("Navigated to simplilearn login page successfully");
			} else {
				System.out.println("Not navigated to simplilearn login page");
			}
		//	driver.close();
		}
	}

