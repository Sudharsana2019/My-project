/**
 * 
 */
package com.myproject.tests;

/**
 * @author ssrinivasan
 *
 */
public class DemoTestStringContains {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String exptitle,acttitle;
		exptitle = "GMAIL";
		acttitle = "Welcome Gmail Free Mail";
		if (acttitle.toLowerCase().contains(exptitle.toLowerCase())) 
		{
		System.out.println("TestPass");	
		} else 
		{
        System.out.println("TestFail");
		}
		
		
		
		
		
		
	}

}
