/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- �ݺ���(while��) �ǽ�
===================================================*/

// 1 + (1 + 2) + (1 + 2 + 3) + ....+ (1 + 2 + 3 ....+ 10)

public class Test049
{
	public static void main(String[] args)
	{
		int i=0, temp=0;
		int sum=0;
		
		while(i<10)
		{
			i++; 
			
			temp += i;
			
			sum += temp;
			                               
		}
		
		System.out.println("���� ��� : " + sum);
	}
}