package com.selenium.rediff.landingpage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffLandingPageValidation {
	WebDriver driver;

	@BeforeMethod
	public void instantiateBrowserDriver() {
		System.out.println("************  Before Method  ************");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://www.rediff.com/");
		// driver.close();
	}

	/*@Test
	public void verifyTitleOfTheLandingPage() {
		// WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();
		// driver.get("https://www.rediff.com/");
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		if (driver.getTitle().equals(expectedTitle)) {
			System.out.println("Landing Page title is correct");
		} else {
			System.out.println("Landing page is incorrect");
		}
	}

	@Test
	public void verifyUrlOfLandingPage() {
		if (driver.getCurrentUrl().equals("https://www.rediff.com/")) {
			System.out.println("Correct URL");
		} else {
			System.out.println("Wrong URL");
		}
	}*/
	
	@Test
	public void LoginPage() throws InterruptedException{
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("The alert message is: " +alert.getText());
		Thread.sleep(1000);
		//alert.accept();
		alert.dismiss();
	}
	
	@Test
	public void selectDropdown(){
		Select select = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		select.selectByVisibleText("4");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("************  After Method  ************");
		//driver.close();
	}

}
