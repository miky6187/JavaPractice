package com.biz.printout;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteAndPrintWrite01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printFile = "D:/bizwork/workspace/ExFiles/filePrint01.txt";
		
		FileWriter fw;
		PrintWriter pw;
		
		try {
			//1. FileWriter�� append���� �����ϰ�
			fw = new FileWriter(printFile, true);
			pw = new PrintWriter(fw);
			
			//2.FileWriter�� PrintWriter�� �����ϸ� 
			for (int i=0; i<10; i++) {
				//3.
				pw.println("�츮���󸸼� : "+i);
			}
			pw.close();
			fw.close();
			System.out.println("�Ϸ�");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
