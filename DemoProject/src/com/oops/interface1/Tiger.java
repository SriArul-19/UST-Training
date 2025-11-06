
package com.oops.interface1;

import com.oops.multipleinheritanceusinginterface.Bird;

public class Tiger implements Animal {
/*
	@Override
	public void eat() {
		System.out.println("Tiger eats non veg");
		
	}

	@Override
	public void run() {
		System.out.println("run fast");
		
	}*/
	 
	public static void main(String[] args) {
		/*Tiger t=new Tiger();
		t.eat();
		t.run(); */
		Animal b=new Animal() {

    		@Override
    		public void eat() {
    			System.out.println("Tiger eats non veg");
    			
    		}

    		@Override
    		public void run() {
    			System.out.println("run fast");
    			
    		} 
		};
        b.eat();
        b.run();
	}

}
