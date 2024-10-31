/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문 실습 및 관찰
===================================================*/

public class Test046
{
	public static void main(String[] args)
	{
		// 주요 변수 선언 및 초기화
		int n = 0, even = 0, odd = 0;
		
		
		// 연산 및 처리
		while(n<100)
			{	
				n++;
				
				if(n%2==0)
					even += n;
				else if(n%2!=0)
					odd += n;
				else
				{
					System.out.println("판별 불가 데이터 !!!");
					return;
				}
			}

		
		// 결과 출력
		System.out.println("짝수의 합 : " + even);
		System.out.println("홀수의 합 : " + odd);
		
		
	}
}