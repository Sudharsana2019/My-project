package com.myproject.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_PrintAllOptionsinDropDownList {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
		WebElement blistelement;
		blistelement = driver.findElement(By.id("drlist"));
		Select blist = new Select(blistelement);
		List<WebElement>branches;
		branches = blist.getOptions();
		System.out.println(branches.size()-1);
		for (int i = 1; i < branches.size(); i++) 
		{
		String branchname = branches.get(i).getText();
		System.out.println(branchname);
		}
		}
        }
