package com.example;

public class SquareUsingArguments 
{
	public static void main(String args[])
	{
		int n=args.length;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
			System.out.println("The square of "+arr[i]+" is "+(arr[i]*arr[i]));
		}
	}
}
