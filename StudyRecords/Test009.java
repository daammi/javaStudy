
// ★ 변수와 자료형 ★
// → 변수와 자료형 실습 및 테스트 : double
// → 나눗셈 연산 실습

public class Test009
{
	public static void main(String[] args)
		{
			// 정수와 정수의 나눗셈
			// double a = 1 / 2;
			double a = 1 / 2f;
			
			System.out.println("double a : "+a);
			
			double b = (double)1 / 2;
			System.out.println("double b : "+b);
			
			double c = 1/2 + 1/2;
			// double c = 0 + 1/2;
			// double c = 0 + 0;
			// double c = 0;
			// double c = 0.0;
			System.out.println("double c : "+ c);
			
			// 피 연산자에 실수가 포함되어 있는 나눗셈 연산
			double d = 1 / 2.0;
			System.out.println("double d : "+ d);
			// 나눗셈 연산과 관련하여
			// 피연산자 중 실수가 하나라도 호함되어 있다면
			// 연산은 실수 기반의 안션이 수행되면
			// 결과값 또한 실수 형태로 반환된다.
			
			double e = 3/2 + 1/2;
			System.out.println("double e : " + e);
			// double e : 1.0
			
			double f = 3/2 + 1/2.0;
			// double f = 1 + 1/2.0;
			// double f = 1 + 0.5;
			// double f = 1.0 + 0.5;
			// double f = 1.5;
			
			System.out.println("double f : " + f);
			// double f : 1.5
		}
}