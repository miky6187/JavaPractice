package com.biz.method.classes.dao;

import com.biz.method.classes.vo.MemberVO;

public class MemberDAO {
	
	public MemberVO memberVO;
	
	/*
	 * 
	 */
	public MemberDAO() {
		
		this.memberVO = new MemberVO();
		
		this.memberVO.strid="000";
		this.memberVO.strName="�̸��� �˷��ּ���";
		this.memberVO.setStrTel("��ȭ��ȣ�� �Է��ϼ���");
		this.memberVO.setIntAge(00);
		
	}
	public MemberDAO(MemberVO memberVO) {
		this.memberVO=memberVO;
	}
	
	public void viewMember() {
		System.out.println("===================");
		System.out.println("ȸ������");
		System.out.println("-------------------");
		System.out.println("ȸ���̸�:"+memberVO.strName);
		System.out.println("��ȭ��ȣ:"+memberVO.getStrTel());
		System.out.println("�ּ�:"+memberVO.getStrAddr());
		System.out.println("����:"+memberVO.getIntAge());
		System.out.println("===================");
	}
}
