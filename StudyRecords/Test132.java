/*=====================================
■■■ 자바의 주요 클래스 ■■■
- Object 클래스
=======================================*/

class Test
{
	private int a = 10;
	
	public void write()
	{
		System.out.println("a : " + a);
	}
}

public class Test132
{
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();
		
		System.out.println("10 == 9 : " + (10==9));
//		-->> false

		int a=10,b=10;	
		System.out.println("a == b : " + (a==b));
//		-->> true
		
//		※ == 비교 연산자는 피연산자의 크기를 비교하는 것을 확인할 수 있다.

		System.out.println("ob1 == ob2 : " + (ob1==ob2));
//		-->> ob1 == ob2 : false
		
//		※ 객체(Object)들을 비교하는 과정에서 사용되는 『==』 비교 연산자는
//		   대상 객체들의 크기를 비교하는 것이 아니라 주소를 비교한다.

		System.out.println("ob1            : " + ob1);
		System.out.println("ob1.toString() : " + ob1.toString());
		
		System.out.println("ob2            : " + ob2);
		System.out.println("ob2.toString() : " + ob2.toString());
		
//		『클래스명@해시코드』
//				   ---------
//				   자바 내부적으로 객체를 구분하기 위해 사용하는 것.
//			       메모리의 주소값으로 생각하면 절대로 안된다.
//		
//		※ 객체가 같으면 hashcode 가 같지만
//		   hashcode 가 같다고 같은 객체는 아니다~
	}
}
