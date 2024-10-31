/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- if 문
- if ~ else 문 실습
===================================================*/

// 사용자로부터 임의의 정수 세 개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.

import java.io.*;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		
		// 방법 ①
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2 ,num3, temp;
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("세 번째 정수 입력 : ");
		num3 = Integer.parseInt(br.readLine());
		
		if(num2 >= num3){
			temp = num3;
			num3 = num2;
			num2 = temp;
		}
		if(num1 >= num2){
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		if(num2 >= num3){
			temp = num3;
			num3 = num2;
			num2 = temp;
		}
		
		System.out.printf("\n>> 정렬 결과 : %d ~ %d ~  %d\n", num1, num2, num3);
		*/
		
		
		// 방법 ②
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2 ,num3;
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("세 번째 정수 입력 : ");
		num3 = Integer.parseInt(br.readLine());
		
		if(num2 >= num3){
		num3 = num3^num2;
		num2 = num2^num3;
		num3 = num3^num2;
		}
		
		if(num1 >= num2){
		num1 = num1^num2;
		num2 = num2^num1;
		num1 = num1^num2;
		}
		
		if(num2 >= num3){
		num3 = num3^num2;
		num2 = num2^num3;
		num3 = num3^num2;
	    }		
			
				
		System.out.printf("\n>> 정렬 결과 : %d ~ %d ~ %d\n", num1, num2, num3);
	}
}




