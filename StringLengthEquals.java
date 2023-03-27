package com.onesoft.for2;

public class StringLengthEquals {
	public static void main(String[]args){
		String[]nums= {"ganesh","raja","ragul","balaji"};
		for(int i=0;i<nums.length;i++) {
			if(nums[i].length()>=5) {
				System.out.println(nums[i]);
			}
		}
		
	}

}
