package com.biz.num;


//지금부터 자바 클래스가 시작
//문법이 맞다면 javac가 컴파일을 수행하여 Integer01.class라는 byte(=8bit)
public class Integer01 {
	
	//지금부터 여기 나열된 명령문들을 실행하라 라는 선언문
	public static void main(String[] args) {
		System.out.println(1000);//1000이라는 숫자를 보여줘라
		System.out.println("hellop");
		System.out.println(2147483647l+ 1);//l(long형)을 숫자에 붙이면 저장가능한 숫자한계가늘어난다.
		System.out.println(2147483648.0);
		System.out.println(2147483648239239296666.0);//소수점을 찍으면 실수로 인식
	}
}
