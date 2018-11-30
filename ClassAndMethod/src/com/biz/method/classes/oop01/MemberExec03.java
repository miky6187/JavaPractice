package com.biz.method.classes.oop01;

import com.biz.method.classes.dao.MemberDAO;
import com.biz.method.classes.vo.MemberVO;

public class MemberExec03 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberVO vo=new MemberVO();
		vo.setStrid("001");
		vo.setStrName("이몽룡");
		vo.setStrTel("010-222-9999");
		vo.setStrAddr("남원시");
		vo.setIntAge(16);
		
		MemberDAO dao = new MemberDAO(vo);
		dao.viewMember();

	}

}
