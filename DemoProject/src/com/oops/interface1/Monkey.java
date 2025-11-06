package com.oops.interface1;

public class Monkey extends Tiger implements Animal {
public void eat()
{
	System.out.println("eat bananas");
}
public static void main(String[] args) {
	Monkey m=new Monkey();
	m.eat();
	m.run();
	System.out.println(Animal.legs);
}
}
