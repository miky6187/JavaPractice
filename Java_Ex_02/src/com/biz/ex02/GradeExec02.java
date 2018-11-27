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
			
			// GradeVO�� vo�� �����ؼ� vo�� ��ü�� method�� ����
			
			//vo�� method���� ������ ���� ���ϰ� ���ƿ´�.
			
			//�׸��� gradeList�� vo�� ���Ѵ�.
			gradeList.add(vo);
		}
		
		System.out.println("=====================================");
		System.out.println("�й�\t����\t����\t����\t����\t���");
		System.out.println("-------------------------------------");
		
		//Ȯ��� for �� �̿��� ���
		for(GradeVO vo : gradeList) {
			viewScore(vo);
		}
		System.out.println("=====================================");
		
	}
	public static void makeScore(GradeVO vo) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�й�>>");
		vo.setStrNum(scanner.nextLine());
		
		System.out.print("�������� : ");
		vo.setIntKor(Integer.valueOf(scanner.nextLine()));
		
		System.out.print("�������� : ");
		vo.setIntEng(Integer.valueOf(scanner.nextLine()));
		
		System.out.print("�������� : ");
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
