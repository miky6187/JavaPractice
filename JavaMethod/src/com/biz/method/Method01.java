package com.biz.method;

public class Method01 {
	
	/*
	 * int a=0;//��ɹ�, statement
	 * 
	 * if(){ //��ɱ���
	 * ....
	 * ...
	 * ....
	 * }
	 * 
	 * method : Java�� ���� ���ο� ��ɹ��� �����ϴ� �� 
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum =0;
		intNum = 3+4;//�����ʿ� ���ΰ��� ��
		intNum=10*100;
		
		
		//�ϴ� ���� �ƹ��͵� ���� ��ɹ��� ����
		numMethod();
		//��� ���� ��Ų ��
		viewM();
		
		int intN =numMethod();
		intN =plusM();
		
		
	}
	public static int plusM(){
		return 3+4;
		//void�� �ƴ� type�� method������ return���� �ݵ�� �־�� �Ѵ�
		//type�� �°� return�� �ڿ� ����.
	}
	
	public static void viewM() {
		System.out.println("�ݰ����ϴ�");
	}//=�� �����ʿ� �� �� ����.
	//void keyword�� ���Ե� method���� 
	//return��ɹ��� ����ϸ� �� �Ʒ��� ��� ��ɹ��� �����϶�� ��
	// �ߴ�
	
	public static int numMethod() {
		return 0;
	}

}
