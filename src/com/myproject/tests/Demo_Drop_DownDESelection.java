package com.myproject.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Drop_DownDESelection {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/ssrinivasan/Desktop/MultiCarList.html");
	    Select clist = new Select(driver.findElement(By.id("Car")));
	    clist.selectByIndex(0);
	    Thread.sleep(2000);
	    clist.selectByValue("M");
		Thread.sleep(2000);
		clist.selectByVisibleText("BMW");
	    clist.deselectByVisibleText("AUDI");
    	clist.deselectByValue("M");
	    clist.deselectAll();
		
	}

}
