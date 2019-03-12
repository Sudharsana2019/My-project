/**
 * 
 */
package com.myproject.tests;

/**
 * @author ssrinivasan
 *
 */
public class DemoTestStringCompareTo {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
	String Str1,Str2;
	Str1="a";//Based on the ASCII values
	Str2="a";
	System.out.println(Str2.compareTo(Str1));
	Str1="a";//Based on the ASCII values
	Str2="b";
	System.out.println(Str2.compareTo(Str1));
	Str1="b";
	Str2="a";//Based on the ASCII values
	System.out.println(Str2.compareTo(Str1));
		
		}

}
