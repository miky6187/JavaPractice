package com.biz.grade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GradeExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameFile = "src/com/biz/grade/영어이름들.txt";
		
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(nameFile);
			buffer = new BufferedReader(fr);
			
			while(true) {
				String strLine = buffer.readLine();
				if(strLine == null) break;
				System.out.println(strLine);
			}
			
			//코드가 끝나는 부분 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
