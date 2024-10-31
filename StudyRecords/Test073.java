/* ================================================
■■■ 지역변수와 전역변수 ■■■
=================================================== 

Test073.java 와 비교

*/

public class Test073
{
	// 클래스의 영역
	
	// 전역 변수 a 선언
	// 전역변수는 자동으로 0으로 초기화 지원
	int a;
	
	boolean b;
	char c;
	double d;
	
	public static void main(String[] args)
	{
		// 메소드의 영역
		
		// System.out.println("n : " + a);	
		// → 에러 발생(컴파일 에러)
		//	  non-static variable a cannot be referenced from a static context
		
		// Test073 클래스(설계도)를 기반으로 인스턴스(객체) 생성
		Test073 ob = new Test073();
		
		System.out.println("ob.a : " + ob.a);
		// →→ ob.a : 0
		System.out.println("ob.b : " + ob.b);
		System.out.println("ob.c : " + ob.c);
		System.out.println("ob.d : " + ob.d);
		// →→ ob.b : false
		//		ob.c :
		//		ob.d : 0.0
	}
}

