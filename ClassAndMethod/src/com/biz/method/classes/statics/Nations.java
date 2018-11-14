package com.biz.method.classes.statics;

public class Nations {
	
	//static으로 변수를 선언하면 
	//Nations 클래스는 Dynamic에서 Static으로 바뀐다.
	
	//static class는?
	//프로젝트시작과 동시에 자동으로 메모리 어딘가에 등록
	//다른 .java파일에서 생성자로 등록하지 않아도 사용가능.
	//프로젝트가 종료될 때까지 유지된다.
	
	public final static String KOREA ="대한민국"; //다른 곳에서 변경 불가능. final변수(상수)
	public static String USA ="미합중국";
	public static String UAE ="아랍에미리트 연합";
	public static String RUSSIA ="러시아";
	public static String CHINA ="중화이민공화국";
	
	

}
