/* ================================================
■■■ 연산자(Operator) ■■■
- 조건 연산자(삼항 연산자)
=================================================== */
/*
사용자로부터 임의의 한 문자를 입력받아 입력받은 문자가 대문자이면 소문자로, 소문자이면 대문자로
알파벳이 아닌 기타 문자라면 그 문자를 입력받은 그대로 출력하는 프로그램을 구현한다. 

실행 예)
한 문자 입력 : 
A → a
계속하려면 아무 키나 누르세요.... */

import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		/*
		int a, b;
		
		System.out.print("한 문자 입력 : ");
		a = System.in.read();
		
		//(대문자 ) ? (소문자) : ((소문자)? (대문자):(그대로))
		b = (a >= 65 && a <= 90) ? (a+32) : ((a >= 97 && a <= 122) ? (a-32) : (a));
		
		//System.out.printf("%c → %c\n", (char)a, (char)b);
		System.out.println((char)a + " → " + (char)b);
		*/
		
		char ch, result;
		
		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();
		
		// 확인
 		// System.out.println("입력받은 값 확인 : " + temp);
		
	    result = ( ch >= 'A' && ch <= 'Z' ) ? (char)(ch + 32) : ((ch >= 'a' && ch <= 'z') ? (char)(ch - 32) : ch);
		
		System.out.printf("%c  →  %c\n", ch, result); 
		
	}
}