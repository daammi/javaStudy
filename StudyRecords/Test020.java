/* ================================================
■■■ 연산자(Operator) ■■■
- 산술 연산자
- BufferedReader
- printf()
===================================================*/


// 사용자로부터 임의의 정수를 두 번 입력받아
// 사칙 연산 및 나머지 연산을 수행하여
// 그 결과를 출력하는 프로그램을 구현한다.
// 단, 입력받는 과정은 BufferedReader 를 활용할 수 있도록 하고,
// 결과출력하는 과정은 printf() 메소드를 활용할 수 있도록 한다.
// 또한, 나눗셈 연산은 편의상 정수 기반(몫을 취하는 형태)으로 처리한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test020
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		int n1, n2;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		// 연산 및 처리
		System.out.printf("첫번째 정수 입력 : ");
	    n1 = Integer.parseInt(br.readLine());
		System.out.printf("두번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());
		
		
		// 결과 출력
		System.out.printf("\n====== 결과 ======\n");
		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
		System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
		System.out.printf("%d * %d = %d\n", n1, n2, n1 * n2);
		System.out.printf("%d / %d = %.2f\n", n1, n2, (double)n1 / n2);
		System.out.printf("%d %% %d = %d\n", n1, n2, n1 % n2);
		
		/*
		
		// 주요 변수 선언
		int n1, n2;
		int res1, res2, res3, res4, res5;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		// 연산 및 처리
		System.out.printf("첫번째 정수 입력 : ");
	    n1 = Integer.parseInt(br.readLine());
		System.out.printf("두번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());
		
		res1 = n1 + n2;
		res2 = n1 - n2;
		res3 = n1 * n2;
		res4 = n1 / n2;
		res5 = n1 % n2;
		
		// 결과 출력
		System.out.printf("\n====== 결과 ======\n");
		System.out.printf("%d + %d = %d\n", n1, n2, res1);
		System.out.printf("%d - %d = %d\n", n1, n2, res2);
		System.out.printf("%d * %d = %d\n", n1, n2, res3);
		System.out.printf("%d / %d = %d\n", n1, n2, res4);
		System.out.printf("%d %% %d = %d\n", n1, n2, res5);
		System.out.printf("\n==================\n");
		 
		*/
		
	}
}