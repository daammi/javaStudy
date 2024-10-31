/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문(while문) 실습
===================================================*/

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 소수인지 아닌지를 판별하여
// 결과를 출력하는 프로그램을 구현한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test054
{
	public static void main(String[] args) throws IOException
	{
	
		/*
		int num, i = 1, cnt = 0;
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.printf("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());
		
		while(i<num)
		{
			i++;
			
			if(num%i==0)
				cnt++;
		}
		
		if(cnt==1 || num != 1)
			System.out.printf(">> 소수\n");
		else
			System.out.printf(">> 소수x\n");
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num, i=2;

		String result="소수가 아닙니다";
		
		System.out.print("임의의 정수를 입력하시오 : ");
		num = Integer.parseInt(br.readLine());
		
		while(i<num)
		{
			
			if(num%i==0){
				System.out.printf("%d번째에 확인\n",i);
				break;
			}
			else
				result = "소수입니다.\n";
					
			i++;
		}
					
		System.out.printf(">> %d는(은) %s", num, result );			
	}
}