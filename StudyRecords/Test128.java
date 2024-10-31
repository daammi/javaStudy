/*=====================================
���� Ŭ���� ��� ����
- ��ø Ŭ����
=======================================*/

// outer Ŭ����
class InnerOuterTest
{
	static int a = 10;
	int b = 20;
	
	// inner Ŭ����
	class InnerNested
	{
		int c = 30;
		
		void write()
		{
			System.out.println("write()...inner");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);	
		}
	}
	
	void write()
	{
		System.out.println("write()...outer");
		
		InnerNested ob1 = new InnerNested();
		ob1.write();
	}
}
public class Test128
{
	public static void main(String[] args)
	{
		InnerOuterTest ob = new InnerOuterTest();
		ob.write();
		
//		InnerOuterTest.InnerNested ob2 = new InnerOuterTest.InnerNested(); // ������ ����
//		��	��ø ���� Ŭ����(static ��ø Ŭ����)�ʹ� �޸�
//			�ܺ� Ŭ������ �ν��Ͻ��� ������� �ʰ�
//			�ܵ����� ���� Ŭ������ �ν��Ͻ��� �����ϴ� ���� �Ұ����ϴ�.
		InnerOuterTest.InnerNested ob5 = ob.new InnerNested();
		ob5.write();
		
//		outerŬ������.innerŬ������ ���������� = outer��ü.new inner������();
	
//		cf) static ��ø Ŭ����
//		outerŬ������.innerŬ������ ���������� = new outerŬ������.inner������();
		
		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();
	}
}