package com.myproject.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_CountRowsInaTable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();	
        driver.get("http://primusbank.qedgetech.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("txtuId")).sendKeys("Admin");
        driver.findElement(By.id("txtPword")).sendKeys("Admin");
        driver.findElement(By.id("login")).click();
        driver.findElement(By.xpath("//*[@src='images/emp_btn.jpg']")).click();
        WebElement emptable;
        emptable=driver.findElement(By.id("DGBanker"));
        List<WebElement> rows;
        rows= driver.findElements(By.tagName("tr"));
        System.out.println(rows.size());
      
	
	
	
	
	
	
	
	}

}
