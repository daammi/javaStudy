/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문(while문) 실습
===================================================*/

// 1 + (1 + 2) + (1 + 2 + 3) + ....+ (1 + 2 + 3 ....+ 10)

public class Test049
{
	public static void main(String[] args)
	{
		int i=0, temp=0;
		int sum=0;
		
		while(i<10)
		{
			i++; 
			
			temp += i;
			
			sum += temp;
			                               
		}
		
		System.out.println("연산 결과 : " + sum);
	}
}