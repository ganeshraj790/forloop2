package com.onesoft.for2;

public class PrintOddEvenCount {
	public static void main(String[]args) {
		int []age= {21,22,23,24,25,26};
		int count=0;
		int od=0;
		for(int i=0;i<age.length;i++) {
			if(age[i]%2==0) {
				count++;
			}
			else {
				od++;
			}
		}
		System.out.println(count);
		System.out.println(od);
	}
}
