package com.biz.method.classes.dao;

import com.biz.method.classes.vo.DogVO;

public class DogDAO {
	public DogVO dogVO;
	
	public DogDAO() {
		this.dogVO=new DogVO();
	}
	public void dogRun() {
		String strName = this.dogVO.getStrName();
		System.out.println(strName +"�� �޸��ϴ�.");
	}
	public void dogRun(String strField) {
		String strName = this.dogVO.getStrName();
		strName +="�� "+strField;
		strName +="�� �޸��ϴ�.";
		System.out.println(strName);
		
	}
	
	public void goEat() {
		String strName=this.dogVO.getStrName();
		System.out.println(strName +"�� �Խ��ϴ�.");
		
	}
	
	public void goEat(String strFood) {
		String strName=this.dogVO.getStrName();
		strName +="�� "+ strFood;
		strName +="�� ���ְ� �Խ��ϴ�.";
		System.out.println(strName);
		
	}

}
