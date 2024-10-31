/*=====================================
���� Ŭ���� ��� ����
- �������̽�(Interface)
=======================================*/

interface ADemo
{
	public void write();
}

interface BDemo
{
	public void print();
}

class DemoImpl implements ADemo, BDemo
{
//	JDK 1.5 ������ �������̽� �޼ҵ带
//	�������̵� �� ��
//	@Override ������̼��� ����� �� ����.
//	JDK 1.6 ���ĺ��� ���� ������ �����̴�.
//	��, ��ӹ��� Ŭ������ �޼ҵ带 �������̵� �� ������
//	JDK 1.5 ������ @Override ������̼� ����� �����ϴ�.
	@Override
	public void write()
	{
		System.out.println("�ƾƾƾƾ�");
	}
	
	@Override
	public void print()
	{
		System.out.println("�ƾƾƾƾ�");
	}
}
public class Test122
{
	public static void main(String[] args)
	{
		DemoImpl ob = new DemoImpl();
		ob.write();
		ob.print();
		
		ADemo ob2 = new DemoImpl();
		BDemo ob3 = new DemoImpl();
		
//		ob2.print();		// ���� �߻�

		((BDemo)ob2).print();
		((ADemo)ob3).write();
//      DemoImpl Ŭ������ �� �������̽��� ��� �����߱� ������
//      �̿� ���� ó���� �����ϴ�.
//	    ����, DemoImpl Ŭ������ �� �������̽��� �� �� �������̽��� �����ߴٸ�
//		�� ������ ��Ÿ�� ������ �߻��ϴ� ������ �ȴ�.
		
	}
}