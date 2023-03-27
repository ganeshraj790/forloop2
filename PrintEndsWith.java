package com.onesoft.for2;

public class PrintEndsWith {
	public static void main(String[] args) {
		String []names= {"ganeshs","raja","manis","garu","gamans","hari"};
		int cou=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].endsWith("s")) {
				cou++;
				System.out.println(names[i]+"");
			}
			
		}
		System.out.println(cou);
		}
}


