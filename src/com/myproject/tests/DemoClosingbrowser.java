package com.myproject.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClosingbrowser {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(5000);
		//driver.close();
		driver.quit();
		
		
		
	}

}
