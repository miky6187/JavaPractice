package com.biz.method.classes.dao;

import com.biz.method.classes.vo.GradeVO;

public class GradeDAO {
	public GradeVO gradeVO;
	
	public GradeDAO() {
		gradeVO=new GradeVO();
	}
	
	public void makeGrade() {
		//TODO ��հ� ���� ����ϱ�
		makeSum();
		
		
	}
	
	public void makeSum() {
		int intSum = this.gradeVO.getIntKor();
		intSum += this.gradeVO.getIntEng();
		intSum += this.gradeVO.getIntMath();
		intSum += this.gradeVO.getIntSci();
		intSum += this.gradeVO.getIntHis();
		
		this.gradeVO.setIntSum(intSum);
		
	}

	public void viewSum() {
		//TODO �������ϱ�
		makeSum();
		System.out.println("=============");
		System.out.println("����"+this.gradeVO.getIntSum());
		System.out.println("=============");
		
	}
	public void viewAvg() {
		//TODO �������ϱ�
		makeSum();
		int intSum =this.gradeVO.getIntSum();
		
		float floatAvg =(float) intSum/5;
		System.out.println("=============");
		System.out.println("���"+floatAvg);
		System.out.println("=============");
		
	}
	
	public void gradeView() {
		System.out.println("=============");
		System.out.println("�л���������");
		System.out.println("�й�"+gradeVO.getStrNum());
		System.out.println("�̸�"+gradeVO.getStrName());
		System.out.println("--------------");
		System.out.println("����"+gradeVO.getIntKor());
		System.out.println("����"+gradeVO.getIntEng());
		System.out.println("����"+gradeVO.getIntMath());
		System.out.println("����"+gradeVO.getIntSci());
		System.out.println("����"+gradeVO.getIntHis());
		System.out.println("--------------");
	}



}
