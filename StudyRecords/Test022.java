/* ================================================
■■■ 연산자(Operator) ■■■
- 비트 단위 연산자
===================================================*/
public class Test022
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		int a = 13, b = 7;
		int c, d, e;
		
		
		// 연산 및 처리
		c = a & b;
		d = a | b;
		e = a ^ b;
		
		// 결과 출력
		System.out.printf("a & b : %d\n", c);
		System.out.printf("a | b : %d\n", d);
		System.out.printf("a ^ b : %d\n", e);
		
		
	}
}

// 실행 결과

/*

a [00001101] & b [00000111] : 5 [00000101]

a [00001101] | b [00000111] : 15 [00001111]

a [00001101] ^ b [00000111] : 10 [00001010]

*/