package com.biz.ex02;

public class GradeProcess02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int stu =1; stu<=5; stu++) {
			System.out.println("**************");
			System.out.println("�л�"+stu+"�� ����");
			int intKor=makeScore();
			int intEng=makeScore();
			int intMath=makeScore();
			int intSci=makeScore();
			int intHis=makeScore();
			
			System.out.println("���� : "+ intKor);
			System.out.println("���� : "+ intEng);
			System.out.println("���� : "+ intMath);
			System.out.println("���� : "+ intSci);
			System.out.println("���� : "+ intHis);
			
			int stuSum=gradeSum(intKor, intEng, intMath, intSci, intHis);
			
			System.out.println("���� : "+ stuSum);
			System.out.println("��� : "+ stuSum/5.0f);
			
		}

	}

	public static int makeScore() {
		return (int) (Math.random()*(100-0+1)+0);
	}
	
	public static int gradeSum(int A, int B, int C, int D, int E) {
		return A+B+C+D+E;
		
	}

}
