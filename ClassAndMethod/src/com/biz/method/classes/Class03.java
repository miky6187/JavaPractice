﻿package com.biz.method.classes;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ScoreVO라는 클래스를 사용해서 **대문자로 시작되는 키워드는 전부다 클래스 
		//scoreVO라는 객체 인스턴스를 선언하라 
		//객체를 초기화 하라 
		ScoreVO scoreVO =new ScoreVO(); 
		ScoreVO scoreVO01 =new ScoreVO();
		// 첫글자가 대문자로 시작되는 메소드는 클래스를 초기화하는 용도로 쓴다. "생성자"라고 부른다.
		
		ScoreVO sVO = new ScoreVO();
		sVO.strName = "홍길동";
		sVO.strName = "이몽룡";
		
		sVO = new ScoreVO();
		System.out.println(sVO.intKor);

	}

}
