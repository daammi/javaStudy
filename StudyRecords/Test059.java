/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문(do~while문) 실습
===================================================*/

// 사용자로부터 여러 개의 양의 정수를 입력받고
// 그 합을 계산하여 출력하는 프로그램을 작성한다.
// 단, 사용자가 -1 을 입력하는 순간
// 더 이상의 입력 반복 행위를 중단하고
// 그 동안 입력된 정수의 합을 출력해주는 프로그램을 구현한다.
// 즉, -1 을 입력 중지 커맨드로 활용한다. do~while을 쓸 것!!

import java.io.*;

public class Test059
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num, sum=1, i=0;
		
		do
		{
			i++;
			System.out.printf("%d번째 정수 입력(-1 종료) : ", i);
			num = Integer.parseInt(br.readLine());
			sum += num;
		}
		while (num!=-1);
		
		System.out.println(">> 현재까지 입력된 정수의 합 : " + sum);
		
	}
}