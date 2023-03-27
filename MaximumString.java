package com.onesoft.for2;

public class MaximumString {
	public static void main(String[] args) {
		String[]val= {"raja","ganesh","raju","geo"};
		int max=val[0].length();
		String temp="";
		for(int i=0;i<val.length;i++) {
			if(val[i].length()>=max) {
				max=val[i].length();
				temp=val[i];
			}
		}
		System.out.println(max+""+temp);
	
	int min=val[0].length();
	String m="";
	for(int i=0;i<val.length;i++) {
		if(val[i].length()<=min) {
			min=val[i].length();
			m=val[i];
		}
	}
	System.out.println(min+""+m);
	

}}
