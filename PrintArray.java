package com.function;

public class PrintArray {
	public void print(int[]a) {
		for(int i=0;i<a.length;i++) {
		 System.out.println(a[i]);
		}
	}


public static void main(String[]args) {
	PrintArray a=new PrintArray();
	int age[]= {20,3,4,5,6};
	a.print(age);
}
}
