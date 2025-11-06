package com.example;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Dialog {

	public static void main(String[] args) {
		//JButton jb=new JButton("click me")
		String name=JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null,"Hello "+name);
		String number=JOptionPane.showInputDialog("Enter your number");
		int a=Integer.parseInt(number);
		JOptionPane.showMessageDialog(null,"your Number is "+number);
	}

}
