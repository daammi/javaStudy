/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- if ��
- if ~ else �� �ǽ�
===================================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		
		System.out.printf("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());
		
		if(num == 0)
			System.out.printf("%d �� ��\n", num);
		else if(num%2==0 && num%3==0)
			System.out.printf("%d �� 2�� 3�� ���\n", num);
		else if(num%2 == 0)
			System.out.printf("%d �� 2�� ���\n", num);
		else if(num%3 == 0)
			System.out.printf("%d �� 3�� ���\n", num);
		// �Ǽ�!! if(num%2!=0 && num%3!=0) ����!!
		else if(num%2!=0 || num%3!=0)
			System.out.printf("%d �� 2�� 3�� ��� �ƴ�\n", num);
		else
			System.out.printf("���� �Ұ� Ȯ�� �ʿ�\n");
	}
}