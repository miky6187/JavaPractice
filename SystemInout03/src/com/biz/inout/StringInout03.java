package com.biz.inout;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringInout03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strLetter ="src/com/biz/inout/loveletter.txt";
		String secLetter ="src/com/biz/inout/loveletter.txt";
		List <Integer> intList =new ArrayList<>();
		FileReader fr;
		
		try {
			fr = new FileReader(strLetter);
			while (true) {
				//ASCII 코드로 파일을 읽기 
				int read = fr.read();
				if (read<0) break;//EOF이면 끝
				intList.add(read);
				
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//intList에 담긴 int값을 문자로 변환하여 콘솔에 출력하시오.
		int intLen =intList.size();
		for(int i=0 ; i<intLen; i++){
			int _t = intList.get(i);
			System.out.println((char)_t);
		}
		FileWriter fw;
		try {
			fw = new FileWriter(secLetter);
			for(int i: intList ) {
				char c = (char)i;
				fw.write(c);
			}
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
