package com.biz.ex01;

public class RundSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 =0;
		int i=0;
		for(i=0; i<16; i++) {
			int I= (int) (Math.random()*(100-50+1)+50);
			sum1+=I;
			System.out.println(I);
		}
		System.out.println(sum1);
		System.out.println((float)sum1/16);

	}

}
