/* ====================================
  ���� �÷��� (Collection) ����
======================================*/

import java.util.Vector;
import java.util.Collections;

public class Test166{
	
	private static final String[] colors
		= {"����","���","�ʷ�","�Ķ�","����","����",};
		
	public static void main(String[] args){
		
		Vector<String> v = new Vector<String>();
		
		for(String color : colors){
			v.add(color);
		}
		
		System.out.println("ù ��° ��� : " + (String)v.elementAt(0));
		System.out.println("�� ��° ��� : " + (String)v.elementAt(1));
		System.out.println("������  ��� : " + (String)v.lastElement());
		System.out.println("�����  ���� : " + v.size());		
		
//		�� ù ��° ��Ҹ� "�Ͼ�"���� ���� �� set(�ε���, ���)
		v.set(0,"�Ͼ�");
		System.out.println("ù ��° ��� : " + (String)v.elementAt(0));
		System.out.println("�� ��° ��� : " + (String)v.elementAt(1));
		System.out.println("������  ��� : " + (String)v.lastElement());
		System.out.println("�����  ���� : " + v.size());	
//		��� : ���� �� �Ͼ� �����		
		
//		�� ù ��° ��ҿ� ��Ȳ �߰� �� insertElementAt(���, �ε���)
		v.insertElementAt("��Ȳ",0);
		System.out.println("ù ��° ��� : " + (String)v.elementAt(0));
		System.out.println("�� ��° ��� : " + (String)v.elementAt(1));
		System.out.println("������  ��� : " + (String)v.lastElement());
		System.out.println("�����  ���� : " + v.size());	
//		��� : ��Ȳ�� ó���� �� ��		

//		�� �������� ����
		Collections.sort(v);
	
		for(String str : v)
			System.out.print(str+ " ");
		System.out.println();
		
//		�� �˻�
//		Collections.binarySearch(); �� �˻� ��� ���� 
//		��, �������� ������ ����Ǿ� �ִ� �ڷῡ ���ؼ��� ����� �����ϴ�.
//		�˻� ����� �������� ���� ��� ���������� ��ȯ�Ѵ�.

		int idxBlue = Collections.binarySearch(v, "�Ķ�");
		System.out.printf("�Ķ��� ���? %d��!\n",idxBlue);
		
		
//		�� �������� ����
		Collections.sort(v, Collections.reverseOrder());
		
		for(String str : v)
			System.out.print(str+ " ");
		System.out.println();		
	
		idxBlue = Collections.binarySearch(v, "�Ķ�");
		System.out.printf("�Ķ��� ���? %d��!\n",idxBlue);
//		���� ������ == ã�� ���ߴ�

		idxBlue = Collections.binarySearch(v, "�Ķ�",Collections.reverseOrder());
		System.out.printf("�Ķ��� ���? %d��!\n",idxBlue);
		
	}
	
}