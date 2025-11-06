package com.example;

import java.util.Scanner;

public class NumberPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		String reverseint="";
		int rem;
		int temp=n;
		while(n>0)
		{
			rem=n%10;
			reverseint+=rem;
			n=n/10;
		}
		int result=Integer.parseInt(reverseint);
		if(temp==result)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
	}
}
