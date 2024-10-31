/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- switch 구문
===================================================*/
                               
// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
// 단, switch 문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 현태로 처리할 수 있도록 한다.
          
import java.util.Scanner;
            
public class Test042
{              
	public static void main(String[] args)
	{
		
		// 방법 ①
		
		/*
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		char op;
		
		System.out.print("첫 번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		num2 = sc.nextInt();
		System.out.print("연산자 입력 [+ - * /] : ");
		op = sc.next().charAt(0);
		
		switch(op)
			{
				case '43': System.out.printf("%d %c %d = % d\n", num1, op, num2, num1+num2); break;
				case '45': System.out.printf("%d %c %d = % d\n", num1, op, num2, num1-num2); break;	
				case '42': System.out.printf("%d %c %d = % d\n", num1, op, num2, num1*num2); break;
				case '47': System.out.printf("%d %c %d = % d\n", num1, op, num2, num1/num2); break;
				
				default: return; // return → 1. 값의 반환
								 //           2. 메소드 종료 → main() 메소드 종료 (WHY? main 안에서 return을 썼기 때문) → 프로그램 종료
		
			}
		*/
		
		// 방법 ②
		
		/*
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		char op;
		
		System.out.print("첫 번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		num2 = sc.nextInt();
		System.out.print("연산자 입력 [+ - * /] : ");
		op = sc.next().charAt(0);
		
		switch(op)
			{
				case '+': System.out.printf("%d %c %d = % d\n", num1, op, num2, num1+num2); break;
				case '-': System.out.printf("%d %c %d = % d\n", num1, op, num2, num1-num2); break;	
				case '*': System.out.printf("%d %c %d = % d\n", num1, op, num2, num1*num2); break;
				case '/': System.out.printf("%d %c %d = % d\n", num1, op, num2, num1/num2); break;
				
				default: return; // return → 1. 값의 반환
								 //           2. 메소드 종료 → main() 메소드 종료 (WHY? main 안에서 return을 썼기 때문) → 프로그램 종료
		
			}		
		*/
		
		// 방법 ③
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		String op;
		
		System.out.print("첫 번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		num2 = sc.nextInt();
		System.out.print("연산자 입력 [+ - * /] : ");
		op = sc.next();
		
		switch(op)
			{
				case "+": System.out.printf("%d %s %d = % d\n", num1, op, num2, num1+num2); break;
				case "-": System.out.printf("%d %s %d = % d\n", num1, op, num2, num1-num2); break;	
				case "*": System.out.printf("%d %s %d = % d\n", num1, op, num2, num1*num2); break;
				case "/": System.out.printf("%d %s %d = % d\n", num1, op, num2, num1/num2); break;
				
				default: return; // return → 1. 값의 반환
								 //           2. 메소드 종료 → main() 메소드 종료 (WHY? main 안에서 return을 썼기 때문) → 프로그램 종료
		
			}	
	}
}