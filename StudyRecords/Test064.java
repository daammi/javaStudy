/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문(for문) 실습
- 반복문의 중첩 구문을 활용한 구구단 출력
===================================================*/

public class Test064
{
	public static void main(String[] args)
	{
	/*
		for(int i=1; i<10; i++)							//-- 아우터 루프
			{
				// 웅~~~~
				for(int j=2; j<=5; j++)	{				//-- 이너 루프
					// 쑝쑝쑝~
					System.out.printf("%d * %d = %2d ", j, i, i*j);
					
				}
				System.out.printf("\n");
			}
			
		System.out.println();							//-- 개행
		
		for(int i=1; i<10; i++)							//-- 아우터 루프
			{
				// 웅~~~~
				for(int j=6; j<=9; j++)	{				//-- 이너 루프
					// 쑝쑝쑝~
					System.out.printf("%d * %d = %2d ", j, i, i*j);
					
				}
				System.out.printf("\n");
			}			
		
		System.out.println();
	*/
		
		for(int i=0;i<=4;i+=4)
		{
			for(int j=1; j<10; j++)							//-- 아우터 루프
				{
					// 웅~~~~
					for(int k=2+i; k<=5+i; k++)				//-- 이너 루프
						// 쑝쑝쑝~
						System.out.printf("%d * %d = %2d  ", k, j, j*k);
					
					System.out.println();
				}
			System.out.println(); 
		}		
	}
}
