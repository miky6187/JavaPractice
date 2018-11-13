package com.biz.ex02;

public class GradeProcess02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int stu =1; stu<=5; stu++) {
			System.out.println("**************");
			System.out.println("학생"+stu+"의 성적");
			int intKor=makeScore();
			int intEng=makeScore();
			int intMath=makeScore();
			int intSci=makeScore();
			int intHis=makeScore();
			
			System.out.println("국어 : "+ intKor);
			System.out.println("영어 : "+ intEng);
			System.out.println("수학 : "+ intMath);
			System.out.println("과학 : "+ intSci);
			System.out.println("국사 : "+ intHis);
			
			int stuSum=gradeSum(intKor, intEng, intMath, intSci, intHis);
			
			System.out.println("총합 : "+ stuSum);
			System.out.println("평균 : "+ stuSum/5.0f);
			
		}

	}

	public static int makeScore() {
		return (int) (Math.random()*(100-0+1)+0);
	}
	
	public static int gradeSum(int A, int B, int C, int D, int E) {
		return A+B+C+D+E;
		
	}

}
