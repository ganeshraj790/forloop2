package com.function;

public class PrintMax {
	public int max(int[]a) {
	int ma=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>ma)
			ma=a[i];
	}
	return ma;
	}
	public static void main(String[] args) {
		PrintMax r=new PrintMax();
		int []num= {500,90,100,67,80};
		
	System.out.println(r.max(num));
	}

}
