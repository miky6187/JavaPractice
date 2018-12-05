package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass05 {
	
	List<String> strList;
	
	public MyClass05(){
		strList = new ArrayList();
	}
	
	public void push(String strNum) {
		strList.add(strNum);
	}
	
	public String show() {
		String strNull = "";
		for(String s : strList) {
			strNull += s;
		}
		return strNull;
	}

}
