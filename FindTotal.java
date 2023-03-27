package com.function;

public class FindTotal {
	public String total(int a,int b,int c,int d,int e) {
		int g=a+b+c+d+e;
		return "Total is="+g;
	}
	public static void main(String[] args) {
		FindTotal t=new FindTotal();
		System.out.println(t.total(100, 100, 100, 100, 100));
	}

}
