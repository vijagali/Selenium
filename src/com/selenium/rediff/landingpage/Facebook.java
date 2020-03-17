package com.selenium.rediff.landingpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static Select select;
	
	public static void main(String args[]){
		WebDriverManager.chromedriver().setup();
		WebDriver driver  =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		 select = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		select.selectByVisibleText("14");
		
		 select = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		select.selectByVisibleText("May");
	}

}
