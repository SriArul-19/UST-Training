package com.example;
import java.util.*;
public class SumofN 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+1;
		}
		System.out.println("sum is "+sum);
}
}
//formula sum=num*(num+1)/2