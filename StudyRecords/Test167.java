/* ====================================
  ���� �÷��� (Collection) ����
======================================*/

// �˻� �� ����

import java.util.*;

public class Test167
{
	private static final String[] colors
		= {"����","���","�ʷ�","�Ķ�","����","����",};
		
	public static void main(String[] args)
	{
		Vector<String> v = new Vector<String>();
		
		for(String color : colors)
			v.add(color);
		
		System.out.print("��ü ��� ��� : ");
		for(String str : v)
			System.out.print(str + " ");
		System.out.println();
		
		String s1 = "����";
		
		// indexOf()
		int i = v.indexOf(s1);
		System.out.println(s1 + " �� index ��ġ : " + i);
		
		String s2 = "���";
		
//		contains()
//		v.contains(s)
//		���� �ڷᱸ�� v�� ã���� �ϴ� s �� ���ԵǾ� �ִٸ�...
//		�� index ��ġ Ȯ��

		if(v.contains(s2))
		{
			i= v.indexOf(s2);
			System.out.println(s2 + " �� index ��ġ : " + i);
			
			// �� �����ϴ����� ���θ� Ȯ���ϰ� �� line39
			// �� ��� �ִ��� Ȯ���ϰ�	   �� line41
			// �� Ȯ�������� �����ض�		   �� line55
			v.remove(i);
		}
		System.out.println();
		
		System.out.print("���� �� ��ü ��� ��� : ");
		for(String str : v)
			System.out.print(str + " ");
		System.out.println();	
	}
}