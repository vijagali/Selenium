package com.selenium.rediff.landingpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_Options {
	public static WebDriver driver;

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-infobar");
		options.addArguments("--disable-notifications");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://easemytrip.com");
		driver.manage().window().maximize();

		// Waits for maximum of 10 sec, in this case, to find an element. If it
		// finds earlier it will proceed.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("spnMyAcc"))).build().perform();
		
		

	}

}
