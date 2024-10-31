/*================================================
■■■ 자바의 주요(중요) 클래스 ■■■
- Calendar 클래스
==================================================*/
/*

※ Calendar 클래스는 추상 클래스이기 때문에 객체를 생성할 수 없다.
   (추상 클래스 : 미완성된 클래스 즉, 완성되지 않은 설계도)

   Calendar ob = new Calendar();
   → 이와 같은 구문을 통해 인스턴스 생성 불가.


○ Calendar 클래스 객체(인스턴스)를 생성할 수 있는 방법

   1. Calendar ob1 = Calendar.getInstance(); 
      ▶ 『Calendar 인스턴스를 반환하는 getInstance() static 메소드로 Calendar 객체생성』
   
   2. Calendar ob2 = new GregorianCalendar();
      -------            ------------------  → 자식 클래스의 인스턴스    → 업 캐스팅!!!
        → 부모 클래스 참조 변수

	// GregorianCalendar gc = new GregorianCalendar();
	// Calendar ob2 = gc;
	// Calendar ob2 = (Calendar)gc;			
	  ▶ 『자식 클래스 GregorianCalendar의 업캐스팅으로 Calendar 객체생성』

   3. GregorianCalendar ob3 = new GregorianCalendar();
     (※ GregorianCalendar : Calendar 클래스의 하위 클래스)
	  ▶ 『자식 클래스의 인스턴스를 생성하면, 그 안에 부모 클래스의 인스턴스가 포함되어 있으므로』


*/

// 연, 월, 일, 요일을 Calendar 객체로부터 가져와 출력

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test147
{
	public static void main(String[] args)
	{
//		Calendar 인스턴스 생성
		Calendar rightNow = Calendar.getInstance();
		
//		생성된 달력(rightNow) 인스턴스를 통해
//		날짜 관련 정보를 얻어낼 수 있는 메소드
//      → get()
		
		int y = rightNow.get(Calendar.YEAR);
		System.out.println("y : " + y);
	
		int m = rightNow.get(Calendar.MONTH) + 1;  // 월이 배열에 있어요!!!
		System.out.println("m : " + m);
			
		int d = rightNow.get(Calendar.DATE);
		System.out.println("d : " + d);

		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("w : " + w);

		
//		테스트(확인)

//		System.out.println(Calendar.SUNDAY);		//--==>> 1 → 일요일
//		System.out.println(Calendar.MONDAY);		//--==>> 2 → 월요일
//		System.out.println(Calendar.TUESDAY);		//--==>> 3 → 화요일
//		System.out.println(Calendar.WEDNESDAY);		//--==>> 4 → 수요일
//		System.out.println(Calendar.THURSDAY);		//--==>> 5 → 목요일
//		System.out.println(Calendar.FRIDAY);		//--==>> 6 → 금요일
//		System.out.println(Calendar.SATURDAY);		//--==>> 7 → 토요일

		String week="";
		
		switch (w)
		{
			case 1 : week = "일요일"; break;
			case 2 : week = "월요일"; break;
			case 3 : week = "화요일"; break;
			case 4 : week = "수요일"; break;
			case 5 : week = "목요일"; break;
			case 6 : week = "금요일"; break;
			case 7 : week = "토요일"; break;
		}

		System.out.println(y + "-" + m + "-" + d + " " + week);

		Calendar rightNow2 = new GregorianCalendar();
		
		String[] week2 = {"일","월","화","수","목","금","토"};
		
//		달력의 날짜를 세팅
//		→ set() 메소드 활용

		rightNow2.set(2025, 3, 22);       // 월이 배열에 있어서 -1 해줘야제!!!
		
		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		
	}
}