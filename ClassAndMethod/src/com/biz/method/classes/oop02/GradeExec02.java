package com.biz.method.classes.oop02;

import com.biz.method.classes.dao.GradeDAO;

public class GradeExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeDAO dao =new GradeDAO();
		
		dao.gradeVO.setStrNum("002");
		dao.gradeVO.setStrName("������");
		dao.gradeVO.setIntKor(makeScore());
		dao.gradeVO.setIntEng(makeScore());
		dao.gradeVO.setIntMath(makeScore());
		dao.gradeVO.setIntSci(makeScore());
		dao.gradeVO.setIntHis(makeScore());
		
		dao.makeGrade();
		System.out.println("===========");
		System.out.println("����");

	}
	
	
	//main���ο��� main�� ����ϴ� method���� static�� �ٴ´�.
	public static int makeScore() {
		return (int)(Math.random()*(100-0+1));
	}

}
