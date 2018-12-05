package com.biz.classes;

public class MyClass07 {
	String[] strArray;
	
	public void insert(String strNation) {
		strArray = strNation.split("");
	}
	public void show() {
		String s0 ="";
		for(String s : strArray) {
			s0 += s+",";
		}
		
		System.out.println(s0+" - "+strArray.length+"글자");
	}

}
