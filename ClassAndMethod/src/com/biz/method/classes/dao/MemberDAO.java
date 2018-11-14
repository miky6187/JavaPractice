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
		this.memberVO.strName="이름을 알려주세요";
		this.memberVO.setStrTel("전화번호를 입력하세요");
		this.memberVO.setIntAge(00);
		
	}
	public MemberDAO(MemberVO memberVO) {
		this.memberVO=memberVO;
	}
	
	public void viewMember() {
		System.out.println("===================");
		System.out.println("회원정보");
		System.out.println("-------------------");
		System.out.println("회원이름:"+memberVO.strName);
		System.out.println("전화번호:"+memberVO.getStrTel());
		System.out.println("주소:"+memberVO.getStrAddr());
		System.out.println("나이:"+memberVO.getIntAge());
		System.out.println("===================");
	}
}
