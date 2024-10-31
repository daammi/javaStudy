/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문(while문) 실습
===================================================*/

// 사용자로부터 임의의 정수를 입력받아
// 해당 값의 자릿수를 출력하는 프로그램을 구현한다.

import java.io.*;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*
		int n, len=1, m=1;
		
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		
		while (true)
		{	
			if(n/(m*=10) == 0)
				break;
			len++;
		}
		
		System.out.printf(">> %d의 자릿수는 %d\n", n, len);
*/

		int num;
		int len;
		int temp;
		
		temp=num;
		len=1;
		
		while(temp<0){
			temp/=10;
			len++;
		}
		System.out.printf(">> %d의 자릿수는 %d입니다.\n", num, len);

	}
}