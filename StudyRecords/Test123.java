/*=====================================
■■■ 클래스 고급 ■■■
- 인터페이스(Interface)
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
		System.out.println("write() 메소드 재정의...");
	}
	@Override
	public void print()
	{
		System.out.println("print() 메소드 재정의...");
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