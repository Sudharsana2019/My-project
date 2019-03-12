package com.myproject.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCaptureTitle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		String pgtitle = driver.getTitle();
		System.out.println(pgtitle);
		
		
		
		
		
		
		
		
		
		
	}

}
