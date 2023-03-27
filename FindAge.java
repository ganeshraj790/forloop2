package com.function;

public class FindAge {
	public String age(int age){
		if(age>=18) {
			return "eligible for vote";
		}
		else {
			return "not eligible for vote";
		}
	}
	public static void main(String[]aggs) {
		FindAge a=new FindAge();
		System.out.println(a.age(23));
	}

}
