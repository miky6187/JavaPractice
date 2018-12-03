package com.biz.arrays;

public class ScoreArray03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum=0;
		//intNum;
		
		int[] intEng=new int[10];
		int intLenth=intEng.length;//int[]r가 클래스의 역할을 해서 intEng가 객체가 되었기 때문
		System.out.println(intLenth);
		
		for(int i=0; i<intLenth; i++) {
			intEng[i] =ConstMethod.makeScore();
		}
		
		int intSum=0;
		for(int i=0; i<intEng.length; i++) {
			intSum+=intEng[i];
		}
		

	}

}
