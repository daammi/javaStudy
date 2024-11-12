/* ====================================
  ���� �÷��� (Collection) ����
======================================*/
 
// List �� Vector, ArrayList, LinkedList, ...
// ������ ����
// ���迭�� ����
// ���ߺ� ���


/*
(����ȭ�� �������� �ʴ´�. �񵿱�ȭ Ŭ�����̴�. �� �� ���� Vector�� �ٸ���.)
(��Ƽ ������ safe�ϰ� ����ؾ� �Ѵ� �� Vector, �׷��� ������ ArrayList)

�� ArrayList Ŭ���� �ڡڡ�


   - ArrayList �� Vector Ŭ������
     List �� ũ�� ������ ������ �迭�� ������ ������
	 �������� Vector Ŭ������ ��ü�� �⺻������ ����ȭ ������,
	 ArrayList �� �׷��� �ʴٴ� ���̴�.

   - �񵿱�ȭ �÷����� ����ȭ�� �÷��Ǻ��� �� ���� ������ �����ϸ�
     ��������� �÷����� ������ �ʿ䰡 ���� ���α׷������� 
	 �Ϲ������� ArrayList �� Vector ���� �� ��ȣ�ϸ�,
	 ArrayList �� ����ȭ�� ������� ���� Vector ó�� ���������ν�
 	 ������ ����ȭ�� ������ �δ��� ������ �ʱ� ������
	 Vector ���� �� ������ ����ȴ�.

   - null �� ������ ��� ��Ҹ� ����ϸ�
     List �������̽��� �����ϴ� �� �ܿ� ����Ʈ�� �ݳ��ϱ� ����
	 ���������� ���Ǵ� �迭�� ����� �����ϴ� �޼ҵ带 �����Ѵ�.
	 
*/

// List, Set, Map �� �������̽� �̹Ƿ� �ڷᱸ�� ���� �Ұ�.

import java.util.*;

public class Test171
{
	public static void main(String[] args)
	{
		// List �ڷᱸ�� list ����
		// ArrayList<String> list1 = new ArrayList<String>();
		// Vector<String> list1 = new Vector<String>();
//		List<String> list1 = new Vector<String>();		// ����
		List<String> list1 = new ArrayList<String>();	// ����
		
//		list1 �ڷᱸ���� ��� �߰�
//		 �� add()
		list1.add("�͸���Į��");
		list1.add("�߰�︲");
		list1.add("�뵵���ǻ����");
		
		
//		List �ڷᱸ�� list2 ����
//		List<String> list2 = new List<String>();
//		List<String> list2 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>(list1); // ����
		
		
//		list2 �ڷᱸ���� ��� �߰�
//		 �� add()
		list2.add("û��");
		list2.add("�β���");
		
		
//		List �ڷᱸ�� list3 ����
		List<String> list3 = new ArrayList<String>();
		
//		list3 �ڷᱸ���� list2 �� ��ü ��� �߰�
//		 �� addAll()
		list3.addAll(list2);
		
//		list3 �ڷᱸ���� "û��" �տ� "��ٿ�Ÿ��" �߰�
		list3.add(list3.indexOf("û��"), "��ٿ�Ÿ��");
		
//		��� �� ���� ������ Ȯ��
		System.out.println("----------------------");
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println("----------------------");
		
//		��� �� ListIterator �� Ȱ���Ͽ� ���(�� listIterator())
		ListIterator<String> li = list3.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();
		
//		��� �� ListIterator �� Ȱ���Ͽ� �������� ����
		while(li.hasPrevious())
		{
			System.out.print(li.previous() + " ");	
		}
		System.out.println();
		
	}
}