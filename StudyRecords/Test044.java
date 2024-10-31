/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문 실습 및 관찰
===================================================*/

/*
○ 반복문의 개요

   주어진 조건이 참인 경우
   일정한 영역의 문장을 반복 수행하다가
   조건식이 거짓이 되는 순간이 오면,
   반복 수행을 중단하는 문장이다
   이러한 반복문에는 『while, do~while, for』 문 등이 있으며
   반복의 제어를 위해 『break』, 『continue』 문을
   사용하는 경우가 있다.
   
○ while 문

   조건식을 먼저 비교하여
   조건식의 처리 결과가 참인 경우, 특정 영역을 반복 수행하는 문장으로
   반복의 횟수가 정해져 있지 않은 경우나
   반복 횟수가 많은 경우 주로 사용한다.
   while 문은 조건이 맞지 않은 경우
   반복은 커녕 단 한 번도 실행되지 않을 수 있다.
*/
public class Test044
{
	public static void main(String[] args)
	{
		/*
		int n=0;
		
		while(n<=10)
		{
			System.out.println("n = " + n );
			n++;
		}
		*/
		
		/*
		int n=0;
		
		while(n<=10)
		{
			n++;
			System.out.println("n = " + n );
		}
		*/
	
		/*
		int n=0;
		
		while(n++<=10)
		{
			System.out.println("n = " + n );
		}
		*/
		
		/*
		int n=0;
		
		while(++n<=10)
		{
			System.out.println("n = " + n );
		}
		*/
		
		/*
		int n=0;
		
		while(n++<=10)
		{
			System.out.println("n = " + ++n );
		}
		*/
		
		/*	
		int n=1;
		
		while(n<10)
		{
			System.out.println("n = " + n );
			n++;
		}
		*/
		
		// 1 부터 100 까지의 합을 계산하여
		// 결과를 출력하는 프로그램을 구현한다.
		// 단, while 반복문을 활용한다.
		
		int n = 0, sum = 0;
		
		while(n<100)
		{	
			n ++;
			sum += n;
		}
		
		System.out.println(sum);
		
	}
}