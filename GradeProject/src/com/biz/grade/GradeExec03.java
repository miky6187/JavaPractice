package com.biz.grade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GradeExec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = new String[200];
		String nameFile = "src/com/biz/grade/영어이름들.txt";
		
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(nameFile);
			buffer = new BufferedReader(fr);
			for(int i=0; i<names.length; i++) {
				String nameLine = buffer.readLine();
				if(nameLine == null) break;
				names[i] =nameLine;
			}//배열에 담기
			
			//
			buffer.close();
			fr.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (String name : names) {
			System.out.println(name);
		}
		String s1 = names[150];
		System.out.println(s1);
		
		//Wilton
		//Jarret
		//Coy
		
		//
		
		
		
		
		
		

	}

}
