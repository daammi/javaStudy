/*================================================= 
■■■ 클래스와 인스턴스 ■■■ 
- 생성자(Constructor)
===================================================*/

public class Test080
{
	int x;
	
//		   ※ 생성자의 이름은 항상 예외없이 클래스의 이름과 동일해야 하며,
//			  필요할 경우 인수를 받아들이는 것도 가능하고
//			  같은 이름의 메소드를 정의하는 중복 정의가 가능하지만,
//			  리턴값은 가질 수 없다.
//		
//		   ※ 생성자는 일반 메소드처럼 호출될 수 없고
//			  new 연산자를 이용하여 객체를 생성하기 위해 호출되며,
//			  각 클래스의 인스턴스인 객체를 생성한 후에
//			  생성된 객체의 멤버를 초기화 시키는 작업을 수행하게 된다.
	
	// 기본 생성자
	Test080()
	{
//		※ 생성자를 정의하는 구문 내부에서 다른 생성자를 호출하는 것은 가능하다
//		   (다른 일반적인 메소드들처럼...)
//		   단, 생성자 내부에서 가장 먼저 실행되어야 한다.

		System.out.println("인자 없는 생성자");
		System.out.println("Test080이 갖고있는 x : " + x);
	}
	
//	※ this 키워드 == Test080
	
	// 매개변수를 가진 생성자
	Test080(int x)
	{
		this.x = x;
//		논리적인 해석 →  Test080.x (→ this 키워드가 포함된 클래스의 이름으로 치환~!!!)
		
		System.out.println("인자가 하나인 생성자");
		System.out.println("Test080이 갖고있는 x : " + this.x);
	}
	
	public static void main(String[] args)
	{
//		Test080 클래스 기반 인스턴스 생성
		Test080 ob1 = new Test080();
		Test080 ob2 = new Test080(10);
		
		System.out.println();
		System.out.println("main 에서 ob1.x : " + ob1.x);
		System.out.println("main 에서 ob2.x : " + ob2.x);
		System.out.println();
		
		
	}
}