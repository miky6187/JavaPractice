package com.biz.ex02;

import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeVO gradeVO = new GradeVO();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�й�>>");
		gradeVO.setStrNum(scanner.nextLine());
		
		System.out.print("��������>>");
		String strKor = scanner.nextLine();
		int intKor = Integer.valueOf(strKor);
		gradeVO.setIntKor(intKor);
		// gradeVO.setIntKor(Integer.valueOf(scanner.nextLine()));  
		// >> ���� ���� ������.
		
		System.out.print("��������>>");
		String strEng = scanner.nextLine();
		int intEng = Integer.valueOf(strEng);
		gradeVO.setIntEng(intEng);
		
		System.out.print("��������>>");
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
