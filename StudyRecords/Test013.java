
// �� ������ �ڷ���
// �� �ڹ� �⺻ ����� : BufferedReader Ŭ���� Ȱ��

// Q. �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
//    �� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.

// �� ���� �ν� �� �м�
//	  �ﰢ���� ���� = �غ� * ���� / 2
//    ����ڷκ��� �����͸� �Է¹޾� ó�� - BufferedReader Ȱ��
//    �غ��� ���̸� ����ڷκ��� �Է¹޴´ٰ� �ؼ�
//    BufferedReader �� ���� Ȱ���� �ʿ�� ����. == Ű���� �ΰ��� ����� �ʿ�� ����!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		//�غ�, ����, ����
		int a, b;
		double area;					// �Ǽ� check!
				
		// ���� �� ó��
		
		// 1.����ڿ��� �ȳ� �޼��� ���
		System.out.println("=== �ﰢ���� ���̸� ���ϴ� ���α׷� ===");
		System.out.print("\n�ﰢ���� �غ� �Է� : ");
		
		// 2.����ڰ� �Է��� ������(���ڿ�)�� �޾ƿ� ���� ���·� ��ȯ�� ��
		//   ���� a �� ��Ƴ���
		a = Integer.parseInt(br.readLine());
		
		// 3. �ٽ� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("�ﰢ���� ���� �Է� : ");
		
		// 4. ����ڰ� �Է��� ������(���ڿ�)�� ���� ���·� ��ȯ�� ��
		//    ���� b�� ��Ƴ���
		b = Integer.parseInt(br.readLine());
		
		// 5. �ﰢ���� ���̸� ���ϴ� ���� ó��
		//    �ﰢ���� ���� = �غ� * ���� / 2.0;
		area = (a * b) / 2.0;						// �̶�, 2�� 2.0���� ���� �ʴ´ٸ� ���� ����� �������� ���Ͽ� �������� ������ �ȴ�.

		// ����! area = (double)(a*b/2); �� Ʋ�� ����! �ƴ�..��û�� ����
				
		
		// ��� ���
		
		System.out.println(); // ����. ����! System.out.print(); --==> ������ ���� �߻�
		
		System.out.printf("\n>> �غ��� %d, ���̰� %d�� �ﰢ���� ���̴� %.1f�Դϴ�.\n\n", a, b, area);

	}
}