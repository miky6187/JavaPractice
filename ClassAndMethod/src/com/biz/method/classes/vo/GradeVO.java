package com.biz.method.classes.vo;

/*
 * 성적처리를 할때 
 * 학생의 학번, 이름
 * 각 과목의 점수와 총점, 평균의 데이터를 저장할 변수를 갖는 
 * Value Object(DTO : )
 */
public class GradeVO {
	
	//클래스에 선언된 변수들. 
	//속성, member변수 => 기본성질을 private으로 설정한다.
	private String strNum;
	private String strName;
	
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSci;
	private int intHis;
	
	private int intSum;
	private float floatAvg;
	
	//외부에서 접근할 수 있는 통로를 선언
	//new를 사용해서 객체로 생성한 후
	//읽기, 쓰기를 시도하는 곳 => getter, setter
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
