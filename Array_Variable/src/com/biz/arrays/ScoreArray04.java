﻿package com.biz.arrays;

public class ScoreArray04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intMath =new int[100];
		for(int i=0; i<intMath.length; i++) {
			intMath[i] = ConstMethod.makeScore();
		}
		
		//위에서 생성한 intMath 배열의 값중에서 60이상인 값이 나타나면
		//그값만 console에 출력 
		
		for(int i=0; i<intMath.length; i++) {
			if(intMath[i]>=60) {
				System.out.println(intMath[i]);
			}
		}
		
		//60이상인 값이 나타나면 그값이 위치한 index를 출력
		
		for(int i=0; i<intMath.length; i++) {
			if(intMath[i]>=60) {
				System.out.println(i);
			}
		}
		
		//위에서 생성한 intMath 배열의 값중에서 이상인 값이 나타나면
		//그값들의 합을 console에 출력 
		int intSum=0;
		for(int i=0; i<intMath.length; i++) {
			if(intMath[i]>=80) {
				intSum +=intMath[i];
			}
		}
		System.out.println(intSum);
		
		//위에서 생성한 intMath 배열의 값중에서 80이상인 값이 최초로 나타날때
		//몇번째인지 console에 출력
		for(int i=0; i<intMath.length; i++) {
			if(intMath[i]>=80) {
				System.out.println(i);
				break;//return은 이후의 코드는 진행되지 않게 된다.
			}
		}
	}

}
