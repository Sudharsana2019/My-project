package com.myproject.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_WorkingwithLink {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		String exptitle,acttitle;
		exptitle = "GMail";
		driver.findElement(By.linkText("Gmail")).click();
		acttitle = driver.getTitle();
		if (acttitle.toLowerCase().contains(exptitle.toLowerCase())) 
				{
			System.out.println("GMailLink working, Test PASS");
		}
		else 
		{
           System.out.println("GMail Link not working, Test FAIL");
		}
		
		driver.close();
	}

}
