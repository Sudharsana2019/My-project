package com.myproject.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_CapturesAndPrintRADIOButtonNames 
        {
        public static void main(String[] args) 
	    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://cleartrip.com/");
		List<WebElement>radios;
		radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radios.size());
		for (int i = 0; i < radios.size(); i++) 
		{
		String radioname = radios.get(i).getAttribute("Value");
		System.out.println(radioname);
	    }
	    }
	    }
