package com.onesoft.for2;

public class PrintOdd {
	public static void main(String[]args) {
		int []age= {21,22,23,24,25,26};
		int sum=0;
		for(int i=0;i<age.length;i++) {
			if(age[i]%2!=0) {
				sum=sum+age[i];
				System.out.println(age[i]);
				System.out.println(sum);
			}
		}
	}

}
