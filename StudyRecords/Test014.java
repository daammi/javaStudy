
// �� ������ �ڷ���
// �� �ڹ� �⺻ ����� : BufferedReader Ŭ���� Ȱ��

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		
		// �ֿ� ���� ����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	
		String strName;
		int nKor, nEng, nMath, nTotal;
		
		String strTemp;
		
		// ���� �� ó��
		
		// - ����ڿ��� �ȳ� �޼��� ���
		System.out.printf("\n====���� �Է� ���α׷�====\n\n");
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		// - ����ڰ� �Է��� ��(�ܺ� ����Ʈ ������ -> ���ڿ�)�� ������ ��Ƴ���
		
		strName = br.readLine();
		// - ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� ���� �Է� : ");
		
		// - ����ڰ� �Է��� ��(�ܺ� ����Ʈ ������ -> ���ڿ�)�� �޾Ƽ� ������ ��ȯ �� ������ ��Ƴ���
		
		strTemp = br.readLine();
		nKor = Integer.parseInt(strTemp);
		
		// - ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� ���� �Է� : ");
		
		// - ����ڰ� �Է��� ��(�ܺ� ����Ʈ ������ -> ���ڿ�)�� �޾Ƽ� ������ ��ȯ �� ������ ��Ƴ���
		nEng = Integer.parseInt(br.readLine());
		
		// - ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� ���� �Է� : ");
		
		// - ����ڰ� �Է��� ��(�ܺ� ����Ʈ ������ -> ���ڿ�)�� �޾Ƽ� ������ ��ȯ �� ������ ��Ƴ���
		nMath = Integer.parseInt(br.readLine());
		
		// - ����
		nTotal = nKor + nEng + nMath;
		double fAvg = nTotal / 3.0;
		
		// - ��� ���
		System.out.println();
		System.out.println("====���====");
		System.out.printf("�̸� : %s\n���� : %d\n��� : %.2f\n", strName, nTotal, fAvg);
		System.out.println();
		
	}
	
}


