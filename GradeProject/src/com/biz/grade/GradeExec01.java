package com.biz.grade;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameFile = "src/com/biz/grade/영어이름들.txt";
		
		FileReader fr;
		
		try {
			fr =new FileReader(nameFile);
			
			while(true) {
				//파일 내용을 읽되
				int intRead =fr.read();
				
				//EOF신호가 오면 읽기를 멈춰라
				if(intRead<0) break;
				
				System.out.print((char)intRead);
			}
			//파일의 내용을 
			
			
		} catch (FileNotFoundException e) {
			//파일을 읽기위해 open하는 과정에서 발생하는 예외(Exception)을 처리하는 부분
			
			//java에서 기본으로 제공하는 예외 메시지를 콘솔에 보여주는 메서드
			e.printStackTrace();
		} catch (IOException e) {
			
			//파일로부터 데이터를 읽는중에 발생하는 예외를 처리하는 부분
			e.printStackTrace();
		}

	}

}
