package com.biz.console;

public class Print01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print**키워드는 일반적으로 무엇인가 정보를 보여주는 용도
		//컴퓨터에서 외부장치에(모니터,프린터)에 데이터, 정보를 출력하는 키워드다.
		System.out.println();
		System.out.println("Hello");
		System.out.println(30);
		System.out.println("==================");
		
		//()를 사용해서 어떤것을 처리하라고 명령을 내릴때 ()안에 넣어주는 것들을 argument(s)라고 한다.
		
		System.out.print(30);
		
		//키워드 중, ()가 있는 키워드 = method, function(java외의 다른언어에서 부르는 이름)
		
		System.out.print("Hello");
		System.out.print("");  // null, nothing : 아무것도 아니다.
		System.out.print(30+50);
		
		// *.*.println() : argument로 아무것도 주지 않아도 new line을 표시하는 기본기능을 갖고 있기에 argument를 주지 않아도 오류가 나지 않음.
		//그런데*.*.print는 오로지 argument만을 표시하도록 만들어졌기에 null 또는 ""이라도 넣지 않으면 오류가 난다.
		
		//println()과 print()를 사용할때 예제
		System.out.println();
		System.out.println("30+40=" + (30+40));
		
		System.out.print(30);
		System.out.print("+");
		System.out.print(40);
		
		System.out.print("\n"); // \n은 \n문자열을 표시하라는 의미가 아니고 new line을 기호로 보내서 줄바꿈을 하라는 의미이다
		
	    System.out.println("대한\t\t민국\n만세");
	    System.out.println("\t우리나라만세");
		
	    				
	}

}
