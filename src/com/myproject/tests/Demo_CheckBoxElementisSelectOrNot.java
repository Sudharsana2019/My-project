package com.myproject.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_CheckBoxElementisSelectOrNot 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.spicejet.com");
		WebElement chkbox;
		chkbox = driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		if (!chkbox.isSelected()) 
		{
		 chkbox.click();	
		}
		}
	    }
