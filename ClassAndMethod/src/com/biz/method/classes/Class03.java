package com.biz.method.classes;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ScoreVO��� Ŭ������ ����ؼ� **�빮�ڷ� ���۵Ǵ� Ű����� ���δ� Ŭ���� 
		//scoreVO��� ��ü �ν��Ͻ��� �����϶� 
		//��ü�� �ʱ�ȭ �϶� 
		ScoreVO scoreVO =new ScoreVO(); 
		ScoreVO scoreVO01 =new ScoreVO();
		// ù���ڰ� �빮�ڷ� ���۵Ǵ� �޼ҵ�� Ŭ������ �ʱ�ȭ�ϴ� �뵵�� ����. "������"��� �θ���.
		
		ScoreVO sVO = new ScoreVO();
		sVO.strName = "ȫ�浿";
		sVO.strName = "�̸���";
		
		sVO = new ScoreVO();
		System.out.println(sVO.intKor);

	}

}
