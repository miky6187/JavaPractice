package com.biz.method.classes.statics;

public class StaticExec01 {

	//static class�� ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Nations.KOREA);
		System.out.println(Nations.USA);
		System.out.println(Nations.UAE);
		System.out.println(Nations.RUSSIA);
		System.out.println(Nations.CHINA);
		
		String strNum="30";
		int intNum =Integer.valueOf(strNum);
		
		String strName="���ѹα�";
		if(strName.equals("���� �α�")) {
			
		}
		
		if(strName.equals(Nations.KOREA)) {
			
		}
		
		Nations.KOREA ="�츮����"; //KOREA�� final�����̱⿡ ���� ������ �� ����.
		if(strName.equals(Nations.KOREA)) {
			
		}
	
		

	}

}
