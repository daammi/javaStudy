/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문(for문) 실습
===================================================*/

// 1부터 100까지의 정수 중에서
// 4의 배수만 출력하는 프로그램을 구현한다.
// for 문을 활용하며 한 줄에 5개씩만 출력할 수 있도록 한다.

public class Test062
{
	public static void main(String[] args)
	{
	/*
		for(int i=1;i<101;i++)
		{
			if(i%4==0)
				System.out.printf("%3d", i);
			if(i%(4*5)==0)
				System.out.printf("\n");
		}
	*/
		
		int cnt=0;
		
		for(int i=4;i<=100;i+=4){
			
			System.out.printf("%4d", i);
			cnt++;
			
			if(cnt%5==0)	
				System.out.printf("\n");			
		}
		
	}
}