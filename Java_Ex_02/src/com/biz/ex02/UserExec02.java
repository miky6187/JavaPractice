package com.biz.ex02;

import java.util.Scanner;

import com.biz.ex.vo.UserVO;

public class UserExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserVO userVO = new UserVO();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�й�>>");
		String strNum = scanner.nextLine();
		userVO.setStrNum(strNum);
		
		System.out.print("�̸�>>");
		String strName = scanner.nextLine();
		userVO.setStrName(strName);
		
		System.out.print("�г�>>");
		String strGrade = scanner.nextLine();
		userVO.setStrGrade(strGrade);
		
		System.out.print("�ּ�>>");
		String strAddrs = scanner.nextLine();
		userVO.setStrAddrs(strAddrs);
		
		System.out.print("��ȭ��ȣ>>");
		String strNum010 = scanner.nextLine();
		userVO.setStrNum010(strNum010);
		
		System.out.print(userVO);

	}

}
