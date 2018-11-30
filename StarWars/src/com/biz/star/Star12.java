package com.biz.star;

public class Star12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triAngle(3);
		
		for (int i=4; i<=20;i++) {
			triAngle(i);
		}

	}
	public static void triAngle(int intStarCount) {
		for (int j = 0; j < intStarCount; j++) {
				// 빈칸을 몇개 찍고
				for (int i = j; i < intStarCount; i++) {
					System.out.print(" ");
				}

				// 남은 부분에 별을 찍어라
				for (int k = 0; k < j; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		} // end triAngle
		

}
