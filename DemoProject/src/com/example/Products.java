package com.example;

import java.util.Scanner;

public class Products
{
	Scanner sc=new Scanner(System.in);
    int n=3;
    Products pa[]=new Products[n];
	int no;
	String name;
	int price;
	void add()
	{
		System.out.println("Enter "+n+" Products");
		for(int i=0;i<n;i++)
		{
		    	pa[i]=new Products();
		    	System.out.println("Enter the product no");
		    	pa[i].no=sc.nextInt();
		    	sc.nextLine();
		    	System.out.println("Enter the product name");
		    	pa[i].name=sc.nextLine();
		    	System.out.println("Enter the product price");
		    	pa[i].price=sc.nextInt();
		}
		
	}
	void display()
	{
		System.out.println("The products details are");
		for(int i=0;i<n;i++)
		{
			System.out.println("No="+pa[i].no);
			System.out.println("Name="+pa[i].name);
			System.out.println("Price="+pa[i].price);
		}
	}
	public static void main(String[] args) 
	{
		Products p=new Products();
		p.add();
		p.display();
	}
}
