/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- if 문
- if ~ else 문 실습
===================================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		
		System.out.printf("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());
		
		if(num == 0)
			System.out.printf("%d → 영\n", num);
		else if(num%2==0 && num%3==0)
			System.out.printf("%d → 2와 3의 배수\n", num);
		else if(num%2 == 0)
			System.out.printf("%d → 2의 배수\n", num);
		else if(num%3 == 0)
			System.out.printf("%d → 3의 배수\n", num);
		// 실수!! if(num%2!=0 && num%3!=0) 조심!!
		else if(num%2!=0 || num%3!=0)
			System.out.printf("%d → 2와 3의 배수 아님\n", num);
		else
			System.out.printf("판정 불가 확인 필요\n");
	}
}