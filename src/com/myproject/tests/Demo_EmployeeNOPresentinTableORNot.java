package com.myproject.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_EmployeeNOPresentinTableORNot {

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
        String expempno , actempno;
        expempno="1327";
        WebElement emptable;
        emptable=driver.findElement(By.id("DGBanker"));
        List<WebElement> rows,cols;
        rows= driver.findElements(By.tagName("tr"));
        boolean empexist = false;
        for (int i = 1; i < rows.size(); i++) 
        {
        	cols= rows.get(i).findElements(By.tagName("td"));
        	actempno = cols.get(0).getText();
        	if (actempno.equalsIgnoreCase(expempno)) 
        	{
			empexist = true;
			break;
			}
        	}
        if (empexist) 
        {
		System.out.println(expempno+" is Present in the Table,Test Pass");	
		}
        else 
        {
        System.out.println(expempno+" is not Present in the Table,Test Fail");
		}
        
        
	}

}
