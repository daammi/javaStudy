/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- �ݺ��� �ǽ� �� ����
===================================================*/

public class Test047
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int i, sum, odd, even; i=sum=odd=even=0;
		
		
		// ���� �� ó��
		while(i<=100)
		{
			if(i%2==0)
				even += i;
			else
				odd += i;
			
			sum +=i;
			
			i++; 
		}
		
		
		// ��� ���
		System.out.println("1���� 100���� ������ �� : " + sum);
		System.out.println("1���� 100���� ¦���� �� : " + even);
		System.out.println("1���� 100���� Ȧ���� �� : " + odd);		
		
		
	}
}