package com.oops.multipleinheritanceusinginterface;


public class SBIBank implements Loan {
	int r=8;
	@Override
	public void interest(int amount,int years) {
		int total=((amount*years*r)/100)+amount;
		System.out.println("the total amount is "+total);
	}

}
