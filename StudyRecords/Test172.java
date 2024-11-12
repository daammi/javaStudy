/* ====================================
  ���� �÷��� (Collection) ����
======================================*/

/*
�� List
   - ������ ����, �迭�� ����, �ߺ��� ���
   - �ֿ� ���� Ŭ����
     ��Vector (����ȭ ����)
	 ��ArrayList (����ȭ ���� ����)
	 ��LinkedList (ü��, ��ũ, ����, ť)


*/

import java.util.*;

public class Test172
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		
		list.add("����");
		list.add("�λ�");
		list.add("��õ");
		list.add("�뱸");
		list.add("����");
		list.add("����");
		list.add("���");
		list.add("����");
		
		System.out.println(list); // ���� �c!!!
		
		System.out.println("��ü ���� : " + list.size());
		
		// ù ��° ��Ҹ� ���
		System.out.println("ù��° ��Ҹ� ��� : " + list.get(0));
		

		// ������ ��Ҹ� ���
		System.out.println("������ ��Ҹ� ��� : " + list.get(list.size()-1));	
		
		// ó�� ��ġ�� �ѱ� �߰�
		list.add(0, "�ѱ�");
		
		System.out.println(list);
		System.out.println("��ü ���� : " + list.size());
		
		// ó�� ��ġ�� �����͸� ���ѹα� ���� ����
		list.set(0, "���ѹα�");
		
		System.out.println(list);
		System.out.println("��ü ���� : " + list.size());
		
		// "����" ����� ���翩�� Ȯ��
		if(list.contains("����"))
		{
			System.out.println("������ �����մϴ�.");
		}
		System.out.println();
	
		// ������ �� ��° �ε����� ��ġ�ϴ��� Ȯ��
		int n = list.indexOf("����");
		System.out.println("������ �ε��� : " + n );
	
		// ���ѹα� �����
//		list.remove("���ѹα�");
		list.remove(0);
		
		System.out.println(list);
		
		// list �� ��ü ��� ���
		System.out.print("��ü ���...�� : ");
		for(int idx=0;idx<list.size();idx++)
		{
			System.out.print(list.get(idx) + " " );
		}
		System.out.println();
		
		// list �� ��ü ��� ���
		System.out.print("��ü ���...�� : ");
		for(String str : list)
		{
			System.out.print(str + " " );
		}
		System.out.println();
		
		// list �� ��ü ��� ���
		System.out.print("��ü ���...�� : ");
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			String str = it.next();
			System.out.print(str + " " );
		}
		System.out.println();
		
		// list �� ��ü ��� ���
		System.out.print("��ü ���...�� : ");
		ListIterator<String> li = list.listIterator();
		while(li.hasNext())
		{
			String str = li.next();
			System.out.print(str + " " );
		}
		System.out.println();
		
		
		// list �� ��ü ��� ���� ���
		System.out.print("���� ���...�� : ");
		for(int idx=list.size()-1;idx>=0;idx--)
		{
			System.out.print(list.get(idx) + " " );
		}
		System.out.println();
		
		// list �� ��ü ��� ���� ���
		System.out.print("���� ���...�� : ");
		while(li.hasPrevious())
		{
			String str = li.previous();
			System.out.print(str + " " );
		}
		System.out.println();
	}
}