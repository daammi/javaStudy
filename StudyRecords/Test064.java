/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- �ݺ���(for��) �ǽ�
- �ݺ����� ��ø ������ Ȱ���� ������ ���
===================================================*/

public class Test064
{
	public static void main(String[] args)
	{
	/*
		for(int i=1; i<10; i++)							//-- �ƿ��� ����
			{
				// ��~~~~
				for(int j=2; j<=5; j++)	{				//-- �̳� ����
					// ������~
					System.out.printf("%d * %d = %2d ", j, i, i*j);
					
				}
				System.out.printf("\n");
			}
			
		System.out.println();							//-- ����
		
		for(int i=1; i<10; i++)							//-- �ƿ��� ����
			{
				// ��~~~~
				for(int j=6; j<=9; j++)	{				//-- �̳� ����
					// ������~
					System.out.printf("%d * %d = %2d ", j, i, i*j);
					
				}
				System.out.printf("\n");
			}			
		
		System.out.println();
	*/
		
		for(int i=0;i<=4;i+=4)
		{
			for(int j=1; j<10; j++)							//-- �ƿ��� ����
				{
					// ��~~~~
					for(int k=2+i; k<=5+i; k++)				//-- �̳� ����
						// ������~
						System.out.printf("%d * %d = %2d  ", k, j, j*k);
					
					System.out.println();
				}
			System.out.println(); 
		}		
	}
}
