/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- �ݺ��� �ǽ� �� ����
===================================================*/

public class Test046
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int n = 0, even = 0, odd = 0;
		
		
		// ���� �� ó��
		while(n<100)
			{	
				n++;
				
				if(n%2==0)
					even += n;
				else if(n%2!=0)
					odd += n;
				else
				{
					System.out.println("�Ǻ� �Ұ� ������ !!!");
					return;
				}
			}

		
		// ��� ���
		System.out.println("¦���� �� : " + even);
		System.out.println("Ȧ���� �� : " + odd);
		
		
	}
}