/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- if ��
- if ~ else �� �ǽ�
=================================================== */

// Test031 �� Ȧ��, ¦�� ���� �� ���� if ����

// Ȧ��, ¦��, �� �� if ~ else �� ��ø

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		
		System.out.printf("������ ������ �Է��Ͻÿ� : ");
		num = Integer.parseInt(br.readLine());
		
		/*
		if(num % 2 == 0 && num != 0)
			System.out.printf("�Է��Ͻ� %d��(��) ¦�� �Դϴ�.\n", num);
		else if(num != 0 && num % 2 != 0)
			System.out.printf("�Է��Ͻ� %d��(��) Ȧ�� �Դϴ�.\n", num);
		else
			System.out.printf("�Է��Ͻ� %d��(��) ���� ���Դϴ�.\n", num);
		*/
		
		if(num == 0)
			System.out.printf("�Է��Ͻ� %d��(��) ���� ���Դϴ�.\n", num);
		else if(num % 2 != 0)
			System.out.printf("�Է��Ͻ� %d��(��) Ȧ�� �Դϴ�.\n", num);
		else
			System.out.printf("�Է��Ͻ� %d��(��) ¦�� �Դϴ�.\n", num);
		
	}
}