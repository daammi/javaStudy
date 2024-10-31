/* ================================================
■■■ 연산자(Operator) ■■■
- 조건 연산자(삼항 연산자)
- 두개 이상의 조건이면 '논리 연산자'
=================================================== */
/* 
 윤년의 판별 조건
 연도가 4의 배수이면서 
 100의 배수가 아니거나 
 400의 배수이면 윤년!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year;
		String strResult;
			
		System.out.print("임의의 연도를 입력하세요 : ");
		year = Integer.parseInt(br.readLine());
		
		// (연도가 4의 배수  &&  연도가 100의 배수 아님)  ||  연도가 400의 배수
		strResult = ((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0)? "윤년" : "평년";
		
		//bool = (year % 4 == 0) ? (year % 100 == 0? (year % 400 == 0? true : false) : true): false;
		
		System.out.printf("%d년 → %s\n",year,strResult);
		
	}
}

// 실행결과

/*
임의의 연도를 입력하세요 : 2024
2024년 → 윤년
계속하려면 아무 키나 누르십시오 . . .
*/
