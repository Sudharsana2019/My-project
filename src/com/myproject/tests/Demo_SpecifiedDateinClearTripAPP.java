package com.myproject.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo_SpecifiedDateinClearTripAPP 
{

	public static void main(String[] args)
	{
		String doj="15/August/2020";
 		String[] temp=doj.split("/");
		String dt=temp[0];
		String month=temp[1];
		String year=temp[2];		
		
		
		String calyear,calmonth,caldt;
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ssrinivasan\\Downloads\\geckodriver.exe");		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.id("DepartDate")).click();
		calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while (!calyear.equals(year)) {
			driver.findElement(By.className("nextMonth")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}		
		
		calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calmonth.equalsIgnoreCase(month)) 
		{
			driver.findElement(By.className("nextMonth")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		WebElement cal;
		cal=driver.findElement(By.className("calendar"));
		List<WebElement> rows,cols;
		rows=cal.findElements(By.tagName("tr"));
		boolean flag=false;
		
		for (int i = 1; i < rows.size(); i++) 
		{
			cols=rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++) 
			{
				caldt=cols.get(j).getText();
				if (caldt.equals(dt)) 
				{
					cols.get(j).click();
					flag=true;
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
		
