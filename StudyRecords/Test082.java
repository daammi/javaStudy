/*================================================= 
���� Ŭ������ �ν��Ͻ� ���� 
- ������(Constructor)�� �ʱ�ȭ ��(Initialized Block)
===================================================*/

public class Test082
{
//  ����X
//	int n;
//	int m;
//	
//	n=100;       
//	m=200;

//  ����O
//	int n=100;
//	int m=200;

	int n;
	int m;
	
//	�ʱ�ȭ ��(Initialized Block)
	{
		n=100;
		m=200;
		System.out.println("�ʱ�ȭ �� ����..");
	}

//	������ �� ����� ���� ������
	Test082()
	{
		n=10;
		m=20;
		System.out.println("������ ����...");
	}
	
//	������ �� ����� ���� ������
	Test082(int n, int m)
	{
		this.n=n;
		this.m=m;
		System.out.println("�Ű����� �ִ� ������ ����...");
	}	

//	�� �߿䵵: �ʱ�ȭ �� <<<<<<<<< ������ 
	
	void write()
	{
		
		System.out.println("n:"+n+", m:"+m);
	}
	public static void main(String[] args)
 	{
		Test082 ob1 = new Test082();
		
		ob1.write();
		
		Test082 ob2 = new Test082(120, 2500);
	}
}