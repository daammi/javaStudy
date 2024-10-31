/*=====================================
■■■ 자바의 주요 클래스 ■■■
- Wrapper 클래스
=======================================*/

// 추가 관찰

public class Test139
{
	public static void main(String[] args)
	{
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);		
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);		
	
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);		
		
		System.out.println("1 : " + (3.0/0));
		System.out.println("2 : " + (-3.0/0));
		
		System.out.println("3 : " + (3.0/0 == 3.0/0));
		System.out.println("4 : " + (3.0/0 == -3.0/0));	
		
		System.out.println("5 : " + Double.isInfinite(3.0/0));
		System.out.println("6 : " + Double.isInfinite(-3.0/0));
		
		System.out.println("7 : " + (0.0/0));
		System.out.println("8 : " + (3.0/0 + - 3.0/0));
		
		System.out.println("9 : " + (0.0/0 == 0.0/0));
		System.out.println("10 : " + (0.0/0 != 0.0/0));
		
		System.out.println("11 : " + Double.isNaN(0.0/0));
		System.out.println("12 : " + Double.isNaN(1.0+2.0));		
		
//		※ NaN(Not a Number)과 임의의 수를
//		   크기 비교를 수행하는 == 연산자를 통해 비교 연산을 수행하게 되면
//		   결과는 언제나 false를 반환한다.
	}
}