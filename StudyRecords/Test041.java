/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- switch ����
===================================================*/

// ����ڷκ��� 1���� 3������ ���� �� �ϳ��� �Է¹޾�
// �Է¹��� ������ŭ�� ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
// ����� �ΰ����� �ۼ��Ѵ�.

// �� switch ���� �Ϲ� ���� ����Ͽ� �����Ѵ�.
// �� switch ���� �⺻ ���� ����ϵ�,
//    break�� �� �� ���� ����� �� �ֵ��� �Ѵ�.

import java.util.Scanner;

public class Test041
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		String star = "�Է¿���!\n";
		
		System.out.print("������ ���� �Է�(1~3) : ");
		num = sc.nextInt();
		
		// ��� ��
		
		/*
		switch(num)
		{	
			case 3: System.out.println("�� �� �� "); break;
			case 2: System.out.println("�� �� "); break;
			case 1: System.out.println("�� "); break;
			
			default: System.out.print("�Է¿���!\n");
		}
		*/
		
		// ��� ��
		
		switch(num)
		{
			case 3: System.out.print("�� ");
			case 2: System.out.print("�� "); 
			case 1: System.out.print("�� \n"); break;
			
			default: System.out.print("�Է¿���!\n");
		}
	}
}