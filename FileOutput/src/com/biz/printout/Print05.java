package com.biz.printout;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printFile ="D:/bizwork/workspace/ExFiles/gugudan.txt";
		
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(printFile);
			for(int i=0;i<9;i++) {
				pw.printf("5 x %d = %d\r\n", i+1, 5*(i+1));
				
			}
			pw.close();
			System.out.println("저장 되었다");
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			pw.close();
		}
		

	}

}
