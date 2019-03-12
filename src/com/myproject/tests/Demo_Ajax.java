package com.myproject.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Ajax {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://Cleartrip.com");
		driver.findElement(By.id("FromTag")).sendKeys("Hyd");
		Thread.sleep(5000);
		List<WebElement>cities; 
	    cities = driver.findElement(By.id("ui-id-1")).findElements(By.tagName("Li"));
		System.out.println(cities.size());
		for (int i = 0; i < cities.size(); i++)
           {
        String cityname = cities.get(i).getText();
        System.out.println(cityname);
		   }
		
		
		
		
		
		
	}

}
