package com.biz.num;


//���ݺ��� �ڹ� Ŭ������ ����
//������ �´ٸ� javac�� �������� �����Ͽ� Integer01.class��� byte(=8bit)
public class Integer01 {
	
	//���ݺ��� ���� ������ ��ɹ����� �����϶� ��� ����
	public static void main(String[] args) {
		System.out.println(1000);//1000�̶�� ���ڸ� �������
		System.out.println("hellop");
		System.out.println(2147483647l+ 1);//l(long��)�� ���ڿ� ���̸� ���尡���� �����Ѱ谡�þ��.
		System.out.println(2147483648.0);
		System.out.println(2147483648239239296666.0);//�Ҽ����� ������ �Ǽ��� �ν�
	}
}
