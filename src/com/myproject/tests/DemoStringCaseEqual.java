package com.myproject.tests;

public class DemoStringCaseEqual {

	public static void main(String[] args) 
	{
		String exptitle,acttitle;
		exptitle="GOOGLE";
		acttitle="google";
		if (exptitle.equals(acttitle)) 
		{
			System.out.println("TestPass");
		}
		else 
		{
			System.out.println("TestFail");
			
		}
	}

}
