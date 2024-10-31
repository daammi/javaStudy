/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문(while문) 실습
===================================================*/

public class Test051
{
	public static void main(String[] args)
	{
		
		int i=0, sum=0;
		
		while(i<10)
		{
			i++;
			
			if(i%2==0)
				sum -=i;
			else
				sum +=i;			
			
		}
		
		System.out.println("연산결과 : " + sum);
				
	}
}