/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- �ݺ���(while��) �ǽ�
===================================================*/

// ����ڷκ��� ������ �� ������ �Է¹޾�
// �Է¹��� �� ���� ��
// ���� ������ ū �� ������ ���� ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

import java.util.Scanner;

public class Test055
{
	public static void main(String[] args)
	{
		/*
		Scanner sc = new Scanner(System.in);
		int n1, n2, min, max, sum=0;
		int i;
		
		System.out.print("ù ��° ���� �Է� : ");
		n1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		n2 = sc.nextInt();
		
		if(n1>=n2)
		{
			max = n1;
			i= min = n2;
		}
		else
		{
			max = n2;
			i = min = n1;
		}
			
		while(i<=max)
		{
			sum += i;
			i++;
		}

		System.out.printf(">> %d ~ %d ������ �� : %d\n", min, max, sum);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,sum=0;
				
		System.out.print("ù ��° ���� �Է� : ");
		n1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		n2 = sc.nextInt();
		
		// ���� ���� n1���� �� �� �ֵ��� �ϴ� �ڵ�
		if(n1>=n2)
		{
			n1=n1^n2;
			n2=n2^n1;
			n1=n1^n2;
		}
		
		// �ݺ� ������ �����ϱ� ����
		// ���� ���� ���� �����Ͽ� ���� ������ Ȱ���Ѵ�
		int i = n1;
		
		while(i<=n2)
		{
			sum+=i;
			i++;
		}
		
		System.out.printf("%d ~ %d ������ �� %d\n", n1, n2, sum);
		
		
	}
}