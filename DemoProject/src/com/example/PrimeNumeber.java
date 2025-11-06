package com.example;

import java.util.Scanner;

public class PrimeNumeber 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count+=1;
			}
		}
		if(count==2)
		{
			System.out.println("it is prime number");
		}
		else
		{
			System.out.println("it is not prime number");
		}
		/*for(int i=2;i<=math.sqrt(n);i++)
		 * {
		 * 		if(n%i==0)
		 *      {
		 *      	System.out.println("not prime");
		 *          return;
		 *      }
		 *      else
		 *      {
		 *          System.out.println("prime");
		 *      }
		 * }
		 */
	}
}
