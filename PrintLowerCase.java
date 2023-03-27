package com.onesoft.for2;

public class PrintLowerCase {
	public static void main(String[] args) {
		String []names= {"ganesh","raja","mani","GURU","gaman","hari"};
		int cou=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].equals(names[i].toLowerCase())) {
				cou++;
				System.out.println(names[i]+""+cou);
			}
			
		}
	}
}


