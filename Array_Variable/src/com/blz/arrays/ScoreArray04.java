package com.blz.arrays;

public class ScoreArray04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intMath =new int[100];
		for(int i=0; i<intMath.length; i++) {
			intMath[i] = ConstMethod.makeScore();
		}
		
		//������ ������ intMath �迭�� ���߿��� 60�̻��� ���� ��Ÿ����
		//�װ��� console�� ��� 
		
		for(int i=0; i<intMath.length; i++) {
			if(intMath[i]>=60) {
				System.out.println(intMath[i]);
			}
		}
		
		//60�̻��� ���� ��Ÿ���� �װ��� ��ġ�� index�� ���
		
		for(int i=0; i<intMath.length; i++) {
			if(intMath[i]>=60) {
				System.out.println(i);
			}
		}
		
		//������ ������ intMath �迭�� ���߿��� �̻��� ���� ��Ÿ����
		//�װ����� ���� console�� ��� 
		int intSum=0;
		for(int i=0; i<intMath.length; i++) {
			if(intMath[i]>=80) {
				intSum +=intMath[i];
			}
		}
		System.out.println(intSum);
		
		//������ ������ intMath �迭�� ���߿��� 80�̻��� ���� ���ʷ� ��Ÿ����
		//���°���� console�� ���
		for(int i=0; i<intMath.length; i++) {
			if(intMath[i]>=80) {
				System.out.println(i);
				break;//return�� ������ �ڵ�� ������� �ʰ� �ȴ�.
			}
		}
	}

}
