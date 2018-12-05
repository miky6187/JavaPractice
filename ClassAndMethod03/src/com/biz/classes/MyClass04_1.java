package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass04_1 {
	
	List<String> strList;
	
	public MyClass04_1(){
		strList = new ArrayList();
	}
	
	public void push(String strNum) {
		strList.add(strNum);
	}
	
	//show() 에서 문자열을 정수형으로 변경
	public int show() {
		int intMulti =1;
		List<Integer> intList = new ArrayList();
		for(String s : strList) {
			intList.add(Integer.valueOf(s));
		}
		for(int i : intList) {
			intMulti *=i;
		}
		return intMulti;
	}

}
