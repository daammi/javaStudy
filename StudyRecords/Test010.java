
// �� ������ �ڷ���
//  
// Q. ������ �ο��� ������ ������ ����
//	  ���� ���̿� �ѷ��� ���ϴ� ���α׷��� �����Ѵ�.
//    - ������ : 10

import java.util.*;

public class Test010
{
	public static void main(String[] args)
	{
		//����
		/*
		double r =10;
		System.out.printf("���� : %f\n�ѷ� : %f\n", r*r*3.141592,2*3.141592*r);
		*/
		
		//¦��
		/*
		double pie = 3.141592;
		int r = 10;
		
		double a = r * r * pie;
		double b =
		*/
		
		// �ֿ� ���� ����
		int r = 10;
		final double PI = 3.141592;
		// ��final�� : ������ ���ȭ
		// �̶�, �ҹ����� ������ �̸��� �빮�ڷ� ����!
		
		double area, length;
		
		
		// ���� �� ó��
		
		// 1. ���� ����
		area = r * r * PI;
		
		
		//2. �ѷ� ����
		length = r * 2 * PI;
		
		
		// ��� ���
		System.out.println("���̴� "+ area);
		System.out.println("���̴� "+ length);
		
		
		
		
		
		/*
			���� : 314.159200
			�ѷ� : 62.831840
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/
		
	}
}

/*
	public class Test010
	{
	public static void main(String[] args)
	{
		double r;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է����ּ��� : ");
		r = sc.nextDouble();
		
		System.out.printf("���� : %f\n�ѷ� : %f\n", r*r*3.141592,2*3.141592*r);
		
	}
}
*/