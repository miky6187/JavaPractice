package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass04 {
	
	List<Integer> intList;
	
	public MyClass04(){
		intList = new ArrayList();
	}
	
	//push(s) 에서 문자열을 정수형으로
	public void push(String strNum) {
		int intNum = Integer.valueOf(strNum);
		intList.add(intNum);
	}
	
	public int show() {
		int intMulti =1;
		for(int i : intList) {
			intMulti *=i;
		}
		return intMulti;
	}

}
