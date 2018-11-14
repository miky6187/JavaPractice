package com.biz.method.classes.statics;

public class StaticExec01 {

	//static class가 됨
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Nations.KOREA);
		System.out.println(Nations.USA);
		System.out.println(Nations.UAE);
		System.out.println(Nations.RUSSIA);
		System.out.println(Nations.CHINA);
		
		String strNum="30";
		int intNum =Integer.valueOf(strNum);
		
		String strName="대한민국";
		if(strName.equals("대한 민국")) {
			
		}
		
		if(strName.equals(Nations.KOREA)) {
			
		}
		
		Nations.KOREA ="우리나라"; //KOREA는 final변수이기에 값을 변경할 수 없다.
		if(strName.equals(Nations.KOREA)) {
			
		}
	
		

	}

}
