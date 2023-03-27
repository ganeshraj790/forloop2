package com.onesoft.for2;

public class PrintUpperCase {
	public static void main(String[] args) {
		String []names= {"ganesh","raja","MANI","GURU","gaman","hari"};
		int cou=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].equals(names[i].toUpperCase())) {
				cou++;
				System.out.println(names[i]+""+cou);
			}
			
		}
		}
}


