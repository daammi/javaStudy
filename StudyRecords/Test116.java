/*================================================
■■■ 클래스 고급 ■■■
- 상속(Inheritance)
==================================================*/
/*
※ 『super』

	satatic 으로 선언되지 않은 메소드에서 사용되며
	현재 클래스가 상속받는 상위 클래스의 객체를 가리킨다.
	super 는 상위 클래스의 생성자를 호출하거나
	상위 클래스의 멤버 볌수 또는 메소드를 호출할 때 사용할 수 있다.
	
	하위 클래스의 생성자에서 상위 클래스의 생성자를 호출할 때에는
	하위 클래스의 생성자 정의 구문에서 맨 처음에만 위치할 수 있다.
	
 ※ 생성자와 클래스 상속간의 관계

	하위 클래스는 상위 클래스의 멤버를 상속받지만,
	생성자는 상속 대상에서 제외된다.
	그리고, 하위 클래스의 생성자가 호출될 때
	자동으로 상위 클래스의 생성자를 호출하게 된다.
	(해당 구문이 존재하지 않을 경우 자동 삽입)
	이 때, 상위 클래스의 생성자는 
	인수가 없는 생성자(default 생성자 형태)가 호출된다.
	
	상위 클래스 및 하위 클래스(즉, 상속 관계에 있는 클래스)를 설계하는 과정에서
	상위 클래스의 생성자를 정의하지(작성하지) 않거나
	인수가 없는 생성자만을 정의한(작성한) 경우
	명시적으로 하위 클래스에서 상위 클래스의 생성자를 호출하지 않아도
	아무런 문제가 발생하지 않지만,
	상위 클래스에 인자가 있는 생성자만 존재하는 경우
	주의해야 한다.
	
	예를 들어... 다음에는...

class Aclass
{
	Acalss(int n)
	{
	}
}

class Bclass extends Aclass
{
	Bclass()
	{
		// super;
	}	
}
 
하위 클래스인 Bclass 의 생성자에서
명시적으로 Aclass 의 생성자를 호출하지 않으면
자동으로 인자 없는 생성자를 호출한다.
하지만, Aclass 에는 인자가 있는 생성자만 존재하고
인자가 없는 생성자는 존재하지 않기 때문에 에러가 발생한다.
따라서 Bclass 생성자의 선두에
다음처럼 명시적으로 상위 클래스의 생성자 호출 구문을 작성해야한다.

class Aclass
{
	Acalss(int n)
	{
	}
}

class Bclass extens Aclass
{
	Bclass()
	{
		super(10);
		...
		...
	}
}

※ 상속 시 주의할 사항

	상위 클래스에서 선언된 멤버 변수의 이름과
	하위 클래스에서 선언된 멤버 변수의 이름이 같으면
	상위 클래스의 멤버 변수는 무시된다.
	이 때, 상위 클래스의 멤버 변수를 사용하기 위해서는
	『super』 키워드를 이용한다.
	
	동일한 이름의 멤버 변수나 동일한 이름의 메소드가
	한 클래스 안에 선언되거나 정의되는 경우 기본적으로 에러가 발생한다.
	단, 메소드의 경우에는 매개변수의 갯수나 타입이 다른 경우
	에러 발생하지 않고 이들을 서로 다른 메소드로 취급하는 문법이 지원된다.

*/



// Rect116 클래스와 Circle116 클래스의 부모 클래스
class SuperTest116
{
	protected double area;
	private String title;
	
	public SuperTest116()
	{
		System.out.println("SuperTest116... 인자 없는 생성자");
	}

public SuperTest116(String title)
	{
		this.title = title;
		System.out.println("SuperTest116... 문자열을 인자로 받는 생성자");
	}
public void write()
	{
		System.out.println(title + " - " + area);
	}

}

// SuperTest116 클래스를 상속받는 자식 클래스(단일 상속)
class Rect116 extends SuperTest116 //, SuperTest115  → 이런게 다중 상속 
{
/*	상속받은 값
	protected double area;  protected, default 클래스 내부에서는 접근 가능하지만 다른 클래스에서는 접근 불가. 동일한 패키지에서 접근 가능. 
							protected 는 상속 받은 클래스에서 접근 가능
	
	※ private 멤버는 접근 자체가 불가능 → 상속 불가
	private String title;   
	
	// ※ 생성자는 상속 대상에서 제외
	public SuperTest116()
	{+
		System.out.println("SuperTest116... 인자 없는 생성자");
	}
	// ※ 생성자는 상속 대상에서 제외
	public SuperTest116(String title)
	{
		this.title = title;
		System.out.println("SuperTest116... 문자열을 인자로 받는 생성자");
	}
	
	
	public void write()
	{
		System.out.println(title + " - " + area);
	}
*/
	private int w, h;
	
	// 자식 클래스의 사용자 정의 생성자
	public Rect116()
	{
		// 부모 클래스의 생성자 호출 구문 자동 삽입
		// super();		//--SumperTest116();
	}
	
	public void calc(int w, int h)
	{
		this.w = w;
		this.h = h;
		area = (double)this.w + this.h;
		write();
		
	}
	// 자바야~ 나 이거 물려받은거 의도적으로 튜닝한거다?
	@Override		// 어노테이션(annotation) = metadata - JDK 1.5 부터 지원
	public void write()
	{
		System.out.println("w : " + w + ", h : " + h);
		System.out.println("사각형 - " + area);
	}
	
	// ※ 메소드 재정의(Method Overriding)
	
	//	  상위 클래스를 상속받은 하위 클래스에서
	//	  상위 클래스에 정의된 메소드를 다시 정의하는 것으로(재정의)
	//    객체 지향 프로그래밍의 특징인 다형성을 나타낸다.
	//    재정의(Overriding)는 반드시 상속 관계에 있어야 하며,
	//    메소드 이름, 리턴 타입, 매개변수의 갯수나 타입이
	//    모두 완전히 일치해야 한다.
	
}

// SuperTest116 클래스를 상속받는 자식 클래스(단일 상속)
class Circle116 extends SuperTest116
{
	/*	상속받은 값
	protected double area;  protected, default 클래스 내부에서는 접근 가능하지만 다른 클래스에서는 접근 불가. 동일한 패키지에서 접근 가능. 
							protected 는 상속 받은 클래스에서 접근 가능
	
	※ private 멤버는 접근 자체가 불가능 → 상속 불가
	private String title;   
	
	// ※ 생성자는 상속 대상에서 제외
	public SuperTest116()
	{
		System.out.println("SuperTest116... 인자 없는 생성자");
	}
	// ※ 생성자는 상속 대상에서 제외
	public SuperTest116(String title)
	{
		this.title = title;
		System.out.println("SuperTest116... 문자열을 인자로 받는 생성자");
	}
	
	
	public void write()
	{
		System.out.println(title + " - " + area);
	}
*/
	public Circle116(String title)
	{
		super(title);
	}
	
	public void calc(int r)
	{
		area = r * r * 3.141592;
		write();
	}
}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test116
{
	public static void main(String[] args)
	{
		// Rect116 클래스(자식 클래스)기반 인스턴스 생성
		Rect116 ob1 = new Rect116();
		//--==>> SuperTest116... 인자 없는 생성자
		
		// Circle116 클래스(자식 클래스) 기반 인스턴스 생성
		// Circle116 ob2 = new Circle116();
		//--==>> 에러 발생(컴파일 에러)
		//		 constructor Circle116 in class Circle116 cannot be applied to given types;
		// 현재 Circle116 클래스에는
		// 매개 변수를 필요로 하는 사용자 정의 생성자가 만들어져 있으며
		// 이로인해 default 생성자가 자동으로 삽입되지 않는 상태
		 
		// Circle116 클래스(자식 클래스) 기반 인스턴스 생성
		Circle116 ob2 = new Circle116("원");
		//--==>> SuperTest116... 인자 없는 생성자
		
		// line 206 삽입 후...
		//--==>> SuperTest116... 문자열을 인자로 받는 생성자
		
		ob1.calc(10, 5);
		//--==>> w : 10, h : 5
		//		 사각형 - 15.0
		
		ob2.calc(20);
		//--==>> 원 - 1256.6368
		
	}
}

/*
==============================================================================================================================
상위 클래스  1| 하위 클래스 |			| 결과
-----------	-------------------------------------------------------------------------------------------------------------------
생성자를	  | 생성자 정의안함         | → 가능하다.
정의하지	  | 인수가 없는 생성자      | → 가능하다.
않음		  | 인가 있는 세상			| → 가능하다.
------------------------------------------------------------------------------------------------------------------------------
인수가		  | 생성자 정의안함			| → 가능하다.
없는		  | 인수가 없는 생성자		| → 가능하다.
생성자만 정의 | 인수가 있는 생성자		| → 가능하다.
------------------------------------------------------------------------------------------------------------------------------
인수가		  | 생성자 정의안함			| → 에러 발생
있는		  | 인수가 없는 생성자		| → 상위 클래스의 해당 생성자를 호출하지 않으면 에러 발생.
생성자만 정의 | 인수가 있는 생성자		| → 상위 클래스의 해당 생성자를 호출하지 않으면 에러 발생
==============================================================================================================================

*/