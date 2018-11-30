package com.biz.printout;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.printout.vo.GradeVO;

public class GradeToPrint01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<GradeVO> gradeList = new ArrayList();
		
		for (int i=0; i<30;i++) {
			String strNum = "" +(i+1);
			int intKor = (int)(Math.random()*(100-50+1))+50;
			int intEng = (int)(Math.random()*(100-50+1))+50;
			int intMath = (int)(Math.random()*(100-50+1))+50;
			
			GradeVO gradeVO = new GradeVO();
			gradeVO.setStrNum(strNum);
			gradeVO.setIntKor(intKor);
			gradeVO.setIntEng(intEng);
			gradeVO.setIntMath(intMath);
			gradeList.add(gradeVO);
			
		}
		
		/*
		 * 위에서 생성된 gradeList를 활용하여
		 * ../gradeList.txt 파일을 생성하시오.
		 * 각 라인의 구성은 
		 * 학번:국어점수:영어점수:수학점수
		 * ex)1:90:80:70
		 * 형식으로 저장하시오.
		 */
		
		String printFile = "D:/bizwork/workspace/ExFiles/gradeList.txt";
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(printFile);
			//pw.println("학번:국어점수:영어점수:수학점수");
			for(int i=0; i<30; i++) {
				pw.print(gradeList.get(i).getStrNum()+":");
				pw.print(gradeList.get(i).getIntKor()+":");
				pw.print(gradeList.get(i).getIntEng()+":");
				pw.print(gradeList.get(i).getIntMath()+"\r\n");
			}
			pw.close();
			System.out.println("저장 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			pw.close();
		
		}

	}

}
















