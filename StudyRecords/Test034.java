/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- if ��
- if ~ else �� �ǽ�
===================================================*/

// ����)
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �������� ������� �Ǻ��Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է��� BufferedReader �� Ȱ���ϰ�,
// if  ���ǹ��� Ȱ���Ͽ� ������ ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 2000
// 2000�� �� ����
// ����Ϸ��� �ƹ� Ű�� ��������.

// import�� ���� �ʿ��� �ż������ �����Ѵ�.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;
		
		// ���� �Է� �˸� �޽��� ���
		System.out.print("������ ���� �Է� : ");
		// ���ڿ��� �Է� �޾� ������ ��ȯ�Ͽ� ������ �ִ´�.
		year = Integer.parseInt(br.readLine());
		
	    // if���� Ȱ���Ͽ� ������ 4�� ����̰� 100�� ����� �ƴҶ�
		// Ȥ�� 400�� ����϶� printf �ż��带 ���Ͽ� ���� ��� ���
		// �̿ܿ���, printf �ż��带 ���Ͽ� ��� ��� ���
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			System.out.printf("%d�� �� ����\n", year);
		else
			System.out.printf("%d�� �� ���\n", year);
	}
}

// ���� ���

/*
	1) ������ ���� �Է� : 2024
	   2024�� �� ����
       ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

	2) ������ ���� �Է� : 2025
       2025�� �� ���
       ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/