package com.biz.method.classes;

public class ScoreDAO {
	
	ScoreVO scoreVO;
	
	//������ �޼ҵ�
	public ScoreDAO() {
		this.scoreVO=new ScoreVO();
	}
	
	public int makeSum() {
		int intSum=scoreVO.intKor;
		intSum += scoreVO.intEng;
		intSum += scoreVO.intMath;
		intSum += scoreVO.intSci;
		intSum += scoreVO.intHis;
		
		return intSum;
	}

}
