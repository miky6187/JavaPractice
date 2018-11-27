package com.biz.op;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//날짜값을 키보드나, 외부장치로부터 읽었을때 
		//유효한지 확인할 필요가 있을때 사용할 수 있는 코드
		
		//키보드로 
		
		String date1 = "1991/01/01";
		String date2 = "1991/02/20";
		String date3 = "2018/11/31";
		
		SimpleDateFormat dateCheck =new SimpleDateFormat("yyyy/MM/dd");
		
		dateCheck.setLenient(false);
		
		// SimpleDateFormat 의 parse()메서드는 
		try {
			dateCheck.parse(date1);
			System.out.println(date1);
			
			dateCheck.parse(date2);
			System.out.println(date2);
			
			dateCheck.parse(date3);
			System.out.println(date3);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("예외발생");
		}
		
				
	}

}
