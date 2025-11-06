package com.oops.multipleinheritanceusinginterface;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("drawing square");
	}
	public void side()
	{
		System.out.println("The square has four side");
	}

}
