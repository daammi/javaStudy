/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문(while문) 실습
===================================================*/

// 사용자로부터 원하는 단을 입력받아
// 해당 구구단을 출력하는 프로그램을 구현한다.
// 단, 1~9단 사이의 수를 입력받은 상황이 아니라면
// 이에 대한 안내를 한 후 프록램을 종료할 수 있도록 처리한다.

import java.io.*;

public class Test057
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num,i=0;
			
		System.out.print("원하는 단 입력 : ");
		num = Integer.parseInt(br.readLine());
		
		if(num>=1 && num<=9)
		{
			while(i<9)
			{
				i++;
				System.out.printf("%d * %d = %d\n", num, i,num*i);
			}
		}
		else
		{
				System.out.printf("1 부터 9 까지의 정수만 입력이 가능합니다.\n");
				return;
		}	
	}
		
}
