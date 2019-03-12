package com.myproject.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_DropDownValuesiorderornot 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("C:\\Users\\ssrinivasan\\Desktop\\MulticarList.html");
		driver.manage().window().maximize();
		Select demolist = new Select(driver.findElement(By.id("Car")));
		List<WebElement>clist=demolist.getOptions();
		String Str1,Str2;
		boolean ordered = true;
		for (int i = 1; i < clist.size(); i++) 
		{
		Str1 = clist.get(i-1).getText();
		Str2 = clist.get(i).getText();
		if (Str2.compareToIgnoreCase(Str1)<0)
		{
			ordered = false;
			break;
			}
		}
		if (ordered) 
		{
		System.out.println("Values are in order,Test Pass");	
		}
		else
		{
			System.out.println("Values are not in order,Test Fail");
		}
	
	
	}

}
