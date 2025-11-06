package com.example;

import javax.swing.JOptionPane;

public class EvenUsingDialog 
{
	public static void main(String args[])
	{
		String s=JOptionPane.showInputDialog("enter the numner");
		int n=Integer.parseInt(s);
		if(n%2==0)
		{
			JOptionPane.showMessageDialog(null, "It is even number");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "It is not even number");
		}
	}

}
