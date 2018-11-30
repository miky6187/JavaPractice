package com.biz.inout.vo;

import java.text.SimpleDateFormat;

public class InoutVO {
	//멤버변수 영역
	private String strDate;
	private String strIO;
	private int intDanga;
	private int intSu;
	private byte vat;
	private int intTotal;//정보의 은닉 : 외부에서 접근할 수 없도록 함
	
	
	//캡슐화 : getter나 setter로 정보에 접근
	//getter, setter영역
	
	
	public String getStrDate() {
		return strDate;
	}
	//
	public boolean setStrDate(String strDate) {
		// boolean retOk = true;
		SimpleDateFormat sd 
			= new SimpleDateFormat("yyyyMMdd");
		sd.setLenient(false);
		try {
			// 날짜 유효성검사를 시도
			sd.parse(strDate);
			this.strDate = strDate;
		} catch (Exception e) {
			// 만약 유효성에 어긋나면
			return false;
			// TODO: handle exception
			// retOk = false;
		}
		return true;
		// return retOk;
	}
		
	public String getStrIO() {
		return strIO;
	}
	public void setStrIO(String strIO) {
		this.strIO = strIO;
	}
	public int getIntDanga() {
		return intDanga;
	}
	public void setIntDanga(int intDanga) {
		this.intDanga = intDanga;
	}
	public int getIntSu() {
		return intSu;
	}
	public void setIntSu(int intSu) {
		this.intSu = intSu;
	}
	public byte getVat() {
		return vat;
	}
	public void setVat(byte vat) {
		this.vat = vat;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}
	
	//
	@Override
	public String toString() {
		return "InoutVO [strDate=" + strDate + ", strIO=" + strIO + ", intDanga=" + intDanga + ", intSu=" + intSu
				+ ", vat=" + vat + ", intTotal=" + intTotal + "]";
	}
	
	
	
	
	

}
