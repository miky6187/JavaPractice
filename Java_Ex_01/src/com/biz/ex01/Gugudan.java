package com.biz.ex01;

public class Gugudan {
	//TODO 연습문제
	public static void main(String[] args) {
		
		for(int dan=2; dan<=9; dan++) {
			System.out.println("===="+dan+"단====");
			guguDan(dan);
		}
		
	}
	
	public static void guguDan(int intDan){
		
		for(int dan2=1; dan2<=9; dan2++){
			System.out.printf("%d * %d = %d\n", intDan, dan2, intDan*dan2);
		}
		
	}

}
