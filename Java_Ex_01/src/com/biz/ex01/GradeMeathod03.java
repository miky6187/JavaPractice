package com.biz.ex01;

public class GradeMeathod03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<10; i++) {
		
		int intKor=grade();
		int intEng=grade();
		int intMat=grade();
		int intSci=grade();
		
		int Sum=gradeSum(intKor, intEng) +gradeSum(intMat, intSci);
		
		System.out.printf("���� : %d, ���� : %d, ���� : %d, ���� : %d, ���� : %d\n",intKor, intEng, intMat, intSci, Sum);
		System.out.println("��� : "+((float)Sum/4));
		}

	}
	public static int grade() {
		int intGrade=(int)(Math.random()*(100-50+1))+50;
		return intGrade;
	}
	public static int gradeSum(int A, int B) {
		return (A+B);
	}

}
