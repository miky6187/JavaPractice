package com.biz.method.m01;

public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeStars(7);
		

	}
	public static void makeStars(int intStars) {
		for(int i=0; i<intStars; i++) {
			for(int j=0; j<intStars; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}


}
