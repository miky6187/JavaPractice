package com.biz.method.classes.oop02;

import com.biz.method.classes.dao.GradeDAO;

public class GradeExec04 {
	public static void main(String[] args) {
		GradeDAO dao=new GradeDAO();
		
	}
	public static int makeScore() {
		return (int)(Math.random()*(100-0+1));
	}
	
	public static void setScore(GradeDAO dao) {
		dao.gradeVO.setStrNum("002");
		dao.gradeVO.setStrName("º∫√·«‚");
		dao.gradeVO.setIntKor(makeScore());
		dao.gradeVO.setIntEng(makeScore());
		dao.gradeVO.setIntMath(makeScore());
		dao.gradeVO.setIntSci(makeScore());
		dao.gradeVO.setIntHis(makeScore());
	}

}
