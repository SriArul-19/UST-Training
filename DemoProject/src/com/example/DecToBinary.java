package com.example;

import java.util.Scanner;

public class DecToBinary 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int r;
		String binary="";
		while(n>0)
		{
			r=n%2;
			binary=r+binary;
			n=n/2;
		}
		System.out.println(binary);
	}
}
