/*================================================
■■■ 클래스와 인스턴스 ■■■
- static 변수(클래스 변수)와 static 메소드(클래스 메소드)
===================================================*/

/*
	
  ※ 공유
  ※ 탄생 시점
 
  인스턴스 변수 vs 클래스 변수
  
  클래스명 ob = new 클래스명();
  ob.변수명 = 10;
  
  인스턴스 메소드 vs 클래스 메소드

  클래스명 ob = new 클래스명();
  ob.메소드명();


  클래스 변수 또는 클래스 메소드는
  클래스 정보가 로딩되는 순간 메모리 할당이 이루어지며
  클래스 이름 또는 객체(인스턴스)를 통해 접근할 수 있다.
  즉, new 연산자를 통해 메모리를 할당받지 않아도
  사용이 가능하다는 것이다.
  
*/

public class Test104
{
	static int a =10;		//-- static 변수(클래스 변수, class 변수, 정적 변수)
	
	int b= 20;				//-- non-static 변수(인스턴스 변수, instance 변수)
	
	void write()			//-- non-static 메소드(인스턴스 메소드, instance 메소드)
	{
		System.out.println("클래스 변수 a : "+a);
		System.out.println("인스턴스 변수 b : "+b);
	}
	
	static void print()     //-- static 메소드(클래스 메소드, class 메소드, 정적 메소드)
	{
		System.out.println("클래스 변수 a : "+a);
//		System.out.println("인스턴스 변수 b : "+b);		
//		-->> 에러 발생(컴파일 에러)
//		     non-static variable b cannot be referened from a static context
	}
	
	public static void main(String[] args)
	{
		System.out.println("main() → 클래스 변수 a : " + Test104.a);	
//		클래스 변수에 접근하기 위해서는
//		클래스명.변수명 의 형태로 클래스의 이름을 통해
//		접근하는 것이 가능하다.
//		main() → 클래스 변수 a : 10

		System.out.println("main() → 클래스 변수 a : " + a);
//		같은 클래스 내부에 존재하기 때문에
//		클래스의 이름을 생략하는 것이 가능하다.
//		main() → 클래스 변수 a : 10

		Test104.print();
		
		print();
//		클래스 메소드에서 클래스 메소드의 호출은 가능하며,
//		클래스명.메소드명() 의 형태로 접근하여 호출하는 것이 가능하다.
//		또한, 지금은 같은 클래스 내부에 존재하기 때문에
//		클래스의 이름을 생략한 경우에 해당한다.

//		System.out.println("main() → 인스턴스 변수 b : " + b);
//		에러 발생(컴파일 에러)
		
//		System.out.println("main() → 인스턴스 변수 b : " + Test104.b);
	
//		write();
//		
//		Test104.write();

//		Test104 클래스의 인스턴스 생성
		Test104 ob = new Test104();
		
		System.out.println("main() → 인스턴스 변수 b : " + ob.b);
		
		ob.write();
		
//		클래스 변수나 클래스 메소드는
//	    생성된 인스턴스명.변수명
//		생성된인스턴스명.메소드명()
//		의 형태로도 접근(호출)이 가능하지만
//		클래스명.변수명
//		클래스명.메소드명()
//		의 형태로 접근(호출)하는 것이 일반적이다.

		Test104 ob2 = new Test104();
		
		ob2.a = 10000;
		ob2.b = 20000;
		
		System.out.println("ob2 확인 -------------");
		ob2.write();
		
		System.out.println("ob 확인 --------------");
		ob.write();
		
	}
}