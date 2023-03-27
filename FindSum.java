package com.function;

public class FindSum {
	public void sum(int t,int e,int m,int so,int sci) {
		int a=t+e+m+so+sci;
		System.out.println("Total is="+a);		
		System.out.println("Average is="+a/5);
	}
	public static void main(String[] args) {
		FindSum s=new FindSum();
		s.sum(90, 90, 90, 90, 90);
	}

}
