/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- �ݺ���(while��) �ǽ�
===================================================*/

public class Test048
{
	public static void main(String[] args)
	{
		// ��� ��
		
		/*
		int i=0, sum=0;
		
		while(i<100)
		{
			i++;
				
			sum +=i;
			
			switch(i)
			{
				case 10: System.out.printf("1 ~ %d ������ �� : %d\n", i, sum); break;
				case 20: System.out.printf("1 ~ %d ������ �� : %d\n", i, sum); break;
				case 30: System.out.printf("1 ~ %d ������ �� : %d\n", i, sum); break;
				case 40: System.out.printf("1 ~ %d ������ �� : %d\n", i, sum); break;
				case 50: System.out.printf("1 ~ %d ������ �� : %d\n", i, sum); break;
				case 60: System.out.printf("1 ~ %d ������ �� : %d\n", i, sum); break;
				case 70: System.out.printf("1 ~ %d ������ �� : %d\n", i, sum); break;
				case 80: System.out.printf("1 ~ %d ������ �� : %d\n", i, sum); break;
				case 90: System.out.printf("1 ~ %d ������ �� : %d\n", i, sum); break;
				case 100: System.out.printf("1 ~ %d ������ �� : %d\n", i, sum); break;	
				
			}
			
		}
		*/
		
		// ��� ��
		
		int i=0, sum=0;
		
		while(i++<100)
		{
			
			sum += i;
			
			if(i%10==0)
				System.out.printf("1 ~ %d ������ �� : %d\n", i, sum);
		}
		
		
	}
}