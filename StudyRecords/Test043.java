/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- switch 구문
===================================================*/

// 사용자로부터 임의의 연도와 월을 입력받아
// 해당 월의 마지막 날짜를 확인할 수 있는 프로그램을 구현한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test043
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int year, month, day;
		
		System.out.print("임의의 연도를 입력하세요 : ");
		year = Integer.parseInt(br.readLine());
		System.out.print("임의의 월을 입력하세요 : ");
		month = Integer.parseInt(br.readLine());
		
		// 방법 ①
		
		/*
		if(year % 2 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			switch(month)
				{
					case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31 break;
					case 4: case 6: case 9: case 11: day = 30; break;
					default: day = 29;
				}		
		}
		else
		{
			switch(month)
				{
					case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31 break;
					case 4: case 6: case 9: case 11: day = 30; break;
					default: day = 28;
				}		
		}
		
		System.out.printf(">> %d년 %d월은 %d일까지 있습니다.\n", year,month,day);
		
		*/
		
		// 방법 ②
		
		switch(month)
		{
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31; break;
			case 4: case 6: case 9: case 11: day = 30; break;
			default: 
				if(year % 2 == 0 && year % 100 != 0 || year % 400 == 0)
				{ day = 29; }
				else
				{ day = 28; }
		}
		
		System.out.printf(">> %d년 %d월은 %d일까지 있습니다.\n", year,month,day);
				
	}
}