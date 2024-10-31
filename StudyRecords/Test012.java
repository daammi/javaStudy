
// �� ������ �ڷ���
// �� �ڹ� �⺻ ����� : BufferedReader Ŭ���� Ȱ�� 

import java.io.*;
// io == input / output

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

public class Test012
{
	public static void main(String[] args) throws IOException
	{
		// Ű����(����)�� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// -----------------------------------
		//     ���� �Է��� �о�帮�� ��ġ
		//                                     ---------------------
		//                                      ����Ʈ �� ����(����)
		//                                                           ----------
		//                                                           ����Ʈ �Է°�
		
		
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int r;
		final double PI = 3.141592;
		double area, length;
		
		// ���� �� ó��
		// 1. ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� ������ �Է� : ");
		
		// 2. ����ڰ� �Է��� ���� �޾ƿ� ������ ���� r�� ���
		// br.readLine(); �� BufferedReader�� readLine == �Է� ��⿭�� �����ִ� ���ڿ� ��ȯ
		// ex."1234"
		
		//Integer.parseInt("1234"); �� 1234��� ������ ��ȯ
		//Integer.parseInt("���"); �� ���� �߻�
		//Integer.parseInt("adas"); �� ���� �߻�
		
		r = Integer.parseInt(br.readLine());
		// ����� �Է� �� �� br�� ���ڿ� ���·� �о�帰 ��
		// �� ���� ���������� ��ȯ �� ���� r�� ��� ����
		
		// 3. ���� �� �ѷ� ���
		//    ���� ����� ���� ���� area, length�� ��Ƴ���
		area = r*r*PI;
		length = r*2*PI;
		
		// ���� ��� ���
		// ���� area�� length�� ����ִ� �� ���
		System.out.printf("�������� %d�� ���� ���̴� %f �̸�,\n�������� %d�� ���� �ѷ��� %f �̴�.\n",r, area,r, length);
		
		// ���� ������ �Է� : 5
		// ���� : 78.5398
	    // �ѷ� : 31.4159
		
		/*
		���� ������ �Է� : 42
		�������� 42�� ���� ���̴� 5541.7683 �̸�,
		�������� 42�� ���� �ѷ��� 263.8937 �̴�.
		*/
		
	}
}