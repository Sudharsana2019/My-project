package com.myproject.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_CapturesandPrintLinkandtheiURLinBANKAPP {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.primusbank.qedgetech.com");
		driver.manage().window().maximize();
        driver.findElement(By.linkText("Site Map")).click();
       List<WebElement>links =  driver.findElements(By.tagName("a"));
       for (int i = 0; i < links.size(); i++) 
       {
		String linkname = links.get(i).getText();
		String linkurl = links.get(i).getAttribute("href");
		System.out.println(linkname+""+linkurl);
       }
		driver.close();
	}
	}


