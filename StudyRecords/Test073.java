/* ================================================
���� ���������� �������� ����
=================================================== 

Test073.java �� ��

*/

public class Test073
{
	// Ŭ������ ����
	
	// ���� ���� a ����
	// ���������� �ڵ����� 0���� �ʱ�ȭ ����
	int a;
	
	boolean b;
	char c;
	double d;
	
	public static void main(String[] args)
	{
		// �޼ҵ��� ����
		
		// System.out.println("n : " + a);	
		// �� ���� �߻�(������ ����)
		//	  non-static variable a cannot be referenced from a static context
		
		// Test073 Ŭ����(���赵)�� ������� �ν��Ͻ�(��ü) ����
		Test073 ob = new Test073();
		
		System.out.println("ob.a : " + ob.a);
		// ��� ob.a : 0
		System.out.println("ob.b : " + ob.b);
		System.out.println("ob.c : " + ob.c);
		System.out.println("ob.d : " + ob.d);
		// ��� ob.b : false
		//		ob.c :
		//		ob.d : 0.0
	}
}

