/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- switch 구문
===================================================*/

// 사용자로부터 1부터 3까지의 정수 중 하나를 입력받아
// 입력받은 정수만큼의 별문자(★)가 출력되는 프로그램을 작성한다.
// 방법은 두가지로 작성한다.

// ① switch 문의 일반 모델을 사용하여 구현한다.
// ② switch 문의 기본 모델을 사용하되,
//    break를 딱 한 번만 사용할 수 있도록 한다.

import java.util.Scanner;

public class Test041
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		String star = "입력오류!\n";
		
		System.out.print("임의의 정수 입력(1~3) : ");
		num = sc.nextInt();
		
		// 방법 ①
		
		/*
		switch(num)
		{	
			case 3: System.out.println("★ ★ ★ "); break;
			case 2: System.out.println("★ ★ "); break;
			case 1: System.out.println("★ "); break;
			
			default: System.out.print("입력오류!\n");
		}
		*/
		
		// 방법 ②
		
		switch(num)
		{
			case 3: System.out.print("★ ");
			case 2: System.out.print("★ "); 
			case 1: System.out.print("★ \n"); break;
			
			default: System.out.print("입력오류!\n");
		}
	}
}