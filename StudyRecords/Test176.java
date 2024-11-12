/* ====================================
  ���� �÷��� (Collection) ����
======================================*/

// Map �� HashTable, HashMap
// - Key �� Value �� ������ ����


/*
(�̸�ǥ�� �޷��ִ�. key�� value�� �����͸� �����Ѵ�.)

�� java.util.Map �������̽�
   Ű(key)�� ��(value)�� ����(mapping)�ϸ�
   ������ Ű�� ����� �� ����, �����ؾ� �ϸ�,
   �� Ű�� �� ���� �� ���� �����ؾ� �Ѵ�.
   ��, �ϳ��� Ű�� �����ϴ� �ϳ��� ���� ���� �����̴�.
   
*/

/*
�� Hashtable<K, V> Ŭ����

   - �ؽ� ���̺� ������ ��ü �𵨸�ȭ �� Ŭ������
     �˻��� �����ϱ� ������ ��� �󵵰� ���� �� ���Ѵ�.
   - �ؽ����̺��̶� Ű(key)�� �׿� �����ϴ� ������(value)��
     ���е� ������ �����̴�.
   - �����͸� �����ϰ�, �˻��ϱ� ���ؼ� Ű(key)�� �����ϸ�
     �� ���������� Ű ���� �ο��ϸ� �ش� �����Ͱ� ��ȯ�ȴ�.
   - ����, Hashtable Ŭ������ key �Ǵ� value �� ������ null �� ������� �ʴ´�.

*/

import java.util.*;

public class Test176
{
	private static final String[] names
		={"�����","������","������", "������", "������", "�Ӽ���"};
	private static final String[] tels
		= {"010-1234","010-5234","010-5233", "010-2324","010-2135","010-6134"};
	
	public static void main(String[] args)
	{
		Hashtable<String, String> ht = new Hashtable<String, String>();	
		
//		ht ��� Hashtable �ڷᱸ����
//		������ �迭(names, tels)�� ����ִ� �����͸� ��ҷ� ��Ƴ���
//      �� put(k,v)
		for (int i=0;i<names.length;i++)
		{
			ht.put(names[i],tels[i]);
		}
		
//		Hashtable �ڷᱸ�� ht ���� key �� �̿��� ������ �˻�
//		 �� get(k)
		String findName1 = "������";
		String str = ht.get(findName1);
		if(str != null)
		{
			System.out.println(findName1 + "��ȭ��ȣ : " + str);
		}
		System.out.println();
		
//		Hashtable �ڷᱸ�� ht �� key �� �����ϴ����� ���� Ȯ��
//		 �� containsKey()
		String findName2 = "������";
		if(ht.containsKey(findName2))
			System.out.println(findName2 + " �����Ͱ� �����մϴ�.");
		else
			System.out.println(findName2 + " �����Ͱ� �������� �ʽ��ϴ�.");
		System.out.println();
		
//		Hashtable �ڷᱸ�� ht�� value �� �����ϴ����� ���� Ȯ��
//		 �� contains()
		String findTel1 = "010-1234";
		if(ht.contains(findTel1))
			System.out.println(findTel1 + " �����Ͱ� �����մϴ�.");
		else
			System.out.println(findTel1 + " �����Ͱ� ���������ʽ��ϴ�.");
		System.out.println();
		
		ht.remove("�Ӽ���");
		
		// remove �޼ҵ�� ���ڰ����� key�� �Ѱܹ�����
		// �̶�, key �� �����Ǵ� ���� �ƴϴ�.
		// �ش� key �� ����Ǿ�(���εǾ�) �ִ� value �� �Բ� �����ȴ�.
		
		if(ht.containsKey("�Ӽ���"))
			System.out.println("�����Ͱ� �����մϴ�.");
		else
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
		System.out.println();
		
		if(ht.contains("010-6134"))
			System.out.println("�����Ͱ� �����մϴ�.");
		else
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
		System.out.println();	
		
		// �� null ���� ó��
		
//		ht.put(null, null);		// key �� value ��� null �� ��Ÿ�� ����!!
		
//		ht.put("�ȼ�â", null);		// value �� null �� ��Ÿ�� ����!!
		
//		ht.put(null, "010-1234-1234");		// key �� null �� ��Ÿ�� ����!!

//		�� �ߺ� ������ ���� ó��

		// �ߺ��� key �Է�
		ht.put("������", "010-1111-1111");
		
		System.out.println(ht.get("������"));
		System.out.println();
		
		// �ߺ��� key�� Ȱ���Ͽ� value �� �Է��Ͽ���
		// ��� ���� ���� ������ 010-1111-1111 �� ����� (�����)
		
		// �ߺ��� value
		ht.put("��ν�", "010-1234");
		System.out.println(ht.get("�����"));
		System.out.println();
	
		System.out.println(ht.get("��ν�"));
		System.out.println();
		
		// �� value �� �ߺ��� �����͸� ����ϴ���
		//    ���� �����Ϳ� �ƹ��� ������ ��ġ�� ������ Ȯ��
		// �ΰ��� key�� �ϳ��� value�� ����!
	}
}