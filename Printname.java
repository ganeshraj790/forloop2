package com.function;

public class Printname {
	public void name(String name,int age) {
		System.out.println("Name="+name+",Age="+age);
	}
	public static void main(String[] args) {
		Printname n=new Printname();
		n.name("Ganesh", 1997);
	}

}
