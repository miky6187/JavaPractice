package com.biz.var;

public class Variable07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*���� ���� : �ɺθ� ���� �뵷�� �ִ���, �ɺθ��� �ٳ�� �Ŀ� �뵷�� �ִ����� ����
		 * ȥ�� �ۿ��Ҷ� �Ȱ��� ���
		 * ������ �ٸ� �����ڳ�, Ű���� ���̶� ���� ��� �켱������ �޶���.!!
		 */
		
		
		//���࿬����
		//������ �տ� ++, -- �����ڰ� ���� ���� ���
		int intNum1=0;
		
		++intNum1; //intNum1���� 1 ����
		intNum1 +=1;
		intNum1=intNum1+1;
		
		--intNum1; //intNum1���� 1 ����
		intNum1 -=1;
		intNum1=intNum1-1;
		
		
		
		//���࿬����
		//������ �ڿ� ++, -- �����ڰ� ���߿� ���� ���
		
		intNum1++; //intNum1���� 1 ����
		intNum1 +=1;
		intNum1=intNum1+1;
		
		intNum1--; //intNum1���� 1 ����
		intNum1 -=1;
		intNum1=intNum1-1;
		
		
	    int intSum=0;
	    intNum1=0;
	    
	    intNum1+=1;
	    intSum+=intNum1;
	    
	    //n1=2, s=3
	    intSum+=++intNum1;
	    System.out.println(intNum1);
	    System.out.println(intSum);
	    
	    intSum+=intNum1++;
	    System.out.println(intNum1);
	    System.out.println(intSum);
	    
	    intSum=++intNum1;
	    //�Ʒ��� ���� �ڵ�
	    intNum1+=1;
	    intSum=intNum1+1;
	    
	    intSum=intNum1++;
	    //�Ʒ��� ���� �ڵ�
	    intSum=intNum1+1;
	    intNum1+=1;
	    
	    //���� intNum1�� ���� ��Ų �� ������ ���� intSum�� ����
	    intSum=++intNum1;
	    
	  //���⼭�� intNum1�� �� ��ȭ�� intSum�� ������ ���� �ʴ´�.
	    intSum=intNum1++;

	    
	    
	     
	    

	}

}
