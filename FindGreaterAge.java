package com.function;

public class FindGreaterAge {
	public void age() {
		int a1=31;
		int a2=20;
		int a3=30;
		if(a1>=a2&&a1>=a3) {
			System.out.println("age 1 is big");
		}
		else if(a2>=a1&&a2>=a3) {
			System.out.println("age 2 is big");
		}
		else {
			System.out.println("age 3 is big");
		}
	}
	public static void main(String[]aggs) {
		FindGreaterAge a=new FindGreaterAge();
		a.age();
	}

}
