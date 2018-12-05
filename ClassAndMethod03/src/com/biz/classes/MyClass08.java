package com.biz.classes;

public class MyClass08 {
	
	public void show(char a, char f) {
		for(int i =0; i<=(f-a); i++) {
			System.out.print((char)(a+i));
		}
		//위와 같은 내용
		//for(int i =a; i<=f; i++) {
		//   System.out.print((char)i);
		//}
	}

}
