/* ============================================
  ���� ���� ó��(Exception Handling) ����
=============================================*/

// Test157.java ���ϰ� ��

class Demo
{
	private int value;		// ���� ������ �ڵ� �ʱ�ȭ!

	public void setValue(int value)
	{
		if (value <= 0)		// �Ű������� ������ �Ѱ��ָ� �ٷ� �޼ҵ� �����ϰ� ���.
		{
			return;			// return�� ������ ���� ����� �޼ҵ� ����.(setValue())
							//-- �޼ҵ� ���� �� setValue()
							//-- ������ �ٷ� ����ǰ� �޼ҵ尡 �������� �ʵ��� �����Ϸ��� �ߴµ�
							//   0���� �ʱ�ȭ �Ǹ鼭 0 ���� ��µȴ�. �� ������ �ʾҴ� ��Ȳ.

		}

		this.value = value;	// ������ value ������ �ʱ�ȭ���� �ʴ´�.
	}

	public int getValue()
	{
		return value;
	}
}

public class Test156
{
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-7);
		int result = ob.getValue();// ��������, Demo �ν��Ͻ� �����ϸ鼭 value ���� 0���� �ʱ�ȭ �ǹǷ�.
		System.out.println(result);
	}
}
