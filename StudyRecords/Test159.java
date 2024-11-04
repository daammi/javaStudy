/* ============================================
  ���� ���� ó��(Exception Handling) ����
=============================================*/

// �ٸ� ���� �ٽ� ������

public class Test159
{
	public int getValue(int value) throws Exception		// �� ���� ������ (�Ķ� ��ź)
	{							
		int a = 0;
		
		try
		{
			a = getData(value);			// �� ���� �߻� (���� ��ź)   
		}
		catch (Exception e)				// �� ���� ��Ƴ��� (���� ��ź)
		{
			// �� ��Ƴ� ���ܿ� ���� ó�� (���� ��ź)														
			System.out.println("printStackTrace ........................");
			e.printStackTrace();
			
			// check~!!!                    
			// �� ���� �߻� (�Ķ� ��ź)
			throw new Exception("value �� �����Դϴ�.");
			// ���Ӱ� ���ܸ� �߻����ױ� ������ ������ throws Exception �� ����� �Ѵ�.
		}

		return a;
	}

	public int getData(int data) throws Exception		// �� ���� ������ (���� ��ź)
	{							
		if (data < 0)
		{
			throw new Exception("data �� 0 ���� �۽��ϴ�.");	// �� ���� �߻� (���� ��ź)
		}

		return data + 10;
	}



	public static void main(String[] args)
	{
		Test159 ob = new Test159();

		try
		{
			int a = ob.getValue(-2);		// �� ���� �߻� (�Ķ� ��ź)
			System.out.println("a : " + a);	    

		}
		catch (Exception e)				// �� ���� ��Ƴ��� (�Ķ� ��ź)
		{		
			// �� ��Ƴ� ���ܿ� ���� ó�� (�Ķ� ��ź)
			System.out.println("printStackTrace ........................");
			e.printStackTrace();

		}

	}
}
