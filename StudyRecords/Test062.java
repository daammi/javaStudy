/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- �ݺ���(for��) �ǽ�
===================================================*/

// 1���� 100������ ���� �߿���
// 4�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// for ���� Ȱ���ϸ� �� �ٿ� 5������ ����� �� �ֵ��� �Ѵ�.

public class Test062
{
	public static void main(String[] args)
	{
	/*
		for(int i=1;i<101;i++)
		{
			if(i%4==0)
				System.out.printf("%3d", i);
			if(i%(4*5)==0)
				System.out.printf("\n");
		}
	*/
		
		int cnt=0;
		
		for(int i=4;i<=100;i+=4){
			
			System.out.printf("%4d", i);
			cnt++;
			
			if(cnt%5==0)	
				System.out.printf("\n");			
		}
		
	}
}