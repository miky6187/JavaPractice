package com.biz.fileout;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printFile = "D:/bizwork/workspace/ExFiles/fileW01.txt";
		
		FileWriter fw;
		
		try {
			fw=new FileWriter(printFile, true);
			for(int i=0; i<10; i++) {
				int rndNum = (int)(Math.random()*100)+1;
				
				fw.write(rndNum +"\r\n");
			}
			fw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
