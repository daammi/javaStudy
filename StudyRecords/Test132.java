/*=====================================
���� �ڹ��� �ֿ� Ŭ���� ����
- Object Ŭ����
=======================================*/

class Test
{
	private int a = 10;
	
	public void write()
	{
		System.out.println("a : " + a);
	}
}

public class Test132
{
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();
		
		System.out.println("10 == 9 : " + (10==9));
//		-->> false

		int a=10,b=10;	
		System.out.println("a == b : " + (a==b));
//		-->> true
		
//		�� == �� �����ڴ� �ǿ������� ũ�⸦ ���ϴ� ���� Ȯ���� �� �ִ�.

		System.out.println("ob1 == ob2 : " + (ob1==ob2));
//		-->> ob1 == ob2 : false
		
//		�� ��ü(Object)���� ���ϴ� �������� ���Ǵ� ��==�� �� �����ڴ�
//		   ��� ��ü���� ũ�⸦ ���ϴ� ���� �ƴ϶� �ּҸ� ���Ѵ�.

		System.out.println("ob1            : " + ob1);
		System.out.println("ob1.toString() : " + ob1.toString());
		
		System.out.println("ob2            : " + ob2);
		System.out.println("ob2.toString() : " + ob2.toString());
		
//		��Ŭ������@�ؽ��ڵ塻
//				   ---------
//				   �ڹ� ���������� ��ü�� �����ϱ� ���� ����ϴ� ��.
//			       �޸��� �ּҰ����� �����ϸ� ����� �ȵȴ�.
//		
//		�� ��ü�� ������ hashcode �� ������
//		   hashcode �� ���ٰ� ���� ��ü�� �ƴϴ�~
	}
}
