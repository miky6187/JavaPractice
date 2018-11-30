

//코드를 작성할때
//단어와 단어들을 나열하여 문장을 만들고
//문장들이 어울려서 어떤 기능(결과)을 만들어 낸다
public class HelloWorld01 {
	
	//만약 단어와 단어사이를 띄어쓰기를 한칸 이상 하지 않거나
	//_를 넣거나 숫자를 넣으면
	//그것은 정상적인 문법이 아니기 때문에
	//오류를 표시한다
	//void main -정상
	//void_main -오류:통째로 한단어로 인식
	//void_main -오류:한단어로 인식
	//2
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 는 코멘트 의 의미
		/*
		 * 여러줄씩 참고를 추가할때 별표(*)를 사용한다
		 * 
		 * 특별히 빈칸으로 구분되지 않는 문장은
		 * 단어와 단어사이에 마침표(.)를 표함해서
		 * 단어와 단어를 구별한다.
		 *
		 *ctrl + d : 한줄 지우기
		 *ctrl + z : undo
		 *ctrl + s : 저장하기
		 *shift + end 또는 home : 블록씌우기
		 */
		System.out.println(30 * 40); 
		System.out.println();                                                   
		System.out.println("Hello");
		System.out.println("30+40");
		System.out.println("Republic" + "of" + "Korea" );
		System.out.println("Republic" +123 + "Korea" );
		System.out.println("30+40=" +(30+40));
		System.out.println("30+40=" +30+40);
		
	}

}
