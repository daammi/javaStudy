/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문 실습 및 관찰
===================================================*/

public class Test047
{
	public static void main(String[] args)
	{
		// 주요 변수 선언 및 초기화
		int i, sum, odd, even; i=sum=odd=even=0;
		
		
		// 연산 및 처리
		while(i<=100)
		{
			if(i%2==0)
				even += i;
			else
				odd += i;
			
			sum +=i;
			
			i++; 
		}
		
		
		// 결과 출력
		System.out.println("1부터 100까지 정수의 합 : " + sum);
		System.out.println("1부터 100까지 짝수의 합 : " + even);
		System.out.println("1부터 100까지 홀수의 합 : " + odd);		
		
		
	}
}