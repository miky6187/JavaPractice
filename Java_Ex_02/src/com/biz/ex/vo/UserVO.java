package com.biz.ex.vo;

public class UserVO {
	
	private String strNum;
	private String strName;
	private String strGrade;
	private String strAddrs;
	private String strNum010;
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
	public String getStrGrade() {
		return strGrade;
	}
	public void setStrGrade(String strGrade) {
		this.strGrade = strGrade;
	}
	public String getStrAddrs() {
		return strAddrs;
	}
	public void setStrAddrs(String strAddrs) {
		this.strAddrs = strAddrs;
	}
	public String getStrNum010() {
		return strNum010;
	}
	public void setStrNum010(String strNum010) {
		this.strNum010 = strNum010;
	}
	@Override
	public String toString() {
		return "UserVO [strNum=" + strNum + ", strName=" + strName + ", strGrade=" + strGrade + ", strAddrs=" + strAddrs
				+ ", strNum010=" + strNum010 + "]";
	}
	

		

}
