package com.biz.grade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.grade.vo.StudentVO;

public class GradeExec06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileOutput/src/com/biz/fileread/exec/WordService.java 파일 참고
		String nameFile = "src/com/biz/grade/영어이름들.txt";
		
		List<StudentVO> sVO =new ArrayList();
		
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(nameFile);
			buffer = new BufferedReader(fr);
			
			while(true) {
				String strLine =buffer.readLine();
				if(strLine==null) break;
				
				String[] strWords =strLine.split(":");
				
				
				StudentVO studentVO = new StudentVO();
				if (strWords.length>2) {
				studentVO.setStrNum(strWords[0]);
				studentVO.setStrKorName(strWords[1]);
				studentVO.setStrEngName(strWords[2]);
				
				sVO.add(studentVO);
				}
				
			}
			buffer.close();
			fr.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

}
