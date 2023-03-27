package com.onesoft.for2;

public class FindMinimum {
	public static void main(String[]args) {
		int []age= {21,22,23,24,13,25,26};
		int min=age[0];
		for(int i=0;i<age.length;i++) {
			if(age[i]<=min) {
				min=age[i];
			}
		}
		System.out.println(min);
	}
	
	

}


