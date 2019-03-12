package com.myproject.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_SpecifiedvalueinListornot {

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
		String expbranch,actbranch;
		expbranch = "MADHAPUR";
		boolean breexist = false;
		for (int i = 1; i < branches.size(); i++) 
		{
		actbranch = branches.get(i).getText();
		if (expbranch.equalsIgnoreCase(actbranch)) 
		{
		breexist = true;
		break;
		}
		}
		if (breexist) 
		{
		System.out.println(expbranch+" is present in the List");
			}
		else 
		{
        System.out.println(expbranch+"is not present in the List");
		} 
		}      
}    