package com.onesoft.for2;

public class VowelCountCharArray {
	public static void main(String[]args) {
		String name="onesoft";
		char []val=name.toCharArray();
		for(int i=0;i<val.length;i++) {
			if(val[i]=='a'||val[i]=='e'||val[i]=='i'||
					val[i]=='o'||val[i]=='u') {
				System.out.println(val[i]);
			}
		}
	}

}
