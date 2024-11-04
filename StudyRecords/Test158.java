/* ============================================
  ���� ���� ó��(Exception Handling) ����
=============================================*/

// ���� �ٽ� ������

public class Test158
{
	public static void main(String[] args)
	{
		Test158 ob = new Test158();

		try
		{
			int a = ob.getValue(-2);	// �� ���� �߻�
			System.out.println("a : " + a);
		}
		catch (Exception e)			// �� ���� ��Ƴ���
		{
			// �� ��Ƴ� ���ܿ� ���� ó��
			System.out.println("printStackTrace ....................");
			e.printStackTrace();
		}
	}

					// getData������ ���ܸ� throws �ϰų�, try~catch �ϰų�
					// ����� ����.
					// �� �߻��� ���� ������
	public int getData(int data) throws Exception
	{
		if (data < 0)
		{
			// �� ���� �߻�
			throw new Exception("data �� 0 ���� �۽��ϴ�.");
		}

		return data + 10;
	}

								// check~!!!
								// �� ��Ƴ� ���ܸ� �ٽ� ���� �� �ֵ��� ó��
	public int getValue(int value) throws Exception
	{
		int a = 0;

		try 
		{
			// getData���� �߻��� ���ܰ� ����� �� �Űܰ���.
			a = getData(value);	// �� ���� �߻�
		}
		catch (Exception e)		// �� ���� ��Ƴ���
		{
			// �� ��Ƴ� ���ܿ� ���� ó��
			System.out.println("printStackTrace .....................");
			e.printStackTrace();

			// check~!!!
			// �� ��Ƽ� ó���� ���ܸ� �ٽ� �߻�
			throw e;

			// ��Ƴ� ���ܸ� �ٽ� �������Ƿ�, �ݵ�� throws Exception ����� �Ѵ�.
		}

		return a;
	}
}