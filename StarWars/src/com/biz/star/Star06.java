package com.biz.star;

public class Star06 {

	public static void main(String[] args) {
		triAngle(5);
		triAngle(7);
		triAngle(10);
		
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
		
		public static void verTriAngle() {
			for (int j = 0; j < 5; j++) {

				// 빈칸을 몇개 찍고
				for (int i = 0; i < j; i++) {
					System.out.print(" ");
				}

				// 남은 부분에 별을 찍어라
				for (int k = j; k < 5; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}	
		}
}
	


