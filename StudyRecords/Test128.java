/*=====================================
■■■ 클래스 고급 ■■■
- 중첩 클래스
=======================================*/

// outer 클래스
class InnerOuterTest
{
	static int a = 10;
	int b = 20;
	
	// inner 클래스
	class InnerNested
	{
		int c = 30;
		
		void write()
		{
			System.out.println("write()...inner");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);	
		}
	}
	
	void write()
	{
		System.out.println("write()...outer");
		
		InnerNested ob1 = new InnerNested();
		ob1.write();
	}
}
public class Test128
{
	public static void main(String[] args)
	{
		InnerOuterTest ob = new InnerOuterTest();
		ob.write();
		
//		InnerOuterTest.InnerNested ob2 = new InnerOuterTest.InnerNested(); // 컴파일 에러
//		※	중첩 내부 클래스(static 중첩 클래스)와는 달리
//			외부 클래스의 인스턴스를 사용하지 않고
//			단독으로 내부 클래스의 인스턴스를 생성하는 것은 불가능하다.
		InnerOuterTest.InnerNested ob5 = ob.new InnerNested();
		ob5.write();
		
//		outer클래스명.inner클래스명 참조변수명 = outer객체.new inner생성자();
	
//		cf) static 중첩 클래스
//		outer클래스명.inner클래스명 참조변수명 = new outer클래스명.inner생성자();
		
		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();
	}
}