package com.biz.fileout;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printFile = "D:/bizwork/workspace/ExFiles/fileW05.txt";
		
		FileWriter fw ;
		try {
			fw =new FileWriter(printFile);
			for (int i=0; i<20; i++) {
				fw.write(i);
				fw.write(":");
				
				int rndNum = (int)(Math.random()*100)+1;
				fw.write(rndNum+"\r\n");
				fw.flush(); 
				//write�� ������ ��� ���Ͽ� �����϶�
				//buffer�� ������� �ʾƼ� ������ ���ϳ����� ���� ���� 
				//�����ϴ� �ӵ��� ��������.
				
			}
			System.out.println("��� �Ϸ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
