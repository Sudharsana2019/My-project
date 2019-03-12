package com.myproject.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLoggingLocators 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();	
		driver.get("http://orangehrm.Qedgetech.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement pwd =driver.findElement(By.name("txtPassword"));
		pwd.sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
		

	}

}
