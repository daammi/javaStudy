/*================================================
■■■ 클래스 고급 ■■■
- 상속(Inheritance)
==================================================*/

/*
※ 메소드 오버라이딩의 특징

    - 메소드 이름, 리턴타입, 파라미터 수나 타입이 완전히 일치해야 한다.
	- 반드시 상속 관계가 있어야 한다.
	- 재정의된 하위 클래스의 메소드 접근제어지시자는
	  상위 클래스의 메소드 접근제어지시자보다 범위가 크거나 같아야 한다.
	  예를 들어, 상위 클래스 메소드의 접근제어지시자가 protected 인 경우
	  하위 클래스가 이 메소드를 오버라이딩 하는 경우
	  접근제어지시자는 public 또는 protected 이어야 한다.
	- static, final, private 메소드는 오버라이딩할 수 없다.
	- Exception 의 추가가 불가능하다.
	  즉, 상위 메소드가 가지고 있는 기존 예외 사항에
	  새로운 Exception 을 추가하는 것은 불가능하다는 것이다.
*/
class SuperTest118
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;
	
	public void write()
	{
		System.out.println("Super write() 메소드 : "+ a + " : "+b+" : "+c);
	}
}

class SubTest118 extends SuperTest118
{
	protected int b = 100;
	int a = 10;
	public void print()
	{
		System.out.println("Sub print() 메소드 : "+b+" : "+c);
		
		System.out.println("Sub print() 메소드 : " + b);
		System.out.println("Sub print() 메소드 : " + this.b);
		System.out.println("Sub print() 메소드 : " + super.b);
		
		System.out.println("Sub print() 메소드 : " + c);
		System.out.println("Sub print() 메소드 : " + this.c);
		System.out.println("Sub print() 메소드 : " + super.c);
	}
	
	@Override
	public void write()
	{
		System.out.printf("%d : %d : %d \n",a,b,c);
	}
}

public class Test118 
{
	public static void main(String[] args)
	{
		SubTest118 ob = new SubTest118();
		ob.print();
		ob.write();
		
		System.out.println(((SuperTest118)ob).b);
		
		ob.write();
//		((SuperTest118).ob).write();
//      메소드는 슈퍼부름 안됨!!!!!!!!!!!!!!!!!!!

		
	}
}