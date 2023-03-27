package com.function;

public class Car {
	String brand;
	int price;
	String colour;
	public String maxprice(Car a,Car b) {
		if(a.price>b.price) {
			return a.brand;
		}
		else {
			return b.brand;
		}
	}

}
