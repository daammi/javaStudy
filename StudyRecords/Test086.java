/*==================== 
���� �迭 ����
- �迭�� ����� �ʱ�ȭ
- �迭�� �⺻�� Ȱ��
======================*/

// ����ڷκ��� �ο����� �Է¹ް�
// �Է¹��� �ο�����ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹ް�
// �̷��� �Է¹��� �����͸� �̸� �迭�� ��ȭ��ȣ �迭�� �����Ͽ�
// ����� ����� �� �ִ� ���α׷��� �����Ѵ�.

import java.util.Scanner;

public class Test086
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;

		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			num = sc.nextInt();
		}
		while (num<1||num>10);
		
		String[] name = new String[num];
		String[] hp = new String[num];
				
		for(int i=0;i<num;i++)
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", i);
			name[i] = sc.next();
			hp[i] = sc.next();
		}
		System.out.println("");
		System.out.println("=====================");
		System.out.printf("��ü �л� �� : %d��\n", num);
		System.out.println("=====================");
		System.out.println("�̸�	��ȭ��ȣ");
		for(int i=0;i<num;i++)
			System.out.printf("%s %s\n", name[i], hp[i]);
		System.out.println("=====================");
		
	}
}