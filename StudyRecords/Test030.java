/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- if ��
- if ~ else �� �ǽ�
=================================================== 

1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
   �б� ������ ���ϱ� ���� ���Ǵ� �������
   if�� if~else�� ���� ������ ����if ��, switch�� ���� �ִ�.
   
2. if���� if ������ ������ ���� ���
   Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		int kor, eng, math, tot; 
		double avg;
		char grade;
		String name;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ����ڷκ��� �̸��� �Է¹޴´�.
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = br.readLine();
		
		// ����ڷκ��� ����, ����, ���� ������ �Է¹޴´�.
		System.out.print("���� ������ �Է��ϼ��� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� ������ �Է��ϼ��� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� ������ �Է��ϼ��� : ");
	    math = Integer.parseInt(br.readLine());
		
		// ��� ������ ���� ������ ����� ����Ѵ�.
		tot = kor + eng + math;
		avg =  tot / 3.0;
		
		// ��޿� ���� ���ǰ˻縦 �����Ѵ�.
		if(avg>=90)
			grade = 'A';
		else if(avg>=80)
			grade = 'B';
		else if(avg>=70)
			grade = 'C';
		else if(avg>=60)
			grade = 'D';
		else
			grade = 'F';
				
		// ���� ��� ���		
		System.out.printf("\n����� �̸��� %s�Դϴ�.\n", name);
		System.out.printf("���� ������ %d�Դϴ�.\n", kor);
		System.out.printf("���� ������ %d�Դϴ�.\n", eng);
		System.out.printf("���� ������ %d�Դϴ�.\n", math);	
		System.out.printf("������ %d�̰�, ����� %.2f�Դϴ�.\n", tot, avg);
		System.out.printf("����� %c �Դϴ�\n", grade);
	}
}

// ���� ���

/*
�̸��� �Է��ϼ��� : ������
���� ������ �Է��ϼ��� : 90
���� ������ �Է��ϼ��� : 80
���� ������ �Է��ϼ��� : 70

����� �̸��� �������Դϴ�.
���� ������ 90�Դϴ�.
���� ������ 80�Դϴ�.
���� ������ 70�Դϴ�.
������ 240�̰�, ����� 80.00�Դϴ�.
����� B�Դϴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/