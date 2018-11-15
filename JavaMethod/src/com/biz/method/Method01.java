package com.biz.method;

public class Method01 {
	
	/*
	 * int a=0;//명령문, statement
	 * 
	 * if(){ //명령구문
	 * ....
	 * ...
	 * ....
	 * }
	 * 
	 * method : Java에 없는 새로운 명령문을 생성하는 것 
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum =0;
		intNum = 3+4;//오른쪽에 쓰인것은 식
		intNum=10*100;
		
		
		//하는 일이 아무것도 없는 명령문을 실행
		numMethod();
		//대신 일을 시킨 것
		viewM();
		
		int intN =numMethod();
		intN =plusM();
		
		
	}
	public static int plusM(){
		return 3+4;
		//void가 아닌 type형 method에서는 return문이 반드시 있어야 한다
		//type에 맞게 return문 뒤에 쓴다.
	}
	
	public static void viewM() {
		System.out.println("반갑습니다");
	}//=의 오른쪽에 쓸 수 없다.
	//void keyword가 포함된 method에서 
	//return명령문을 사용하면 그 아래쪽 모든 명령문을 무시하라는 것
	// 중단
	
	public static int numMethod() {
		return 0;
	}

}
