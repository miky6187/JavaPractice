package com.biz.printout;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteAndPrintWrite02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String printFile = "D:/bizwork/workspace/ExFiles/grade01.txt";
		
		FileWriter fw;
		PrintWriter pw;
		
		try {
			fw = new FileWriter(printFile,true);
			pw = new PrintWriter(fw);
			pw.println("==========================================");
			pw.println("�й�   ����   ����   ����   ����   ���");
			pw.println("------------------------------------------");
			for (int i=0; i<100; i++) {
				int intNum = i+1;
				int intKor = (int)(Math.random()*(100-50))+50;
				int intEng = (int)(Math.random()*(100-50))+50;
				int intMath = (int)(Math.random()*(100-50))+50;
				
				//%5d : ��ü �ڸ����� 5���� �ϰ� ����������
				//%05d : ��ü �ڸ����� 5���� �ϰ�, ��ĭ ����ŭ 0���� ä���
				pw.printf("%05d   %5d   %5d   %5d \r\n"
						, intNum, intKor, intEng, intMath);
			}
			
			pw.close();
			fw.close();
			System.out.println("����Ϸ�");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
