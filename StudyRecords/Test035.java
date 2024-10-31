/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- if 문
- if ~ else 문 실습
===================================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다,
// 단, if 조건문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 기반으로 처리될 수 있도록 한다.

import java.io.*;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		// 방법 ①
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2;
		char op;
		
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("첫 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력 [+ - * /] : ");
		op = System.in.read();	
		
		if(op == 43)
			System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
		else if(op == 45)
			System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		else if(op == 42)
			System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
		else if(op == 47)
			System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
		else
			System.out.printf("! 입력 오류 !\n");
		*/
		
		// 방법 ②
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2;
		char op;
		
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("첫 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력 [+ - * /] : ");
		op = (char)System.in.read();	
	 // op = (char)Integer.parseInt(br.readLine()); (X) 
		
		if(op == '+')
			System.out.printf("\n>> %d + %d = %d\n", num1, num2, num1+num2);
		else if(op == '-')
			System.out.printf("\n>> %d - %d = %d\n", num1, num2, num1-num2);
		else if(op == '*')
			System.out.printf("\n>> %d * %d = %d\n", num1, num2, num1*num2);
		else if(op == '/')
			System.out.printf("\n>> %d / %d = %d\n", num1, num2, num1/num2);
		else
			System.out.printf("! 입력 오류 !\n");
				
		*/
		
		// 방법 ③
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, result = 0;
		char op;
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();
		
		if(op == '+')
			result = a+b;
		else if(op == '-')
			result = a-b;
		else if(op == '*')
			result = a*b;
		else if(op == '/')
			result = a/b;	
		
		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);
		
	}
}