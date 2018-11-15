package com.biz.method.classes.vo;

/*
 * ����ó���� �Ҷ� 
 * �л��� �й�, �̸�
 * �� ������ ������ ����, ����� �����͸� ������ ������ ���� 
 * Value Object(DTO : )
 */
public class GradeVO {
	
	//Ŭ������ ����� ������. 
	//�Ӽ�, member���� => �⺻������ private���� �����Ѵ�.
	private String strNum;
	private String strName;
	
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSci;
	private int intHis;
	
	private int intSum;
	private float floatAvg;
	
	//�ܺο��� ������ �� �ִ� ��θ� ����
	//new�� ����ؼ� ��ü�� ������ ��
	//�б�, ���⸦ �õ��ϴ� �� => getter, setter
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntSci() {
		return intSci;
	}
	public void setIntSci(int intSci) {
		this.intSci = intSci;
	}
	public int getIntHis() {
		return intHis;
	}
	public void setIntHis(int intHis) {
		this.intHis = intHis;
	}
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public float getFloatAvg() {
		return floatAvg;
	}
	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}
	
	
	
	
	
	

}
