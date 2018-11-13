package com.biz.star;

public class Star07 {

	public static void main(String[] args) {
		plus1(30, 40);
		plus1(50, 20);
		plus1(100, 200);
		plus1(3, 100);
		plus1(5, 20);

	}
	public static void plus1 (int A, int B) {
		System.out.printf("%d + %d = %d",A,B,A+B);
		System.out.println();
		System.out.printf("%d * %d = %d",A,B,A*B);
		System.out.println();
	}

}
