/*================================================
���� �迭 ����
- �迭�� ���� ó��(�� Random Ŭ���� Ȱ��)
===================================================

����ڷκ��� ������ ������ �Է¹޾�
�� ������ ������ŭ ����(1~100)�� �߻����� a �迭�� ���
�ٽ� ����ڰ� �Է��ϴ� ���� �������� �����Ͽ� b �迭�� ������ ��
�� �迭�� ��Ҹ� �������� ���·� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
�߻���ų ������ ���� �Է� : 5
(���������� ������ ���� �߻�... �� 2 3 7 10 11)
�迭�� ��Ƴ���... �� int[] a = {2, 3, 7, 10 ,11}

// ������ �迭�� ���� �Է� : 4
������ ������ �迭 ����(���� ����) : 3 6 10 14
>> 2 3 7 10 11 6 14
����Ϸ��� �ƹ�Ű�� ��������...
*/

import java.util.Scanner;
import java.util.Random;

public class Test099
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int size;  // �߻���ų ������ ����
		
		System.out.print("�߻���ų ������ ���� �Է� : ");
		size = sc.nextInt(); // ������ ��ȯ
		
		int[] a = new int[size]; // a �迭 ����
		Random rd = new Random(); // ���� �� ����
		
		for (int i=0; i<size; i++)
		{
			a[i]=rd.nextInt(100)+1; // �迭�� ���� �� �ֱ�
		}
		
		for (int n=0; n<a.length; n++)
		{
			System.out.print(a[n] + " ");
		}
		
		int size2;	   // �迭 ������ ������ ����
		
		System.out.print("������ �迭�� ���� �Է� : ");
		size2 = sc.nextInt();
		
		int[] b = new int[size2];  // ���̰� 4�� b �迭 ����
		System.out.print("������ ������ �迭 ����(���� ����) : ");
		for (int i=0; i<size2; i++)  // �Է��� ������ ���� b �迭�� �ֱ�
		{
			b[i]=sc.nextInt();
		}
		
		// ��ü ��� ���
		System.out.print(">>");
		
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		for (int i=0; i<b.length; i++)
		{
			boolean flag = false;
			
			for (int j=0; j<a.length ; j++)
			{
				if (b[i] == a[j])
				{
				   flag = true;
				   break;
				}  
			}
		 // b�迭�� ��Ҹ� ����ϴ� �������� �ߺ��Ǵ� ���� Ȯ���ϸ� ������� ����
			    if(flag)
				continue;
				System.out.print(b[i] + " ");
		}
			   System.out.println();	
	}
}

/*
		// �� �迭 ����
		int[] a = {2, 3, 7, 10 ,11};
		int[] b = {3, 6, 10, 14};
		
		// ���� a(a�迭) ��ü ���
		for (int n=0; n<a.length; n++)
		{
			System.out.print(a[n] + " ");
		}
		
		// ����b(b�迭) ����a(a�迭)�� �ߺ��Ǵ� ���� �����ϸ� ���
		for (int n=0; n<b.length; n++) // b �迭�� ���̸�ŭ �ݺ�
		{
			boolean flag = false;
			
			// a �迭�� �� ��ҵ�� ���Ͽ� Ȯ��
			for (int m=0; m<a.length; m++) // a �迭�� ���̸�ŭ �ݺ�
			{
				if (b[n] == a[m])
				{
					flag = true;
					break;
				}
			}
			// b�迭�� ��Ҹ� ����ϴ� �������� �ߺ��Ǵ� ���� Ȯ���ϸ� ������� ����
			if(flag)
				continue;
			
			 System.out.print(b[n] + " ");
		}
		System.out.println();
	}
}
		*/
		
		
		