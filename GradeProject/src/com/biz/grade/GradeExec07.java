package com.biz.grade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.grade.vo.ScoreVO;
import com.biz.grade.vo.StudentVO;

public class GradeExec07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileOutput/src/com/biz/fileread/exec/WordService.java 파일 참고
		String nameFile = "src/com/biz/grade/영어이름들.txt";
		
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
		System.out.println("===========================");
		System.out.println("학번\t영어이름\t한글이름\t국어점수");
		for (StudentVO vo : stList) {
			System.out.println(vo.getStrNum()+"\t");
		}

	}

}
