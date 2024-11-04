/* ====================================
  ■■■ 컬렉션 (Collection) ■■■
======================================*/

// Vector v = new Vector();
//-- 비어있는 Vector 자료구조 v 생성

// Vector v = new Vector(8);
//-- 8개의 초기 element 를 가진 Vector 자료구조 v 생성
//   이 자료구조를 활용하는 과정에서
//   8개가 모두 채워지게 되면(모두 사용되어 모자라게 되면) 자동으로 확장된다.

// Vector v = new Vector(3, 5);
//-- 3개의 초기 elements 를 가진 Vector 자료구조 v 생성
//   이 자료구조를 활용하는 과정에서
//   3개가 모두 채워지게 되면(모두 사용되어 모자라게 되면) 자동으로 5개 증가(확장)된다.

// ※ 벡터는 데이터 요소로 정수형, 실수형, 문자열... 등을
//    담아내는 것이 가능하다. (→ 가능해졌다. Auto Boxing || Auto unBoxing)
//    → 데이터 안정성 확보 check~~!!!

import java.util.Vector;
import java.util.Iterator;

// MyVector 클래스 설계 → Vector 클래스 상속
class MyVector extends Vector<Object>
{
	// 생성자 → 사용자 정의 생성자
	MyVector(){
//		super();
//		→ Vector();
		super(1, 1);
//		→ Vector(1, 1);
//		첫 번째 인자 : 주어진 용량 (기본 size)
//		두 번째 인자 : 증가량 (증가 size)
	}
	
	void addInt(int i)
	{
		addElement(new Integer(i));		// vector에 일반 프리미티브 타입은 적재 불가 → 객체로!
	}

	void addFloat(float real)
	{
		addElement(new Float(real));
	}
	
	void addString(String s)
	{
		addElement(s);
	}

	void addCharArray(char[] a)
	{
		addElement(a);
	}
	
	void write()
	{
//		Iterator<Object> it = iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}

		Object o;
		int length = size();
		
		System.out.println("벡터 요소 개수 : " + length);
		
		for(int i=0;i<length; i++)
		{
			o = elementAt(i);
//			※ instanceof 연산자 check~
//			   처리해야 하는 대상의 객체 타입 확인

			if(o instanceof char[])
			{
/*
				System.out.print("문자배열 : ");
				
				char[] arr = (char[])o;
				
//					문자 배열의 각 요소에 따로 접근
				for(int n=0;n<5;n++)
				{
					System.out.print(arr[n] + " " );
				}
				System.out.println();
*/
				System.out.println("문자배열 : " + String.copyValueOf((char[])o));
			}
			else if (o instanceof String)
			{
				System.out.println("문자열 : " + o);
			}
			else if (o instanceof Integer)
			{
				System.out.println("정수형 : "+ o);
			}
			else if (o instanceof Float)
			{
				System.out.println("실수형 : "+ o);
			}
			else
				System.out.println("타입 확인 불가!!!!");
		}
	}	
}

public class Test165
{
	public static void main(String[] args)
	{
		MyVector v = new MyVector();
		
		int digit = 5;
		float real = 3.14f;
		String s = new String("안녕하세요");
		char[] letters = {'s','t','u','d','y'};
		
		v.addInt(digit);
		v.addFloat(real);
		v.addString(s);		
		v.addCharArray(letters);	
		
		v.write();
	}
}
