/* ======================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=========================================================*/

/*
	�� ť(Queue) (- �������̽� �̴�.)

	ť(Queue)�� ���Լ����� FIFO(First Input, First Output) ������
	���� �Էµ� �ڷḦ ���� ����ϸ� 
	Queue �������̽��� ������ Ŭ������ ť�� ������ �پ��� ����� �����Ѵ�.

	�� Queue �������̽� �ν��Ͻ��� �����ϱ� ���ؼ���
	new �����ڸ� �̿��Ͽ� Queue �������̽��� ������(implements)
	Ŭ������ �����ڸ� ȣ���Ѵ�.

	   ex) Queue ob = new LinkedList(); // �� ĳ����~~~~

	-----
	   �� �� head ���
	-----
	(head ��� : �ⱸ �ٷ� ������ ��Ҹ� �ǹ�)

	�� �ֿ� �޼ҵ�

	- boolean offer(E o)
	 ������ ��Ҹ� ť�� �����ϰ� ���� ������ true, ���н� false

	- E element()
	 ť�� head ��Ҹ� ��ȯ�ϸ� �������� �ʴ´�.

	- E peek()
	 ť�� head ��Ҹ� ��ȯ�ϰ� �������� ������
	 ť �ڷᱸ���� empty �� ��� null �� ��ȯ�Ѵ�.

	- E poll()
	 ť�� head ��Ҹ� ��ȯ�ϰ� �����ϸ�
	 ť �ڷᱸ���� empty �� ��� null �� ��ȯ�Ѵ�.

	- E remove()
	 ť�� head ��Ҹ� ��ȯ�ϰ� �����Ѵ�.
*/

import java.util.*;

public class Test162
{
	public static void main(String[] args)
	{
//		Queue �ڷᱸ�� ����
		Queue<Object> myQue = new LinkedList<Object>(); // Queue �� �������̽� �̹Ƿ� ��ĳ������ ���� ��ü ����!
	
		String str1 = "������";
		String str2 = "���¿�";
		String str3 = "�Ӽ���";
		String str4 = "������";		
		
//		myQue ��� Queue �ڷᱸ���� ������ �߰�
//		�� offer()
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		boolean test = myQue.offer(str4);
//		�׽�Ʈ(Ȯ��)
		System.out.println(test);
//		-->> test : true
		
//		�׽�Ʈ(Ȯ��)
		System.out.println(myQue);
//		-->> [������, ���¿�, �Ӽ���, ������] : ���� ������!! (Ȯ�ο� ������)

		System.out.println("��1 : " + (String)myQue.element());
		System.out.println("��2 : " + (String)myQue.element());
		System.out.println("��3 : " + (String)myQue.element());		
//		Queue �ڷᱸ�� myQue ����
//		��Ҹ� �������� �����鼭 head ��� ��ȯ
	
		System.out.println();
		
		String val;
/*	
//		��
//		peek()
//		ť�� head ��� ��ȯ. ���� ����.
//		ť�� empty �� ��� null �� ��ȯ.
		while(myQue.peek() != null)
		{
//			poll()
//			ť�� head ��� ��ȯ. ������.
//			ť�� empty �� ��� null �� ��ȯ.
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		System.out.println();
*/
/*
		while(myQue.poll() != null)
		{
//			poll()
//			ť�� head ��� ��ȯ. ������.
//			ť�� empty �� ��� null �� ��ȯ.
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		System.out.println();
*/
//		��
		while(true)
		{
			val = (String)myQue.poll();
			
			if(val==null)
				break;
			else
				System.out.println("��� : " + val);

		}

	}
}