package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass03 {
	List<Integer> intList;
	
	public MyClass03(){
		intList = new ArrayList();
	}
	
	public void push(int intNum) {
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
