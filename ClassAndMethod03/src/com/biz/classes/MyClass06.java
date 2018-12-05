package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass06 {
	List<Integer> intList;
	
	public MyClass06() {
		intList = new ArrayList();
	}
	
	public void push (int intNum) {
		intList.add(intNum);
	}
	
	public String show() {
		String strSome="";
		for(int i :intList) {
			strSome += i;
		}
		return strSome;
		
	}

}
