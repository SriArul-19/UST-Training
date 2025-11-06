package com.example;

import java.util.Scanner;


public class OctToBin 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the octal number:");
		int octal=sc.nextInt();
		int integer=0;
		int rem;
		int i=0;
		while(octal>0)
		{
			rem=octal%10;
			integer+=(rem*((int)Math.pow(8,i)));
			octal=octal/10;
			i++;
		}

		String binary="";
		while(integer>0)
		{
			rem=integer%2;
			binary=rem+binary;
			integer=integer/2;
		}
		System.out.println("The Binary Number is: "+binary);
		sc.close();
	}
}
