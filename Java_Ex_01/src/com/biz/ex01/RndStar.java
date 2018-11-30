package com.biz.ex01;

public class RndStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intStars=(int)(Math.random()*(9-5+1))+5;
		makeStar(intStars);

	}
	public static void makeStar(int intStar) {
		System.out.println( intStar +"개의 별찍기");
		for(int i=0; i<intStar; i++) {
			for(int j=0; j<intStar; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
