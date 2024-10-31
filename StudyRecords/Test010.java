
// ★ 변수와 자료형
//  
// Q. 사전에 부여된 반지름 정보를 통해
//	  원의 넓이와 둘레를 구하는 프로그램을 구현한다.
//    - 반지름 : 10

import java.util.*;

public class Test010
{
	public static void main(String[] args)
	{
		//내꺼
		/*
		double r =10;
		System.out.printf("넓이 : %f\n둘레 : %f\n", r*r*3.141592,2*3.141592*r);
		*/
		
		//짝꿍
		/*
		double pie = 3.141592;
		int r = 10;
		
		double a = r * r * pie;
		double b =
		*/
		
		// 주요 변수 선언
		int r = 10;
		final double PI = 3.141592;
		// 『final』 : 변수의 상수화
		// 이때, 불문율로 변수의 이름을 대문자로 변경!
		
		double area, length;
		
		
		// 연산 및 처리
		
		// 1. 넓이 연산
		area = r * r * PI;
		
		
		//2. 둘레 연산
		length = r * 2 * PI;
		
		
		// 결과 출력
		System.out.println("넓이는 "+ area);
		System.out.println("길이는 "+ length);
		
		
		
		
		
		/*
			넓이 : 314.159200
			둘레 : 62.831840
			계속하려면 아무 키나 누르십시오 . . .
		*/
		
	}
}

/*
	public class Test010
	{
	public static void main(String[] args)
	{
		double r;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력해주세요 : ");
		r = sc.nextDouble();
		
		System.out.printf("넓이 : %f\n둘레 : %f\n", r*r*3.141592,2*3.141592*r);
		
	}
}
*/