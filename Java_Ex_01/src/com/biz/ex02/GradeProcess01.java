package com.biz.ex02;

public class GradeProcess01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intKor=ran();
		int intEng=ran();
		int intSci=ran();
		int intHis=ran();
		int intMath=ran();
		
		int intSum= intKor + intEng + intSci + intMath + intHis;
		
		System.out.println
		("���� : " + intKor );
		System.out.println
		("���� : " + intEng );
		System.out.println
		("���� : " + intMath );
		System.out.println
		("���� : " + intSci );
		System.out.println
		("���� : " + intHis );
		
		
		System.out.println
		("���� : " + intSum);
		System.out.printf
		("��� : " + intSum/5.0f);
	}
	
	public static int ran() {
		return ((int)(Math.random()*(100-0+1))+0);
	}
	

}
