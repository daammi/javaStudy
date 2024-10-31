/*================================================
���� Ŭ���� ��� ����
- ���(Inheritance)
==================================================*/

/*
�� �޼ҵ� �������̵��� Ư¡

    - �޼ҵ� �̸�, ����Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�.
	- �ݵ�� ��� ���谡 �־�� �Ѵ�.
	- �����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ�
	  ���� Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�.
	  ���� ���, ���� Ŭ���� �޼ҵ��� �������������ڰ� protected �� ���
	  ���� Ŭ������ �� �޼ҵ带 �������̵� �ϴ� ���
	  �������������ڴ� public �Ǵ� protected �̾�� �Ѵ�.
	- static, final, private �޼ҵ�� �������̵��� �� ����.
	- Exception �� �߰��� �Ұ����ϴ�.
	  ��, ���� �޼ҵ尡 ������ �ִ� ���� ���� ���׿�
	  ���ο� Exception �� �߰��ϴ� ���� �Ұ����ϴٴ� ���̴�.
*/
class SuperTest118
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;
	
	public void write()
	{
		System.out.println("Super write() �޼ҵ� : "+ a + " : "+b+" : "+c);
	}
}

class SubTest118 extends SuperTest118
{
	protected int b = 100;
	int a = 10;
	public void print()
	{
		System.out.println("Sub print() �޼ҵ� : "+b+" : "+c);
		
		System.out.println("Sub print() �޼ҵ� : " + b);
		System.out.println("Sub print() �޼ҵ� : " + this.b);
		System.out.println("Sub print() �޼ҵ� : " + super.b);
		
		System.out.println("Sub print() �޼ҵ� : " + c);
		System.out.println("Sub print() �޼ҵ� : " + this.c);
		System.out.println("Sub print() �޼ҵ� : " + super.c);
	}
	
	@Override
	public void write()
	{
		System.out.printf("%d : %d : %d \n",a,b,c);
	}
}

public class Test118 
{
	public static void main(String[] args)
	{
		SubTest118 ob = new SubTest118();
		ob.print();
		ob.write();
		
		System.out.println(((SuperTest118)ob).b);
		
		ob.write();
//		((SuperTest118).ob).write();
//      �޼ҵ�� ���ۺθ� �ȵ�!!!!!!!!!!!!!!!!!!!

		
	}
}