package com.biz.method.classes.oop01;

public class BookExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 클래스를 이용해서 객체 인스턴스를 생성(생성 및 초기화)
		BookVO book = new BookVO();
		
		//객체(인스턴스)의 각 속성(변수)에 값(Data)
		book.strName ="열혈자바";
		book.strAuth="윤성우";
		book.strComp="오랜지 미디어";
		book.intPrice=30000;
		book.intDC=3000;
		
		//
		viewBook(book);
		

	}
	
	public static void viewBook(BookVO vo) {
		
	}
	
	public static void viewBook(String strName, String strAuth, String strComp,int intPrice, int intDC){
		
		
	}

}
