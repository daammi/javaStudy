
// �� ������ �ڷ���
// �� �Ǽ��� ������Ÿ�� ���е� �׽�Ʈ

public class Test019
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		float a = 0;
		double b = 0;
		
		
		// ���� �� ó�� �� �ݺ� ���� �� �ݺ��� ���� �� 100000(�ʸ�)�� �ݺ�
		for(int i=1 ; i <= 100000 ; i++)
		{
			//System.out.println("�ݺ��� ���");
			//System.out.println(i);
			
			a += 100000;		//-- a �� 100000 ��ŭ ����������!!
			b += 100000;		//-- b �� 100000 ��ŭ ����������!!
		
		}
		
		// a �� 100000
		// b �� 100000
		
		
		// ��� ���
		System.out.println("float  a : " + (a / 100000));
		System.out.println("double b : " + (b / 100000));

	
	}
}

// ���� ���

/*
	float  a : 99996.055
	double b : 100000.0
*/
	