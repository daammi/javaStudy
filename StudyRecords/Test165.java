/* ====================================
  ���� �÷��� (Collection) ����
======================================*/

// Vector v = new Vector();
//-- ����ִ� Vector �ڷᱸ�� v ����

// Vector v = new Vector(8);
//-- 8���� �ʱ� element �� ���� Vector �ڷᱸ�� v ����
//   �� �ڷᱸ���� Ȱ���ϴ� ��������
//   8���� ��� ä������ �Ǹ�(��� ���Ǿ� ���ڶ�� �Ǹ�) �ڵ����� Ȯ��ȴ�.

// Vector v = new Vector(3, 5);
//-- 3���� �ʱ� elements �� ���� Vector �ڷᱸ�� v ����
//   �� �ڷᱸ���� Ȱ���ϴ� ��������
//   3���� ��� ä������ �Ǹ�(��� ���Ǿ� ���ڶ�� �Ǹ�) �ڵ����� 5�� ����(Ȯ��)�ȴ�.

// �� ���ʹ� ������ ��ҷ� ������, �Ǽ���, ���ڿ�... ����
//    ��Ƴ��� ���� �����ϴ�. (�� ����������. Auto Boxing || Auto unBoxing)
//    �� ������ ������ Ȯ�� check~~!!!

import java.util.Vector;
import java.util.Iterator;

// MyVector Ŭ���� ���� �� Vector Ŭ���� ���
class MyVector extends Vector<Object>
{
	// ������ �� ����� ���� ������
	MyVector(){
//		super();
//		�� Vector();
		super(1, 1);
//		�� Vector(1, 1);
//		ù ��° ���� : �־��� �뷮 (�⺻ size)
//		�� ��° ���� : ������ (���� size)
	}
	
	void addInt(int i)
	{
		addElement(new Integer(i));		// vector�� �Ϲ� ������Ƽ�� Ÿ���� ���� �Ұ� �� ��ü��!
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
		
		System.out.println("���� ��� ���� : " + length);
		
		for(int i=0;i<length; i++)
		{
			o = elementAt(i);
//			�� instanceof ������ check~
//			   ó���ؾ� �ϴ� ����� ��ü Ÿ�� Ȯ��

			if(o instanceof char[])
			{
/*
				System.out.print("���ڹ迭 : ");
				
				char[] arr = (char[])o;
				
//					���� �迭�� �� ��ҿ� ���� ����
				for(int n=0;n<5;n++)
				{
					System.out.print(arr[n] + " " );
				}
				System.out.println();
*/
				System.out.println("���ڹ迭 : " + String.copyValueOf((char[])o));
			}
			else if (o instanceof String)
			{
				System.out.println("���ڿ� : " + o);
			}
			else if (o instanceof Integer)
			{
				System.out.println("������ : "+ o);
			}
			else if (o instanceof Float)
			{
				System.out.println("�Ǽ��� : "+ o);
			}
			else
				System.out.println("Ÿ�� Ȯ�� �Ұ�!!!!");
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
		String s = new String("�ȳ��ϼ���");
		char[] letters = {'s','t','u','d','y'};
		
		v.addInt(digit);
		v.addFloat(real);
		v.addString(s);		
		v.addCharArray(letters);	
		
		v.write();
	}
}
