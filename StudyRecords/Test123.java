/*=====================================
���� Ŭ���� ��� ����
- �������̽�(Interface)
=======================================*/

interface Demo
{
	public void write();
	public void print();
}

class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() �޼ҵ� ������...");
	}
	@Override
	public void print()
	{
		System.out.println("print() �޼ҵ� ������...");
	}
}

class DemoImplSub extends DemoImpl
{
	
}

public class Test123
{
	public static void main(String[] args)
	{
		DemoImplSub ob3 = new DemoImplSub();
		
		ob3.write();
		
	}
}