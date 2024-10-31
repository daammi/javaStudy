/*=====================================
■■■ 클래스 고급 ■■■
- 인터페이스(Interface)
=======================================*/

interface ADemo
{
	public void write();
}

interface BDemo
{
	public void print();
}

class DemoImpl implements ADemo, BDemo
{
//	JDK 1.5 에서는 인터페이스 메소드를
//	오버라이딩 할 때
//	@Override 어노테이션을 사용할 수 없다.
//	JDK 1.6 이후부터 적용 가능한 문법이다.
//	단, 상속받은 클래스의 메소드를 오버라이딩 할 때에는
//	JDK 1.5 에서도 @Override 어노테이션 사용이 가능하다.
	@Override
	public void write()
	{
		System.out.println("아아아아아");
	}
	
	@Override
	public void print()
	{
		System.out.println("아아아아아");
	}
}
public class Test122
{
	public static void main(String[] args)
	{
		DemoImpl ob = new DemoImpl();
		ob.write();
		ob.print();
		
		ADemo ob2 = new DemoImpl();
		BDemo ob3 = new DemoImpl();
		
//		ob2.print();		// 에러 발생

		((BDemo)ob2).print();
		((ADemo)ob3).write();
//      DemoImpl 클래스가 두 인터페이스를 모두 구현했기 때문에
//      이와 같은 처리가 가능하다.
//	    만약, DemoImpl 클래스가 두 인터페이스들 중 한 인터페이스만 구현했다면
//		이 구문은 런타임 에러가 발생하는 구문이 된다.
		
	}
}