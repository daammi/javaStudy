/*=====================================
���� Ŭ���� ��� ����
- ��ø Ŭ����
=======================================*/

// outer Ŭ����
class Test2
{
	static int a = 10;
	int b = 20;
	
	void write()	// ù��°!
	{
		System.out.println("write()...1");
		final int c = 30;
		int d = 40;
		
		d++;
		
		// inner Ŭ����
		// �޼ҵ� �ȿ� �����ϴ� �Ǵٸ� Ŭ���� (���� Ŭ����, local Ŭ����, ���� Ŭ����)
		class LocalTest
		{
			void write()	// �ι�°!
			{
				System.out.println("write()...2");
				System.out.println("a" + a);
				System.out.println("b" + b);
				System.out.println("c" + c);
//				System.out.println("d" + d);
				
			}
		}
		
		d++;
		
		LocalTest lt = new LocalTest();
		lt.write();		// -- �ι�° write ȣ��
		
		d++;
		
	}
}
public class Test127
{
	public static void main(String[] args)
	{
		Test2 ob = new Test2();
		ob.write(); // ù��° write ȣ��
	}
}