package com.oops.constructorinheritance;
class A
{
	A()
	{
		
System.out.println("A default constructor");
	
}
	A(int a)
	{
		System.out.println("The value of a in A "+a);
	}
}
class B extends A
{
	B()
	{
		System.out.println("B default constructor");
	}
	B(int a)
	{
		System.out.println("The value of a in B "+a);
	}
}
public class C extends B {
C()
{
	super(1);
	System.out.println("C default constructor");
}
C(int a)
{
	System.out.println("The value of a in C "+a);
}
public static void main(String[] args) {
	new C(22);
}
}
