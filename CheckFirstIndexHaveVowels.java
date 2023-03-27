package com.onesoft.for2;

public class CheckFirstIndexHaveVowels {
	public static void main(String[] args) {
		String []a={"anesh","ram","ele","onesoft"};
		int cou=0;
		for(int i=0;i<a.length;i++) {
			if(a[i].charAt(0)=='a'||a[i].charAt(0)=='e'||a[i].charAt(0)=='i'
					||a[i].charAt(0)=='o') {
				System.out.println(a[i]);
				cou++;
			}
			
		}
		System.out.println(cou);
	}

}
