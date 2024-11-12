/* ====================================
  ���� �÷��� (Collection) ����
======================================*/

/*

�� Enumeration �� Iterator �������̽�

	Collection Framework ����
	Enumeration �� Iterator ��� �������̽��� �ִ�.
	�������� �ǹ̷δ� �ݺ�, ��ȯ �̶�� �ǹ̸� ������ ������
	� ��ü���� ������ ���� ��,
	�� ��ü���� � ������ ���� �ϳ��� �����Ͽ� ����ϱ� ����
	�������̽���� �� �� �ִ�.
	
	- java.util.Enumeration<E> �������̽�
	 : �� �������̽��� ���� �� ���� �޼ҵ常�� �����ϸ�
	 ��hasMoreElements()�� �޼ҵ带 ����
	 �������̽� �ȿ� ���� ��Ұ� �ִ����� ���� ���Ǹ� �Ѵ�.
	 ���� true �� ��ȯ�Ǿ��ٸ� ���� �ε����� ��Ұ� �����Ѵٴ� �ǹ��̸�
	 ��nextElement()���޼ҵ�� ���� ��ҿ� �����Ͽ� ����ϸ� �Ǵ� ���̴�.

	 ex) // v ��� ���� �ڷᱸ���� ����� ��� ��� ���
		 for (Enumeration e = v.elements(); e.hasMoreElements(); )
		 {
			 System.out.println(e.nextElement());
		 }

   - java.util.Iterator<E> �������̽�
     : Enumeration ���� �������� ���� ��remove()�� �޼ҵ尡 �߰��� �� ���̴�.
	   Iterator �� ������ �ִ� ��hasNext()���� ��next()�� �޼ҵ��
	   �̸��� �ణ �ٸ� �� Enumeration �������̽��� ������ �ִ� 
	   ��hasMoreElements()���� �׸��� ��nextElements()�� ��
	   ��Ȯ�� ��ġ�ϴ� ����� �����Ѵ�.
	   Enumeration ��� Iterator �� JDK 1.2 ���� �߰��Ͽ� ����ϰ� �� ������
	   Enumeration �������̽��� ���� ������ ��Ҹ� ������ ����� ���� ������
	   �̸� �����ϱ� ���� ���� ���� Iterator �������̽��̴�.

*/

import java.util.*;

public class Test170
{
	public static void main(String[] args)
	{
		Vector<String> v = new Vector<String>();
		
		v.add("java");
		v.add("oracle");
		v.add("jsp");
		v.add("servlet");
		v.add("spring");
		
		// �� Enumeration
		//    - hasMoreElements()
		//    - nextElement()
		Enumeration<String> e = v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println();
		
		System.out.println(v);
		
		System.out.println("------------------------------");
		
		// �� Iterator
		//    - hasNext()
		//    - next()
		Iterator<String> it = v.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();
		
	}
}