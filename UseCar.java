package com.function;

public class UseCar {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="BMW";
		car1.price=700000;
		car1.colour="white";
		
		Car car2=new Car();
		car2.brand="Audi";
		car2.price=600000;
		car2.colour="block";
		System.out.println(car1.maxprice(car1, car2));
	}

}
