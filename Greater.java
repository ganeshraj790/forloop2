package com.function;

public class Greater {
	public boolean findnum(int a,int b) {
		return a>b;
	}
	public static void main(String[] args) {
		Greater g=new Greater();
		System.out.println(g.findnum(7, 4));
		System.out.println(g.findnum(5, 8));
	}

}
