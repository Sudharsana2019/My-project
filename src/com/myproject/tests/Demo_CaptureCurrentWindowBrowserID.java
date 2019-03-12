package com.myproject.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_CaptureCurrentWindowBrowserID 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		String curwindowid = driver.getWindowHandle();
		System.out.println(curwindowid);


	}

}
