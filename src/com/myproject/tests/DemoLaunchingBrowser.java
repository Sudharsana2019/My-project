package com.myproject.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoLaunchingBrowser
{

	public static void main(String[] args) 
	{
 //System.setProperty("webdriver.gecko.driver", "C:\\Users\\ssrinivasan\\Downloads\\geckodriver.exe");
// WebDriver driver = new FirefoxDriver();		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
WebDriver driver1= new ChromeDriver();
driver1.get("http:google.com");	
WebDriver driver2= new ChromeDriver();	
driver2.get("http:facebook.co");
	
	
	
	
	
	}

}
