package com.biz.inout.service;

import java.util.Scanner;

import com.biz.inout.vo.InoutVO;

public class InoutService {
	
	InoutVO inoutVO ;
	
	// Ŭ������ ������
	public InoutService() {
		inoutVO = new InoutVO();
	}
	
	public boolean makeInout() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��¥(19990101) >>");
		String strDate = scanner.nextLine();
		if(inoutVO.setStrDate(strDate) == false) {
			System.out.println("��¥������ �߸��Ǿ����ϴ�.");
			return false;
		}
		
		System.out.print("����(1:����, 2:����) >>");
		String strIO = scanner.nextLine();

		inoutVO.setStrIO(strIO);
		try {
			System.out.print("�ܰ� >>");
			String strDanga = scanner.nextLine();
			inoutVO.setIntDanga(Integer.valueOf(strDanga));
			
			System.out.print("���� >>");
			String strSu = scanner.nextLine();
			inoutVO.setIntSu(Integer.valueOf(strSu));
			
			System.out.print("�ΰ���(1:����, 2:�鼼) >>");
			String strVat = scanner.nextLine();
			inoutVO.setVat(Byte.valueOf(strVat));
		
		} catch (Exception e) {
			// TODO: handle exception
			return false; 
		}
		return true;
		
	}
	

}











