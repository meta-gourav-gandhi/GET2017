package com.metacube.testautomation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/**
 
 * @author    : Gourav 
 
 */
public class TestNG_LoginCheck {
	
	WebDriver driverChrome;

	
	
	/**
	* Initializes are the driver
	* executed before all test cases
	* @throws InterruptedException
	*/
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		driverChrome =  new ChromeDriver();
		driverChrome.get("http://automationpractice.com/index.php");
	}
	
	/**
	 * Test case to test forgot password for chrome
	 * @throws InterruptedException
	 */
	@Test(priority=2)
	public void testForgotPasswordForChrome() throws InterruptedException {
		driverChrome.findElement(By.className("login")).click();
		driverChrome.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		assertEquals(driverChrome.getTitle(), "Forgot your password - My Store");
	}
	
	
	
	/**
	 * Test case to test account creation for chrome
	 * @throws InterruptedException
	 */
	@Test(priority = 1)
	public void testAccountCreationForChrome() throws InterruptedException {
		driverChrome.findElement(By.className("login")).click();
		Thread.sleep(1000);
		driverChrome.findElement(By.id("email_create")).sendKeys("gourav.gandhi@metacube.com");
		driverChrome.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(3000);
		assertEquals(driverChrome.getCurrentUrl(), 
				"http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
	}
	
	
	
	
	
	

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(1000);
		driverChrome.quit();
		driverFirefox.quit();
		driverIE.quit();
	}
}
