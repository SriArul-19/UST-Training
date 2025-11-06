package com.oops.multipleinheritanceusinginterface;

public class Hotel implements Veg,NonVeg{
	int totalcost;
	@Override
	public void ChickekBriyani() {
		int foodcost=120;
		totalcost+=foodcost;
		System.out.println("The Chicken Briyani Cost is "+foodcost);
		
	}

	@Override
	public void ChickenDosa() {
		int foodcost=100;
		totalcost+=foodcost;
		System.out.println("The Chicken Dosa Cost is "+foodcost);
		
	}

	@Override
	public void Meal() {
		int foodcost=80;
		totalcost+=foodcost;
		System.out.println("The Meal Cost is "+foodcost);
		
	}

	@Override
	public void VegBriyani() {
		int foodcost=50;
		totalcost+=foodcost;
		System.out.println("The Veg Briyani Cost is "+foodcost);
		
	}
	public void totalcost()
	{
		System.out.println("The total cost is "+totalcost);
	}

}
