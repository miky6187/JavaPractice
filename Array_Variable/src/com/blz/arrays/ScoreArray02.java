package com.blz.arrays;

public class ScoreArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNumbers=20;
		
		int[]intKor=new int[intNumbers];
		for (int i =0;i<intNumbers;i++) {
			intKor[i] =makeScore();
			intKor[i] =ConstMethod.makeScore();
			
			System.out.println(intKor[i]);
		}
		
		System.out.println("===========");
		System.out.println("ÃÑÁ¡");
		System.out.println("-----------");
		
		int intSum = 0 ;
		for(int i=0; i<intNumbers;i++) {
			intSum +=intKor[i];
		}
		
		System.out.print("ÃÑÁ¡ : ");
		System.out.println(intSum);
		
		System.out.print("Æò±Õ : ");
		System.out.println(intSum/(float)intNumbers);
		System.out.println("------------");

	}
	
	public static int makeScore() {
		return (int)(Math.random()*(100-50+1))+50;
	}

}
