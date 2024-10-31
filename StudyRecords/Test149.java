/*================================================
■■■ 자바의 주요(중요) 클래스 ■■■
- Calendar 클래스
==================================================*/

// 오늘을 기준으로 입력받는 날짜만큼 후의 연 월 일 요일을
// 확인하여 결과를 출력하는 프로그램을 구현한다.
// 
// 실행 예)
// 오늘 날짜: 2024-10-30 수요일
// 몇 일 후의 날짜를 확인하고자 하십니까? :

// ※ Calendar 와 관련한 API Document 참조~!!!
//    『add()』
//    : 현재 날짜를 기준으로 날 수 더하는 연산 메소드
//    → 『객체.add(Calendar.DATE, 날 수);』

// ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
// 문자열 반환. 지정한 형식대로. %t → 달력 객체 값
// String.format("%tF", 달력 객체);
// → 『년-월-일』 형태의 문자열 반환

// String.format("%tA", 달력객체);
// → 요일 형태의 문자열 반환
// ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
		

import java.util.*;
public class Test149
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		
		int y = cal.get(cal.YEAR);
		int m =	cal.get(cal.MONTH)+1;
		int d = cal.get(cal.DATE);
		String[] w = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		int day=cal.get(cal.DAY_OF_WEEK)-1;
		System.out.printf("오늘 날짜 : %tF %tA\n", cal,cal);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("며칠 후의 날짜를 확인하고자 하십니까? : ");
		int after = sc.nextInt();
		
		cal.add(cal.DATE,after);
		y = cal.get(cal.YEAR);
		m =	cal.get(cal.MONTH)+1;
		d = cal.get(cal.DATE);
		day=cal.get(cal.DAY_OF_WEEK)-1;
		System.out.println("=======================");
//		System.out.printf("%d일 후 : %d-%d-%d-%s\n",after,y,m,d,w[day] );
		System.out.printf("%d일 후 : %tF %tA\n",after,cal,cal);		
		System.out.println("=======================");
		
	}
}