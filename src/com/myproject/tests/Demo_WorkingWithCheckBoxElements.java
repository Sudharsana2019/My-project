package com.myproject.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_WorkingWithCheckBoxElements
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		driver.close();
		}
        }
