/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문(while문) 실습
===================================================*/

// 사용자로부터 임의의 두 정수를 입력받아
// 입력받은 두 정수 중
// 작은 수부터 큰 수 까지의 합을 구하여
// 결과를 출력하는 프로그램을 구현한다.

import java.util.Scanner;

public class Test055
{
	public static void main(String[] args)
	{
		/*
		Scanner sc = new Scanner(System.in);
		int n1, n2, min, max, sum=0;
		int i;
		
		System.out.print("첫 번째 정수 입력 : ");
		n1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		n2 = sc.nextInt();
		
		if(n1>=n2)
		{
			max = n1;
			i= min = n2;
		}
		else
		{
			max = n2;
			i = min = n1;
		}
			
		while(i<=max)
		{
			sum += i;
			i++;
		}

		System.out.printf(">> %d ~ %d 까지의 합 : %d\n", min, max, sum);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,sum=0;
				
		System.out.print("첫 번째 정수 입력 : ");
		n1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		n2 = sc.nextInt();
		
		// 작은 수가 n1으로 들어갈 수 있도록 하는 코드
		if(n1>=n2)
		{
			n1=n1^n2;
			n2=n2^n1;
			n1=n1^n2;
		}
		
		// 반복 연산을 수행하기 전에
		// 작은 수를 따로 저장하여 루프 변수로 활용한다
		int i = n1;
		
		while(i<=n2)
		{
			sum+=i;
			i++;
		}
		
		System.out.printf("%d ~ %d 까지의 합 %d\n", n1, n2, sum);
		
		
	}
}