package com.biz.star;

public class Star05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * method() �̾߱�
		 * java�� �츮(���α׷���)�� ��򰡿�
		 * public static void ��� Ű����� ���۵�
		 * ��ɹ����� method�� ����(����)�� �θ�
		 * ��ġ java���� �⺻������ �����ϴ�
		 * Ű���� ó��
		 * ����� �����Ҽ� �ִ�.
		 * 
		 * method �̸�
		 * 1. ���� �̸������ ����.
		 *    ù���ڴ� �����ҹ���
		 *    �ι�°���ʹ� ��, ����
		 * 2. ������ 2�ܾ� �̻��� ��� 
		 * 3. �ǹ��ִ� �̸����� ����
		 * 4. ù���ڸ� �����ϰ� �ܾ ���۵ɶ���
		 *    �빮�ڷ� ��������(camel)
		 */
		triAngle();
		verTriAngle();
		triAngle();
		verTriAngle();
		triAngle();
		
		for(int i = 0 ; i < 10 ; i++) {
			triAngle();
		}
		

	}
	
	// TODO triAngle method �����
	// ���ݺ��� Star05 Ŭ������ 
	// triAngle �̶�� ������ keyword�� ����ڴ�.
	// 		��� ����
	// ���� ���� �̷� Ű���带 method(�޼���)���
	// 		�θ���
	public static void triAngle() {
		for (int j = 0; j < 5; j++) {
			// ��ĭ�� � ���
			for (int i = j; i < 5; i++) {
				System.out.print(" ");
			}

			// ���� �κп� ���� ����
			for (int k = 0; k < j; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	} // end triAngle
	
	public static void verTriAngle() {
		for (int j = 0; j < 5; j++) {

			// ��ĭ�� � ���
			for (int i = 0; i < j; i++) {
				System.out.print(" ");
			}

			// ���� �κп� ���� ����
			for (int k = j; k < 5; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	

		
		
	}


