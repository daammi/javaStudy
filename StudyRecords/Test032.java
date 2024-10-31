/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- if 문
- if ~ else 문 실습
=================================================== */

// Test031 → 홀수, 짝수 구분 → 단일 if 구문

// 홀수, 짝수, 영 → if ~ else 문 중첩

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		
		System.out.printf("임의의 정수를 입력하시오 : ");
		num = Integer.parseInt(br.readLine());
		
		/*
		if(num % 2 == 0 && num != 0)
			System.out.printf("입력하신 %d는(은) 짝수 입니다.\n", num);
		else if(num != 0 && num % 2 != 0)
			System.out.printf("입력하신 %d는(은) 홀수 입니다.\n", num);
		else
			System.out.printf("입력하신 %d는(은) 숫자 영입니다.\n", num);
		*/
		
		if(num == 0)
			System.out.printf("입력하신 %d는(은) 숫자 영입니다.\n", num);
		else if(num % 2 != 0)
			System.out.printf("입력하신 %d는(은) 홀수 입니다.\n", num);
		else
			System.out.printf("입력하신 %d는(은) 짝수 입니다.\n", num);
		
	}
}