package com.function;

public class UseCar1 {
	public static void main(String[] args) {
		Car1 car1=new Car1();
		car1.brand="BMW";
		car1.price=700000;
		car1.colour="white";
		
		Car1 car2=new Car1();
		car2.brand="Audi";
		car2.price=800000;
		car2.colour="block";
		
		Car1 car3=new Car1();
		car3.brand="ford";
		car3.price=350000;
		car3.colour="red";
		System.out.println(car1.maxPrice
				(car1,car2,car3));
	}

}
