﻿package com.biz.grade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GradeExec05 {

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
		
		int namesC = names.length;
		int intIndex = (int)(Math.random()*namesC);
		String[] arrName = names[intIndex].split(":");
		System.out.println("다음 제시된 단어를 입력하시오");
		System.out.println(arrName[0]);
		System.out.println(arrName[1]);
		System.out.println(arrName[2]);
		
		Scanner scanner =new Scanner(System.in);
		String inputName =scanner.nextLine(); 
		
		if(arrName[2].equalsIgnoreCase(inputName)) {
			System.out.println("맞았습니다");
		} else {
			System.out.println("틀렸습니다");
			System.out.println(names);
		}
		
		
		
		
		
		
		
		
		

	}

}
