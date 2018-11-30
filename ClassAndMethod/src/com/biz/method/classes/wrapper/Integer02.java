package com.biz.method.classes.wrapper;

public class Integer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum1=50;
		Integer integerNum1=intNum1; //boxing
		
		System.out.println(integerNum1.toString());
		System.out.println(Integer.valueOf(intNum1));
		//둘이 같음
		
		System.out.println(Integer.valueOf(intNum1));
		System.out.println("(HEX)16진수 :"+Integer.toHexString(intNum1));
		System.out.println("(OCT)8진수 :"+Integer.toOctalString(intNum1));
		System.out.println("(BIN)2진수 :"+Integer.toBinaryString(intNum1));
		
		
		

	}

}
