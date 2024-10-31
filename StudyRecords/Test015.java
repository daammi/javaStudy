
// ★ 변수와 자료형
// ★ 자바 기본 입출력 : System.in.read()
// ★ 클래스는 정의, 메서드는 설계, 변수는 선언

/*
	『System.in.read()』 메소드는 (입력 대기열로 부터) 한 문자만 가져온다.
	단, 입력받은 하나의 문자를 그대로 가져오는 것이 아니라
	ASCII Code 값으로 반환하게 된다.
*/

import java.io.IOException;

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		/*
		// 주요 변수 선언
		//char ch;
		int ch;
			
		// 연산 및 처리
		System.out.print("문자 하나를 입력하세요 : ");
		//ch = (char)System.in.read();                 // - 명시적 형 변환
		ch = System.in.read();
		
		// 결과 출력
		System.out.println("ch : "+ ch);
		*/
		
		/*
		char cCh;
		char nNum;

		System.out.print("한 문자 입력    : ");
		cCh = (char)System.in.read();
		System.in.read();
		System.in.read();
		

		System.out.print("한 자리 정수 입력    : ");
		nNum = (char)System.in.read();

		System.out.println();
		System.out.println(">> 입력한 문자 : "+ cCh);
		System.out.println(">> 입력한 정수 : " + nNum);
		*/
		
		// 주요 변수 선언
		char ch
		int n;
		
		
		// 연산 및 처리
		
		// - 사용자 안내 메세지 출력
		System.out.print("한 문자 입력      : ");
		ch = (char)System.in.read();
		char kh;
		// check!!
		// 입력 대기열에 남아있는 \r과 \n을 건너뛰어라. (스킵)
		
	
		// 매개변수(2)에 의해 두 글자를 읽지 않고 건너뛴다. (버린다.)
		
		// - 사용자 안내 메세지 출력
		System.out.print("한 자리 정수 입력 : ");
		n = System.in.read(); 
		
		// ASCII Code값 만큼 빼준다 ∴ -48 or -'0'
		n -= 48;
		
		// 결과 출력
		System.out.println();
		System.out.println(">> 입력한 문자 : "+ ch);
		System.out.println(">> 입력한 정수 : "+ n);
		
	}
}