package com.biz.ex02;

import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeVO gradeVO = new GradeVO();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학번>>");
		gradeVO.setStrNum(scanner.nextLine());
		
		System.out.print("국어점수>>");
		String strKor = scanner.nextLine();
		int intKor = Integer.valueOf(strKor);
		gradeVO.setIntKor(intKor);
		// gradeVO.setIntKor(Integer.valueOf(scanner.nextLine()));  
		// >> 위와 같은 내용임.
		
		System.out.print("영어점수>>");
		String strEng = scanner.nextLine();
		int intEng = Integer.valueOf(strEng);
		gradeVO.setIntEng(intEng);
		
		System.out.print("수학점수>>");
		String strMath = scanner.nextLine();
		int intMath = Integer.valueOf(strMath);
		gradeVO.setIntMath(intMath);		
		
		int intSum = gradeVO.getIntKor(); 
		intSum += gradeVO.getIntEng(); 
		intSum += gradeVO.getIntMath();
		gradeVO.setIntSum(intSum);
		
		float floatAvg = gradeVO.getIntSum()/3.0f;
		gradeVO.setFloatAvg(floatAvg);
		
		System.out.println(gradeVO);
		

	}

}
