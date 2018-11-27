package com.biz.inout.vo;

import java.text.SimpleDateFormat;

public class InoutVO {
	//������� ����
	private String strDate;
	private String strIO;
	private int intDanga;
	private int intSu;
	private byte vat;
	private int intTotal;//������ ���� : �ܺο��� ������ �� ������ ��
	
	
	//ĸ��ȭ : getter�� setter�� ������ ����
	//getter, setter����
	
	
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
			// ��¥ ��ȿ���˻縦 �õ�
			sd.parse(strDate);
			this.strDate = strDate;
		} catch (Exception e) {
			// ���� ��ȿ���� ��߳���
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
