package com.example;
import java.util.Scanner;

public class SwapCharacterinString 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String s=sc.nextLine();
		String output="";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				output+=Character.toLowerCase(s.charAt(i));
			}
			else
			{
				output+=Character.toUpperCase(s.charAt(i));
			}
		}
		System.out.println(output);
	}	
}
