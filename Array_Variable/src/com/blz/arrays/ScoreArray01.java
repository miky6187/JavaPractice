package com.blz.arrays;

public class ScoreArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ѹ��� �л��� 10���̶�� ����
		int intClassCount =10;
		
		//������ �������� ����ó�� ���α׷��� �̸� ����� ����
		int [] intKor = {0,0,0,0,0,0,0,0,0,0};
		int[] intEng = new int[intClassCount];
		int[] intMath =new int[10];
		int[] intSci = new int[intClassCount];
		//�� ���� ���
		
		intKor[0]=90;
		intKor[1]=91;
		intKor[2]=92;
		intKor[3]=93;
		intKor[4]=94;
		intKor[5]=95;
		intKor[6]=96;
		intKor[7]=97;
		intKor[8]=98;
		intKor[9]=99;
		
		for(int i=0;i<10;i++) {
			System.out.println(intKor[i]);
		}

	}

}
