package com.biz.method;

public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum =0;
		intNum+=100;
		intNum+=40;
		intNum+=50;
		intNum+=60;
		intNum+=70;
		intNum+=80;
		System.out.println(intNum);
		
		intNum =numSum();
		System.out.println(intNum);
		
		intNum=numSum(3);
		System.out.println(intNum);
		
		numSum(3);
		numSum(3,3);

	}
	
	public static int numSum(int i, int j) {
		return 0;
	}

	public static int numSum(int num) {
		return num*num;
	}
	
	public static int numSum() {
		int intSum=0;
		intSum +=30;
		intSum +=40;
		intSum +=50;
		intSum +=60;
		intSum +=70;
		intSum +=80;
		
		return intSum;
	}

}
