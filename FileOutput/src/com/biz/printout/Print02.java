package com.biz.printout;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Print02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String printFile ="D:/bizwork/workspace/ExFiles/my.txt";
		// D:\\bizwork\\workspace\\ExFiles\\my.txt �� ���� ��
		
		InputStream in = System.in;
		Scanner scan =new Scanner(in);
		
		PrintWriter pw = null ;
		try {
			pw = new PrintWriter(printFile);
			
			for(int i=0; i<100; i++) {
				int rndNum = (int) (Math.random()*(100-50+1))+50;
				pw.println(rndNum);
			}
			
			pw.close();
			System.out.println("���� ���� �Ϸ�");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
