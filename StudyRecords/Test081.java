/*================================================= 
���� Ŭ������ �ν��Ͻ� ���� 
- ������(Constructor)
===================================================*/

public class Test081
{
	int val1;
	double val2;
	
	Test081()
	{
		val1=0;
		val2=0;
		System.out.println("�Ű����� ���� ������...");
	}
	
	Test081(int val1)
	{
		this.val1=val1;
		val2=0;
		System.out.println("int�� �����͸� �Ű������� �޴� ������...");
	}
	
	Test081(double val2)
	{
		val1=0;
		this.val2=val2;
		System.out.println("double�� �����͸� �Ű������� �޴� ������...");
	}
	
	Test081(int val1, double val2)
	{
		this.val1=val1;
		this.val2=val2;
		System.out.println("int���� double �����͸� �Ű������� �޴� ������...");
	}
	
	public static void main(String[] args)
	{
		Test081 ob1 = new Test081();
		System.out.println(ob1.val1+", "+ob1.val2);
		
		Test081 ob2 = new Test081(4);
		System.out.println(ob2.val1+", "+ob2.val2);
		
		Test081 ob3 = new Test081(7.0);
		System.out.println(ob3.val1+", "+ob3.val2);
		
		Test081 ob4 = new Test081(4,7.0);
		System.out.println(ob4.val1+", "+ob4.val2);	
	}
}