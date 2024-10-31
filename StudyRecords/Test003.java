/*
 ★ 자바의 개요 및 특징 ★
 → 변수와 자료형
*/
public class Test003
{
	public static void main(String[] args)
		{
			// 변수 선언
			int a;
			
			// 변수 a에 10 대입(변수 초기화)
			a = 23;
			
			// 변수 선언 및 초기화(선언과 대입을 한 번에 처리)
			int b = 51;
			
			// 변수 선언
		    int c;
			
			// 테스트 및 확인
			System.out.println(a);
			System.out.println(b);
			
			// 컴파일에러 != 런타임에러
			
			// 연산 및 처리 → 변수 a와 b의 값을 더하여 c에 대입
			c = a + b;
			
			System.out.println(c);
			
			// a b c 동시 출력
			// System.out.println(a b c);
			// -=> 컴파일 에러 발생
			
			System.out.println(a +" "+ b + " " + c);
			
			// 덧셈 연산자(+)
			// 피연산자 중 어느 하나라도 문자열 형태의 데이터가 존재한다면
			// 산술연산자로써의 기능을 수행하는 것이 아니라
			// 문자열 결합 연산자로써의 기능을 수행하게 된다.
			
			System.out.println("a의 값은 "+a+"입니다.");
			System.out.println("b의 값은 "+b+"입니다.");
			System.out.println("c의 값은 "+c+"입니다.");
			
			// + 연산자를 사용하는 과정에서
			// 피연산자 중 문자열이 포함되어 있을 경우
			// 문자열 결합 연산자로 활용되면
			// 처리의 최종 결과는 문자열 형태로 반환된다.
			
			// 추가 관찰
			System.out.println(1 + 2); // 산술연산자 + 이다.
			
			System.out.println("1" + 2); // 문자열결합연산자 + 이다.
			
			System.out.println("1 + 2"); // 
		}
}

// 실행 결과

/*

23
51
74
23 51 74
a의 값은 23입니다.
b의 값은 51입니다.
c의 값은 74입니다.
3
12
1 + 2
계속하려면 아무 키나 누르십시오 . . .

*/