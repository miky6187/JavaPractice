package com.biz.op;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDate01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JDK 8(1.8) �̻󿡼��� ���ο� ��¥, �ð� Ŭ������ �ִ�.
		//���� p.782~
		
		LocalDate localDate = LocalDate.now();
		LocalTime  localTime = LocalTime.now();
		LocalDateTime  localDateTime = LocalDateTime.now();
		
		System.out.println("���ó�¥ : "+localDate);
		System.out.println("����ð� : "+localTime);
		System.out.println("��¥�� �ð� : "+localDateTime);
		
		LocalDate xmas = LocalDate.of(2018, 12, 25);
		System.out.println(xmas);
		
		LocalDate xmasEve = xmas.minusDays(1);
		System.out.println(xmasEve);
		
		
				
				
	}

}
