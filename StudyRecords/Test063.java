/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문(for문) 실습
- 반복문의 중첩 구문을 활용한 구구단 출력
===================================================*/

// 웅~~~ 쑝쑝쑝~ 웅~~~ 쑝쑝쑝~

public class Test063
{
	public static void main(String[] args)
	{
		for(int i=2; i<10; i++)							//-- 아우터 루프
			{
				// 웅~~~~
				System.out.printf("===[%d단]===\n", i);
				
				for(int j=1; j<10; j++)					//-- 이너 루프
					// 쑝쑝쑝~
					System.out.printf("%d * %d = %2d\n", i, j, i*j);
				
				
				System.out.println();
			
			}
			
		
	}
}