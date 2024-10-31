/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- if 문
- if ~ else 문 실습
===================================================*/

import java.util.Scanner;

public class Test037
{
	public static void main(String[] args)
	{
	  // 주요 변수 선언
	  Scanner sc = new Scanner(System.in);
	  int a, b, c, d, e; // 사용자로부터 입력받은 다섯 개의 정수를 담아둘 변수
	  int odd = 0, even = 0; // 홀,짝의 누적 합을 담아낼 변수 선언
	  
	  // ※ 누적합을 담아낼 변수 초기화!!!!!
	  
	  // 연산 및 처리
	  System.out.print("임의의 정수 5개 입력(공백 구분) : ");
	  a = sc.nextInt();
	  b = sc.nextInt();
	  c = sc.nextInt();
	  d = sc.nextInt();
	  e = sc.nextInt();
	  
	  
	  if(a%2 != 0)				// a가 홀수일때 odd를 a만큼 증가
		  odd += a;		
	  else if(a%2 == 0)			// a가 짝수일때 even을 a만큼 증가
		  even += a;
	  else
		  System.out.printf("오류 발생\n");
	  
	  if(b%2 != 0)
		  odd += b;
	  else if(b%2 == 0)
		  even += b;
	  else
		  System.out.printf("오류 발생\n");

	  if(c%2 != 0)
		  odd += c;
	  else if(c%2 == 0)
		  even += c;
	  else
		  System.out.printf("오류 발생\n");

	  if(d%2 != 0)
		  odd += d;
	  else if(d%2 == 0)
		  even += d;
	  else
		  System.out.printf("오류 발생\n");

	  if(e%2 != 0)
		  odd += e;
	  else if(e%2 == 0)
		  even += e;
	  else
		  System.out.printf("오류 발생\n");
	  
	  
	  // 결과 출력
	  System.out.printf("\n짝수의 합은 %d, 홀수의 합은 %d 입니다.\n\n", even, odd);
	  
	}
}

// 실행 결과

/*
임의의 정수 5개 입력(공백 구분) : 11 22 33 44 55

짝수의 합은 66, 홀수의 합은 99 입니다.

계속하려면 아무 키나 누르십시오 . . .
*/