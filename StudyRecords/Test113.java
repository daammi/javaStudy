/*====================================
���� ����(Sort) �˰��� ����
======================================*/

// ���� ���� ����
// 
// �� �տ��� �� �� ������ ������ ����.
//    ������, ���� Bubble Sort �� ��� �������� ������ ����
//	  �Ϲ� Bubble Sort �� Selection Sort �� ���� ������ ���� �� �ִ�.

public class Test113
{
	public static void main(String[] args)
	{
/*
		int[] a = {62, 15, 20, 22, 30};
		
		for(int i=0;i<a.length-1;i++)
		{
			int cnt=0;
			for(int j=0;j<a.length-i-1;j++)
			{
				
				if(a[j]>a[j+1])
				{
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j+1]^a[j];
					a[j]=a[j]^a[j+1];
					cnt++;
				}	
			}
			if(cnt==0)
				break;
		}
		
		for(int i=0;i<5;i++)
			System.out.printf("%3d", a[i]);
		System.out.println();
*/	

	int[] a = {62, 15, 20, 22, 30};
		
		for(int i=0;i<a.length-1;i++)
		{
			boolean flag = false;
			
			for(int j=0;j<a.length-i-1;j++)
			{
				
				if(a[j]>a[j+1])
				{
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j+1]^a[j];
					a[j]=a[j]^a[j+1];
					flag =true;
				}	
			}
			if(!flag)
				break;
		}
		
		for(int i=0;i<5;i++)
			System.out.printf("%3d", a[i]);
		System.out.println();
	}
}