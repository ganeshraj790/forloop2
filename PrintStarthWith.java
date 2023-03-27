package com.onesoft.for2;

public class PrintStarthWith {
	public static void main(String[] args) {
		String []names= {"ganesh","raja","mani","garu","gaman","hari"};
		int cou=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].startsWith("ga")) {
				cou++;
				System.out.println(names[i]+""+cou);
			}
			
		}
		}
}
