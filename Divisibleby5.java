package com.onesoft.for2;

public class Divisibleby5 {
	public static void main(String[]args) {
		int []age= {21,22,23,24,25,30};
		int sum=0;
		for(int i=0;i<age.length;i++) {
			if(age[i]%5==0) {
				System.out.println(age[i]);
				sum++;
			}
}
		System.out.println(sum);
	}
}
