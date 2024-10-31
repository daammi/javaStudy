/*================================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- Calendar Ŭ����
==================================================*/

/*
�� java.util.Calendar Ŭ������
   ��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
   ��, ��, ��, ����, ��, ��, �� ������
   �ð��� ��¥�� ���õ� ������ �����Ѵ�.
   �׸���, Calendar Ŭ������ �߻� Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ������
   �������� �޼ҵ� ������ Calendar Ŭ������ ���� Ŭ������
   GregorianCalendar Ŭ������ ���ǵǾ� �ִ�.

   �ý������κ��� ���� �ý��� �ð� ������ ���� ��
   getInstance() ��� ����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
   ������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������,
   �� ��ü�� �����Ǹ� �����ִ� �ð� ��������
   get() �޼ҵ带 �̿��Ͽ� ���� ������(�����) �� �ִ�.

   getInstance() �޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ�
   ��ȯ�� �ֱ� ������  GregorianCalendar ��ü�� ���� �����Ͽ� ��¥ �ð� ������
   ���� ���� �ִ�.
*/

/*
�� �ǽ� ����

   ����ڷκ��� ��, ���� �Է¹޾�
   �޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�.
   ��, Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
   �� API Document �����Ͽ� getActualMaximum() �޼ҵ��� Ȱ�� ��� ������ ��~!!!


���� ��)
���� �Է� : 0
���� �Է� : 2024
�� �Է�   : -10
�� �Է�   : 13
�� �Է�   : 5

   [ 2024 �� 5�� ]

 ��  ��  ȭ  ��  ��  ��  ��
===========================
              1   2   3   4
  5   6   7   8   9  10  11
 12  13  14  15  16  17  18
 19  20  21  22  23  24  25
 26  27  28  29  30  31
===========================
����Ϸ��� �ƹ� Ű�� ��������...

*/

import java.util.*;

public class Test148
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Calendar ob = Calendar.getInstance();
		int[][] arr = new int[6][7];
		int y,m,d=1;
		
		do
		{
			System.out.print("���� �Է� : ");
			y=sc.nextInt();
		}
		while (y<1);
		
		do
		{
			System.out.print("�� �Է� : ");
			m=sc.nextInt();
		}
		while (m<1||m>12);
		
		ob.set(y,m-1,d);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==0&&j<ob.get(Calendar.DAY_OF_WEEK)-1)
				{
					arr[i][j] = 0;
				}
				else if(d<=ob.getActualMaximum(Calendar.DATE))
				{
					arr[i][j] = d++; 
				}
				else
				{
					arr[i][j] = 0;
				}
				
			}
		}
		
		System.out.printf("\t[ %d �� %d �� ]\n", y, m);
		System.out.println("=======================");	
		System.out.println("   ��   ��   ȭ   ��   ��   ��   ��");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==5&&arr[i][j]==0)
					break;
				else if(arr[i][j]!=0)
					System.out.printf("%5d",arr[i][j]);
				else
				System.out.printf("     ");
			}
			if(i!=0 && arr[i][0]==0)
				break;
			System.out.println();
		}
		
		System.out.printf("====================================\n");
	}
}