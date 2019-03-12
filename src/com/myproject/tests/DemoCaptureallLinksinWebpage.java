package com.myproject.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCaptureallLinksinWebpage 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://primusbank.Qedgetech.com//");
        driver.findElement(By.linkText("Site Map")).click();
        List<WebElement>links=driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) 
        {
			String linkname = links.get(i).getText();
			System.out.println(linkname);
		}
        
		
	}

}
