package com.biz.star;

public class Star13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=5; i<5  ;i++) {
			triAngle(i);
		}

	}
	public static void triAngle(int intStarCount) {
		for (int j = 0; j < intStarCount; j++) {
				// ºóÄ­À» ¸î°³ Âï°í
				for (int i = j; i < intStarCount; i++) {
					System.out.print(" ");
				}

				// ³²Àº ºÎºÐ¿¡ º°À» Âï¾î¶ó
				for (int k = 0; k < j; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		} // end triAngle

}
