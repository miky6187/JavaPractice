package com.biz.printout;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printFile = "D:/bizwork/workspace/ExFiles/gugudan.txt";
		
		PrintWriter pw;
		
		try {
			pw =new PrintWriter(printFile);
			pw.println("==================");
			pw.println("������ 5��");
			pw.println("------------------");
			for(int i=0;i<9;i++) {
				pw.printf("%d x %d = %2d\r\n",5, (i+1), 5*(i+1));
			}
			pw.println("==================");
			pw.close();
			System.out.println("������ �ۼ� ���� �Ϸ�");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
