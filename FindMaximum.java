package com.onesoft.for2;

public class FindMaximum {
	public static void main(String[]args) {
		int []age= {21,22,23,24,25,26};
		int max=age[0];
		for(int i=0;i<age.length;i++) {
			if(age[i]>max) {
				max=age[i];
			}
		}
		System.out.println(max);
	}
	
	

}
