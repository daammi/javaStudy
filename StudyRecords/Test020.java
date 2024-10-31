/* ================================================
���� ������(Operator) ����
- ��� ������
- BufferedReader
- printf()
===================================================*/


// ����ڷκ��� ������ ������ �� �� �Է¹޾�
// ��Ģ ���� �� ������ ������ �����Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է¹޴� ������ BufferedReader �� Ȱ���� �� �ֵ��� �ϰ�,
// �������ϴ� ������ printf() �޼ҵ带 Ȱ���� �� �ֵ��� �Ѵ�.
// ����, ������ ������ ���ǻ� ���� ���(���� ���ϴ� ����)���� ó���Ѵ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test020
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		int n1, n2;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		// ���� �� ó��
		System.out.printf("ù��° ���� �Է� : ");
	    n1 = Integer.parseInt(br.readLine());
		System.out.printf("�ι�° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());
		
		
		// ��� ���
		System.out.printf("\n====== ��� ======\n");
		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
		System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
		System.out.printf("%d * %d = %d\n", n1, n2, n1 * n2);
		System.out.printf("%d / %d = %.2f\n", n1, n2, (double)n1 / n2);
		System.out.printf("%d %% %d = %d\n", n1, n2, n1 % n2);
		
		/*
		
		// �ֿ� ���� ����
		int n1, n2;
		int res1, res2, res3, res4, res5;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		// ���� �� ó��
		System.out.printf("ù��° ���� �Է� : ");
	    n1 = Integer.parseInt(br.readLine());
		System.out.printf("�ι�° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());
		
		res1 = n1 + n2;
		res2 = n1 - n2;
		res3 = n1 * n2;
		res4 = n1 / n2;
		res5 = n1 % n2;
		
		// ��� ���
		System.out.printf("\n====== ��� ======\n");
		System.out.printf("%d + %d = %d\n", n1, n2, res1);
		System.out.printf("%d - %d = %d\n", n1, n2, res2);
		System.out.printf("%d * %d = %d\n", n1, n2, res3);
		System.out.printf("%d / %d = %d\n", n1, n2, res4);
		System.out.printf("%d %% %d = %d\n", n1, n2, res5);
		System.out.printf("\n==================\n");
		 
		*/
		
	}
}