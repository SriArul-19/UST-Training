package com.oops.multipleinheritanceusinginterface;

public class Bat implements Animal,Bird {

	@Override
	public void eat() {
		System.out.println("eats insect");
		
	}

	@Override
	public void run() {
		System.out.println("run slowly");
		
	}

	@Override
	public void fly() {
		System.out.println("fly fast");
		
	}
	public static void main(String[] args) {
		Bat b=new Bat();
		
	}

}
