package com.onesoft.for2;

public class Count {
	public static void main(String[] args) {
		int []ages=new int[6];
		ages[0]=21;
		ages[1]=22;
		ages[2]=23;
		ages[3]=24;
		ages[4]=25;
		ages[5]=26;
		int count=0;
		for(int i=0;i<ages.length;i++) {
			count++;
		}
		System.out.println(count);
	}

}
