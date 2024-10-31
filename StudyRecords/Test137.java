/*=====================================
■■■ 자바의 주요 클래스 ■■■
- BigDecimal 클래스
=======================================*/

import java.math.BigDecimal;

public class Test137
{
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("123456789.123456789");
		
//		movePointLeft() : 소수점을 왼쪽으로 이동
		BigDecimal b = a.movePointLeft(3);
		System.out.println("처리 결과 : " + b);

//		나눗셈 연산
		BigDecimal c = a.divide(b);
		System.out.println("처리 결과 : " + c);
		
		BigDecimal d = a.divide(b, BigDecimal.ROUND_DOWN); //-- 반올림 하지 않는다. 절삭!
		System.out.println("처리 결과 : " + d);
	
//		BigInteger 객체로 변환
		System.out.println(a.toBigInteger());
	}
}
