 
// ★ 변수와 자료형 ★
// → 형 변환 / 접미사 활용

public class Test006
{
	public static void main(String[] args)
	{
		int a;
		a= 10;
		System.out.println("a의 결과 : " + a );
		// a의 결과 : 10
		
		int b = 20;
		System.out.println("b의 결과 : "+ b);
		// b의 결과 : 20
		
		short c;
		
		// 연산 및 처리(대입 연산)
		// c=a;
		// 자동형변환 안됨 직접해줘야함
		
		// 명시적인 형 변환(강제 형 변환)
		c = (short)a;
		// a가 가지고 있는 데이터를 short 형으로 형 변환을 수행한 후
		// 변수 c에 대입한다.
		
		// 00000000 00000000 00000000 00001010 
		//				   ↓ (형 변환)
		// 00000000 00001010
		
		System.out.println("c의 결과 : " + c);
		
		// 변수 선언 및 초기화
		// int d = 1000000000; → 백억을 먼저 int에 자동으로 담지 못함 (컴파일 에러)
		// long d = 1000000000; → 백억을 먼저 int에 자동으로 담지 못함 (컴파일 에러)
		
		long d =100000000000l; 
		// int형의 표현 범위는 -21억 ~ +21억이므로 
		// int의 표현 범위를 넘는다. 
		// 따라서 접미사 l을 붙혀줘야한다.
		
		// 결과 출력
		System.out.println("d의 결과 : " + d);
	
		// 변수 선언 및 초기화
		int e = 030;
		// 접두사 0이 붙어있으면 8진수로 표현
		
		// 결과 출력
		System.out.println("e의 결과 : "+ e);
		
		// 변수 선언 및 초기화
		int f = 0xa6;
		// 접두사 0이 붙어있으면 16진수로 표현
		
		// 결과 출력
		System.out.println("f의 결과 : "+f);
	
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		//                      a  b  c  d  e  f
	
		// 변수 선언 및 초기화
		float g =0.0f;
		// 접미사 f 안 붙히면 double에 자동으로 자리 잡으려할텐데
		// 이때문에 자동 형 변환 규칙에 위배
		
		System.out.println("g의 결과 : "+g);
		
		
	}
}