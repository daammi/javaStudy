/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- if 문
- if ~ else 문 실습
===================================================*/

// 과제)
// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가 윤년인지 평년인지 판별하여
// 그 결과를 출력하는 프로그램을 구현한다.
// 단, 입력은 BufferedReader 를 활용하고,
// if  조건문을 활용하여 연산을 수행할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000년 → 윤년
// 계속하려면 아무 키나 누르세요.

// import를 통해 필요한 매서드들을 참조한다.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;
		
		// 연도 입력 알림 메시지 출력
		System.out.print("임의의 연도 입력 : ");
		// 문자열을 입력 받아 정수로 변환하여 변수에 넣는다.
		year = Integer.parseInt(br.readLine());
		
	    // if문을 활용하여 연도가 4의 배수이고 100의 배수가 아닐때
		// 혹은 400의 배수일때 printf 매서드를 통하여 윤년 결과 출력
		// 이외에는, printf 매서드를 통하여 평년 결과 출력
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			System.out.printf("%d년 → 윤년\n", year);
		else
			System.out.printf("%d년 → 평년\n", year);
	}
}

// 실행 결과

/*
	1) 임의의 연도 입력 : 2024
	   2024년 → 윤년
       계속하려면 아무 키나 누르십시오 . . .

	2) 임의의 연도 입력 : 2025
       2025년 → 평년
       계속하려면 아무 키나 누르십시오 . . .
*/