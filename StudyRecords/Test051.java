/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- �ݺ���(while��) �ǽ�
===================================================*/

public class Test051
{
	public static void main(String[] args)
	{
		
		int i=0, sum=0;
		
		while(i<10)
		{
			i++;
			
			if(i%2==0)
				sum -=i;
			else
				sum +=i;			
			
		}
		
		System.out.println("������ : " + sum);
				
	}
}