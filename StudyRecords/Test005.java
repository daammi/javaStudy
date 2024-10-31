/*
 ★ 자바의 개요 및 특징 ★
 → 변수와 자료형
 → 키워드 및 식별자
 → printf()
*/
public class Test005
{
	public static void main(String[] args)
		{
			// 변수 선언(메모리 확보) 및 초기화(메모리에 값 할당)
			// int a=10;
			// int b=5;
			int a=10, b=5;
			
			// 변수만 동시 선언
			int c, d;
			
			// 연산 및 처리
			c = a + b; 
			d = a - b; 
			
			// 결과 출력
			System.out.println(a+" + "+b+" = "+c);
			
			// print() / println() / printf() / format()
			
			// 문자열 영역 안에서 사용되는 『"\n"』, 『"%n"』은 개행!
			System.out.print("1\n2\n3\n");
			
			// printf() / format()
			// JDK 1.5 부터 지원되는 메소드
			
			System.out.printf("%d * %d = %.1f\n", 10, 20, (double)200);
			System.out.printf("%d+%d=%.2f\n", a, b, (double)c);
			System.out.printf("%.0f / %.0f = %.2f%n", (double)19, (double)4, (double)19/4);
			
			// 10과 20 - 구문 작성
			System.out.printf("%d과 %d\n", 10, 20);
			
			// 10과 3.14 - 구문 작성
			// System.out.printf("%d과 %d\n", 10, 3.14);
			// --==>런타임 에러가 발생한다.
			System.out.printf("%d과 %f\n", 10, 3.14);
			
			// 『%d』는 정수형 서식 지정 옵션
			// 『%f』는 실수형 서식 지정 옵션
			
			System.out.printf("%d과 %.2f\n", 10, 3.14);
			
			System.out.printf("%.3f\n", 3.1415923);
			// 반올림 발생!
			
		}
}