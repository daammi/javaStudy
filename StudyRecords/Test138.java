/*=====================================
���� �ڹ��� �ֿ� Ŭ���� ����
- Wrapper Ŭ����
=======================================*/

public class Test138
{

/*
	static void print(Object ob)
	{
		System.out.println(ob);
	}
*/
	
//	java.lang.number Ŭ����(�߻� Ŭ����)��
//	��� ������ Wrapper Ŭ������ �θ� Ŭ�����̴�.
//	b2,i2 �ڷ����� Number�� �Ѿ���鼭
//	���������δ� ��ĳ������ �Ͼ�� �ȴ�.

	static void print(Number n)
	{
		System.out.println(n);
		
		if(n instanceof Integer)
		{
//			System.out.println(n + "�� integer ��ü");
			System.out.println(n.intValue())
		}
		else if(n instanceof Byte)
		{
			System.out.println(n + "�� Byte ��ü");
		}
	}
	
	
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;
		
		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		
//		System.out.println(b2);
//		System.out.println(i2);
		
		print(b2);
		print(i2);
	}
}