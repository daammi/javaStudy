/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문(while문) 실습
===================================================*/

public class Test053
{
	public static void main(String[] args)
	{
		// 주요 변수 선언 및 초기화
		int i=0;
		int tot=1;
		
		
		// 연산 및 처리
		while(i<10){
			i++;
			tot*=i;	
		}
		
		
		// 결과 출력
		System.out.printf("연산 결과 : %d\n", tot);
	}
}