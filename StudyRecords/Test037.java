/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- if ��
- if ~ else �� �ǽ�
===================================================*/

import java.util.Scanner;

public class Test037
{
	public static void main(String[] args)
	{
	  // �ֿ� ���� ����
	  Scanner sc = new Scanner(System.in);
	  int a, b, c, d, e; // ����ڷκ��� �Է¹��� �ټ� ���� ������ ��Ƶ� ����
	  int odd = 0, even = 0; // Ȧ,¦�� ���� ���� ��Ƴ� ���� ����
	  
	  // �� �������� ��Ƴ� ���� �ʱ�ȭ!!!!!
	  
	  // ���� �� ó��
	  System.out.print("������ ���� 5�� �Է�(���� ����) : ");
	  a = sc.nextInt();
	  b = sc.nextInt();
	  c = sc.nextInt();
	  d = sc.nextInt();
	  e = sc.nextInt();
	  
	  
	  if(a%2 != 0)				// a�� Ȧ���϶� odd�� a��ŭ ����
		  odd += a;		
	  else if(a%2 == 0)			// a�� ¦���϶� even�� a��ŭ ����
		  even += a;
	  else
		  System.out.printf("���� �߻�\n");
	  
	  if(b%2 != 0)
		  odd += b;
	  else if(b%2 == 0)
		  even += b;
	  else
		  System.out.printf("���� �߻�\n");

	  if(c%2 != 0)
		  odd += c;
	  else if(c%2 == 0)
		  even += c;
	  else
		  System.out.printf("���� �߻�\n");

	  if(d%2 != 0)
		  odd += d;
	  else if(d%2 == 0)
		  even += d;
	  else
		  System.out.printf("���� �߻�\n");

	  if(e%2 != 0)
		  odd += e;
	  else if(e%2 == 0)
		  even += e;
	  else
		  System.out.printf("���� �߻�\n");
	  
	  
	  // ��� ���
	  System.out.printf("\n¦���� ���� %d, Ȧ���� ���� %d �Դϴ�.\n\n", even, odd);
	  
	}
}

// ���� ���

/*
������ ���� 5�� �Է�(���� ����) : 11 22 33 44 55

¦���� ���� 66, Ȧ���� ���� 99 �Դϴ�.

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/