package com.selenium.rediff.landingpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Boolean_Validations {

	public static WebDriver driver;

	public static void main(String[] args) {
		// isDisplayed()

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		boolean facebookLogo = driver.findElement(By.xpath("//div[@id='blueBarDOMInspector']/descendant::i[1]")).isDisplayed();
		
		if(facebookLogo == true){
			System.out.println("Logo is displayed");
		}else{
			System.out.println("Logo is not displayed");
		}
		
		//isEnabled();
		boolean firstName = driver.findElement(By.xpath("//input[@name='firstname']")).isEnabled();


		if(firstName == true){
			System.out.println("first name is enabled");
		}else{
			System.out.println("first name is dis-abled");
		}
		
		//isSelected()  ----Homework
		//Import selenium doc
		
		
	}

}








