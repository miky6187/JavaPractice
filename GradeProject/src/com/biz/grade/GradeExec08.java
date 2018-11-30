package com.biz.grade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.grade.vo.ScoreVO;
import com.biz.grade.vo.StudentVO;

public class GradeExec08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileOutput/src/com/biz/fileread/exec/WordService.java 파일 참고
		String nameFile = "src/com/biz/grade/영어이름들.txt";
		
		String scoreFile = "src/com/biz/grade/성적표.txt";
		
		List<StudentVO> stList =new ArrayList();
		List<ScoreVO> scoreList = new ArrayList();
		
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
				
				stList.add(studentVO);
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
		
		for(StudentVO sv: stList) {
			ScoreVO scv = new ScoreVO();
			scv.setStrNum(sv.getStrNum());
			
			int intKor = (int)(Math.random()*(100-50+1))+50;
			int intEng = (int)(Math.random()*(100-50+1))+50;
			int intMath = (int)(Math.random()*(100-50+1))+50;
			
			scv.setIntKor(intKor);
			scv.setIntEng(intEng);
			scv.setIntMath(intMath);
			
			int intSum = intKor + intEng + intMath;
			float floatAvg = (float) intSum /3;
			
			scv.setIntSum(intSum);
			scv.setFloatAvg(floatAvg);
			
			scoreList.add(scv);
			
			
		}
		PrintWriter pr;
		
		try {
			pr= new PrintWriter(scoreFile);
			for (StudentVO vo : stList) {
				System.out.print(vo.getStrNum()+":");
				System.out.print(vo.getStrEngName()+":");
				System.out.print(vo.getStrKorName()+":");
				for(ScoreVO sc : scoreList) {
					if(vo.getStrNum().equals(sc.getStrNum())) {
						pr.print(sc.getIntKor()+":");
						pr.print(sc.getIntEng()+":");
						pr.print(sc.getIntMath()+":");
						pr.print(sc.getIntSum()+":");
						pr.printf("%3.2f",sc.getFloatAvg());
					}
				}
				pr.println();
			}
			pr.close();
			System.out.println("성적처리완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
