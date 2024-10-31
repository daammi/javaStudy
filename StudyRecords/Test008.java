// ★ 변수와 자료형 ★
// → 변수와 자료형 실습 및 테스트 : char

public class Test008
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		char ch1, ch2, ch3;
		String ch4;
		int num;
				
		// 연산 및 처리
		ch1 = 'A';
		ch2 = '\n';
		ch3 = '대';
		ch4 = "1234";
		   
		num = (int)ch1;
		// 명시적 형 변환(강제 형 변환)
		// num = ch1; -=> 자동 형 변환
		
		// 결과 출력
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		System.out.println("ch3 : "+ch3);
		System.out.println("ch4 : "+ch4);
		
		System.out.println("num : "+num);
		
		System.out.printf("num : %c 그리고 num : %d\n", num, num);
		// num : A 그리고 num : 65


	}
}