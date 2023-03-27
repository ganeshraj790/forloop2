package com.onesoft.for2;

public class Printvowels {
	public static void main(String[] args) {
		String []names= {"ganesh","raja","mani","guru","raman","hari","ttrr","rfff"};
		int count=0;
		int cu=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].contains("a")||names[i].contains("e")||
					names[i].contains("i")||names[i].contains("o")||names[i].contains("u")) {
				count++;
				System.out.println(names[i]);
			}
			else {
				cu++;
			}
		}
		System.out.println(cu);
		System.out.println(count);
	}
}
