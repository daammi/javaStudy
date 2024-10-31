/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- switch 구문
===================================================*/

/*
○ 다중 선택문이라 하며, switch 문 다음의 수식 값에 따라
   실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다.
   
○ 형식 및 구조
   switch (수식)
   {
		case 상수1: 문장1; [break;]
		case 상수2: case 상수3: 문장2; [break;]
				:
		[default : 문장 n+1; [break;]]
   }
   
   switch 문의 『수식』 과 case의 『상수』 는
   byte, short, int, long 형이어야 한다.
   + char
   + String
   
   case 문 뒤에 『break;』 가 없는 형태인 경우
   다음 case 문의 문장을 계속해서 수행하게 된다.		 (→ 기본 모델)
   『break;』 가 존재할 경우
   해당 지점에서 수행을 멈춘 후 switch 문을 빠져 나간다. (→ 일반 모델)
*/

import java.io.*;

public class Test040
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;				// 이름
		int kor, eng, mat, tot;		// 국어점수, 영어점수, 수학점수, 총점
		int avg;					// 평균
		
		char grade;					// 등급
		
		System.out.print("이름 입력 : ");
		name = br.readLine();
		
		System.out.print("국어점수 입력 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어점수 입력 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학점수 입력 : ");
		mat = Integer.parseInt(br.readLine());
		
		tot = kor + eng + mat;
		avg = tot / 3;
		
		switch(avg/10)
		{
			case 10: case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			
			default: grade = 'F'; break;
		}
		
		System.out.printf("%s님의 성적표입니다.\n총점 : %d, 평균 : %d, 성적 : %c \n", name, tot, avg, grade);
		
	}
}