package com.example;

import java.util.Scanner;

public class StringPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String reversed=sb.toString();
		if(s.equals(reversed))
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
	}
}
