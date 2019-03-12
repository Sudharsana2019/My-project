package com.myproject.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_MouseOperations {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.Snapdeal.com/");
		driver.manage().window().maximize();	
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//div[2]/ul/li[2]/a/span[2]")));
        act.build().perform();
        Thread.sleep(5000);
        act.contextClick(driver.findElement(By.linkText("Smartphones")));
        act.build().perform();
        
        
        
	}

}
