package com.biz.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<GradeVO> gradeList = new ArrayList();
		
		for(int i=0; i<5; i++) {
			GradeVO vo =new GradeVO();
			
			// GradeVO를 vo로 생성해서 vo란 객체를 method에 보냄
			
			//vo는 method에서 설정된 값을 지니고 돌아온다.
			
			//그리고 gradeList에 vo를 더한다.
			gradeList.add(vo);
		}
		
		System.out.println("=====================================");
		System.out.println("학번\t국어\t영어\t수학\t총합\t평균");
		System.out.println("-------------------------------------");
		
		//확장된 for 을 이용한 방법
		for(GradeVO vo : gradeList) {
			viewScore(vo);
		}
		System.out.println("=====================================");
		
	}
	public static void makeScore(GradeVO vo) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("학번>>");
		vo.setStrNum(scanner.nextLine());
		
		System.out.print("국어점수 : ");
		vo.setIntKor(Integer.valueOf(scanner.nextLine()));
		
		System.out.print("영어점수 : ");
		vo.setIntEng(Integer.valueOf(scanner.nextLine()));
		
		System.out.print("수학점수 : ");
		vo.setIntMath(Integer.valueOf(scanner.nextLine()));
		
		vo.setIntSum(vo.getIntKor()+vo.getIntEng()+vo.getIntMath());
		
		vo.setFloatAvg(vo.getIntSum()/3.0f);
		
		System.out.println("--------------------------");
		
		
	}
	public static void viewScore(GradeVO v){
		System.out.print(v.getStrNum()+"\t");
		System.out.print(v.getIntKor()+"\t");
		System.out.print(v.getIntEng()+"\t");
		System.out.print(v.getIntMath()+"\t");
		System.out.print(v.getIntSum()+"\t");
		System.out.print(v.getFloatAvg()+"\n");
	}

}
