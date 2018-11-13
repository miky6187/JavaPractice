package com.biz.var;

public class Variable07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*둘의 차이 : 심부름 전에 용돈을 주느냐, 심부름을 다녀온 후에 용돈을 주느냐의 차이
		 * 혼자 작용할땐 똑같은 기능
		 * 하지만 다른 연산자나, 키워드 등이랑 쓰일 경우 우선순위가 달라짐.!!
		 */
		
		
		//선행연산자
		//변수명 앞에 ++, -- 연산자가 먼저 오는 경우
		int intNum1=0;
		
		++intNum1; //intNum1에서 1 증가
		intNum1 +=1;
		intNum1=intNum1+1;
		
		--intNum1; //intNum1에서 1 감소
		intNum1 -=1;
		intNum1=intNum1-1;
		
		
		
		//후행연산자
		//변수명 뒤에 ++, -- 연산자가 나중에 오는 경우
		
		intNum1++; //intNum1에서 1 증가
		intNum1 +=1;
		intNum1=intNum1+1;
		
		intNum1--; //intNum1에서 1 감소
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
	    //아래와 같은 코드
	    intNum1+=1;
	    intSum=intNum1+1;
	    
	    intSum=intNum1++;
	    //아래와 같은 코드
	    intSum=intNum1+1;
	    intNum1+=1;
	    
	    //먼저 intNum1을 증가 시킨 후 증가된 값을 intSum에 누적
	    intSum=++intNum1;
	    
	  //여기서는 intNum1의 값 변화는 intSum의 영향을 받지 않는다.
	    intSum=intNum1++;

	    
	    
	     
	    

	}

}
