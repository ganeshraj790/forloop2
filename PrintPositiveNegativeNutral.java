package com.onesoft.for2;

public class PrintPositiveNegativeNutral {
	public static void main(String[]args) {
		int []age= {21,22,23,24,25,26,-22,-43,-55,-54,0,0};
		int p=0;
		int n=0;
		int nu=0;
		for(int i=0;i<age.length;i++) {
			if(age[i]>0) {
				p++;
				System.out.println(p+"positive num="+age[i]);
			}
			else if(age[i]<0) {
				n++;
				System.out.println(n+"negative num="+age[i]);
			}
			else {
				nu++;
				System.out.println(nu+"nutral num="+age[i]);
			}
		}
	}
}

