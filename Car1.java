package com.function;

public class Car1 {
	String brand;
	int price;
	String colour;
	public String maxPrice(Car1 a,Car1 b,Car1 c) {
		if(a.price>b.price&&a.price>c.price) {
			return a.brand;
		}
		else if (b.price>a.price&&b.price>c.price) {
			return b.brand;
		}
		else { 
			return c.brand;
	
}
	}
}


