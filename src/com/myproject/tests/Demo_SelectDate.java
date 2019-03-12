package com.myproject.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_SelectDate {

	public static void main(String[] args) 
	{
		String appdate = "15/Oct/1920";
		String[] temp = appdate.split("/");
		String dt = temp[0];
		String month = temp[1];
		String year = temp[2];
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssrinivasan\\Downloads\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://orangehrm.Qedgetech.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Recruitment")).click();
		driver.findElement(By.linkText("Candidates")).click();
		driver.findElement(By.id("candidateSearch_fromDate")).click();
		Select mlist = new Select(driver.findElement(By.className("ui-datepicker-month")));
		mlist.selectByVisibleText(month);
		Select ylist = new Select(driver.findElement(By.className("ui-datepicker-year")));
		ylist.selectByVisibleText(year);
		WebElement cal;
		cal = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		rows= driver.findElements(By.tagName("tr"));
		boolean flag = false;
		for (int i = 1; i < rows.size(); i++) 
		{
			cols= rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++) 
			{
			String caldt= cols.get(j).getText();
			if (caldt.equals(dt)) 
			{
			cols.get(j).click();
			flag = true;
			break;
			}
			}
			if (flag) 
			{
			break;	
			}
			
		}
		

	}

}
