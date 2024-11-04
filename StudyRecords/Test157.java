/* ============================================
  ���� ���� ó��(Exception Handling) ����
=============================================*/

// Test156.java ���ϰ� ��~!!!

// �� throws    /    throw
//     ó��     /      �߻�
class Demo
{
	private int value;

	public void setValue(int value) throws Exception	// ���� ����~
	{

		if (value <=0)
		{
			// return;
			throw new Exception("value �� 0 ���� �۰ų� ���� �� �����ϴ�.");
			// new ��� ��ü���������ڸ� ���ؼ� ����(Exception)�� �����ϰ� �ִ� �����̴�.
			// �ڡ� �����ܸ� ���������Ƿ�... �ʼ������� ����ó���� �� �־�� �Ѵ�.��
		}

		this.value = value;			// ���� ���� value��
									// �޼ҵ��� �Ű������� ���޵� int ������ �ʱ�ȭ
	}

	public int getValue()			// value ���� �������� �޼ҵ� (private �������������ڷ� �����Ǿ����Ƿ�)
	{
		return value;
	}
}


public class Test157
{
	public static void main(String[] args) // throws Exception
	{
		Demo ob = new Demo();

		try
		{
			ob.setValue(-3);
			int result = ob.getValue();	
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
}

// ���� ���

/*
java.lang.Exception: value �� 0 ���� �۰ų� ���� �� �����ϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
