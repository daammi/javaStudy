/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문(do~while문) 실습
===================================================*/

// 사용자로부터 원하는 단을 입력받아
// 해당 구구단을 출력하는 프로그램을 구현한다.
// 단, 1~ 9 단 사이의 수를 입력받은 상황이 아니라면
// 다시 받을 수 있도록 구현한다.

import java.util.Scanner;

public class Test060
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num, i=0;
		
		do
		{
			System.out.printf("원하는 단 입력 : ");
			num = sc.nextInt();
		}
		while (num<1||num>9);
		
		while(i<9){
			i++;
			System.out.printf("%d * %d = %d\n", num, i, num*i );
		}
	}
}