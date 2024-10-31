/*=====================================
■■■ 자바의 주요 클래스 ■■■
- Wrapper 클래스
=======================================*/

public class Test138
{

/*
	static void print(Object ob)
	{
		System.out.println(ob);
	}
*/
	
//	java.lang.number 클래스(추상 클래스)는
//	모든 숫자형 Wrapper 클래스의 부모 클래스이다.
//	b2,i2 자료형이 Number에 넘어오면서
//	내부적으로는 업캐스팅이 일어나게 된다.

	static void print(Number n)
	{
		System.out.println(n);
		
		if(n instanceof Integer)
		{
//			System.out.println(n + "은 integer 객체");
			System.out.println(n.intValue())
		}
		else if(n instanceof Byte)
		{
			System.out.println(n + "은 Byte 객체");
		}
	}
	
	
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;
		
		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		
//		System.out.println(b2);
//		System.out.println(i2);
		
		print(b2);
		print(i2);
	}
}