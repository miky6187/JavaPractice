package com.biz.method.classes.oop01;

public class BookExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ŭ������ �̿��ؼ� ��ü �ν��Ͻ��� ����(���� �� �ʱ�ȭ)
		BookVO book = new BookVO();
		
		//��ü(�ν��Ͻ�)�� �� �Ӽ�(����)�� ��(Data)
		book.strName ="�����ڹ�";
		book.strAuth="������";
		book.strComp="������ �̵��";
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
