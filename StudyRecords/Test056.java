/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문(while문) 실습
===================================================*/
		
// 과제)
// 사용자로부터 임의의 정수를 입력받아
// 1부터 입력받은 그 정수까지의
// 전체 합과, 짝수의 합과, 홀수의 합을
// 각각 결과값으로 출력하는 프로그램을 구현한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test056
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num, i=0;
		int odd=0, even=0, sum=0;
		
		// 『정수 입력』 알림 메세지
		System.out.print("임의의 정수 입력 : ");
		// 문자열을 정수로 변환하여 변수 내에 입력
		num = Integer.parseInt(br.readLine());
			
			
		// 반복문 연산 처리
		while(i<num){
			
			i++;
			
			if(i%2==0)
				even+=i;	// 짝수일때 짝수합에 더한다.
			else
				odd+=i;		// 홀수일때 홀수합에 더한다.
			
			sum+=i;			// 조건과 무관히 총합에 더한다.
		}
		
		
		// 결과 출력 메세지
		System.out.printf("1 ~ %d 까지 정수의 합 : %d\n",num,sum);
		System.out.printf("1 ~ %d 까지 홀수의 합 : %d\n",num,odd);
		System.out.printf("1 ~ %d 까지 짝수의 합 : %d\n",num,even);
				
	}
}

// 실행 결과

/*
	임의의 정수 입력 : 100
	1 ~ 100 까지 정수의 합 : 5050
	1 ~ 100 까지 홀수의 합 : 2500
	1 ~ 100 까지 짝수의 합 : 2550
	계속하려면 아무 키나 누르십시오 . . .
	
	임의의 정수 입력 : 586
	1 ~ 586 까지 정수의 합 : 171991
	1 ~ 586 까지 홀수의 합 : 85849
	1 ~ 586 까지 짝수의 합 : 86142
	계속하려면 아무 키나 누르십시오 . . .
*/