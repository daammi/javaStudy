/*================================================= 
���� Ŭ������ �ν��Ͻ� ���� 
- ������(Constructor)
===================================================*/

class NumberTest2
{
	int num;
	
	// ����Ʈ ������ �� �ڵ� ����
	/*
	NumberTest2()
	{
		
	}
	*/
	
	// ������ �� ����� ���� ������
	NumberTest2(int n)
	{
		this.num = n;
	}
	
	int getNum()
	{
		return num;	
	}
}

public class Test079
{
	public static void main(String[] args)
	{
	//	NumberTest2 Ŭ��������	
	//	����� ���� �����ڰ� �����ϰ� �ִ� ��Ȳ�̱� ������
	//	����Ʈ ������ �� �ڵ����� ���Ե��� ������
	//  ����ڰ� ������ �����ڴ� �Ű������� ���� �����̱� ������
	//	�Ű����� ���� �����ڸ� ȣ���ϴ� ������ �ν��Ͻ� ����
	//	������ ������ �߻���Ű�� �ȴ�.
	
		int n = 10;
		NumberTest2 ob = new NumberTest2(n);
		System.out.println(ob.getNum());
		
		System.out.print
	}
}