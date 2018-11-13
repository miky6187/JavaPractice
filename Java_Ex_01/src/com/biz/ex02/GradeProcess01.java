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
		("국어 : " + intKor );
		System.out.println
		("영어 : " + intEng );
		System.out.println
		("수학 : " + intMath );
		System.out.println
		("과학 : " + intSci );
		System.out.println
		("국사 : " + intHis );
		
		
		System.out.println
		("총합 : " + intSum);
		System.out.printf
		("평균 : " + intSum/5.0f);
	}
	
	public static int ran() {
		return ((int)(Math.random()*(100-0+1))+0);
	}
	

}
