package com.biz.method.classes.oop01;

import com.biz.method.classes.dao.DogDAO;

public class DogExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DogDAO dogDao = new DogDAO();
		dogDao.dogVO.setStrName("������");
		
		dogDao.dogRun();
		dogDao.goEat();
		
		dogDao.dogRun("���");
		dogDao.goEat("ġ��");
		
		

	}

}
