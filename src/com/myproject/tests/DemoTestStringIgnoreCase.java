/**
 * 
 */
package com.myproject.tests;

/**
 * @author ssrinivasan
 *
 */
public class DemoTestStringIgnoreCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	String exptitle,acttitle;
	 exptitle="GOOGLE";
	 acttitle="google";
	if (exptitle.equalsIgnoreCase(acttitle)) 
	{
	System.out.println("TestPass");	
	}
	else
	{
System.out.println("TestFail");
	}	
		
		
		
		
		
		
	}

}
