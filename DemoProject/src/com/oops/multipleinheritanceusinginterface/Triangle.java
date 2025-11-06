package com.oops.multipleinheritanceusinginterface;

public class Triangle implements Shape {
	@Override
	public void draw() {
		System.out.println("drawing triangle");
	}
	public void side()
	{
		System.out.println("The trianghle has three side");
	}
}
