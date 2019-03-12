package com.myproject.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoEnteringandClearingData 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://Orangehrm.Qedgetech.com//");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Qedge123!@#");
	    driver.findElement(By.name("Submit")).click();
	    driver.findElement(By.linkText("PIM")).click();
	   driver.findElement(By.linkText("Add Employee")).click();
	    String empid = driver.findElement(By.name("employeeId")).getAttribute("value");
	    System.out.println(empid);
	    driver.findElement(By.name("employeeId")).clear();
	    
	
	
	
	
	
	
	
	
	
	
	}

}
