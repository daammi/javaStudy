
// �� ������ �ڷ���
// �� �ڹ� �⺻ ����� : System.in.read()
// �� Ŭ������ ����, �޼���� ����, ������ ����

/*
	��System.in.read()�� �޼ҵ�� (�Է� ��⿭�� ����) �� ���ڸ� �����´�.
	��, �Է¹��� �ϳ��� ���ڸ� �״�� �������� ���� �ƴ϶�
	ASCII Code ������ ��ȯ�ϰ� �ȴ�.
*/

import java.io.IOException;

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		/*
		// �ֿ� ���� ����
		//char ch;
		int ch;
			
		// ���� �� ó��
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		//ch = (char)System.in.read();                 // - ����� �� ��ȯ
		ch = System.in.read();
		
		// ��� ���
		System.out.println("ch : "+ ch);
		*/
		
		/*
		char cCh;
		char nNum;

		System.out.print("�� ���� �Է�    : ");
		cCh = (char)System.in.read();
		System.in.read();
		System.in.read();
		

		System.out.print("�� �ڸ� ���� �Է�    : ");
		nNum = (char)System.in.read();

		System.out.println();
		System.out.println(">> �Է��� ���� : "+ cCh);
		System.out.println(">> �Է��� ���� : " + nNum);
		*/
		
		// �ֿ� ���� ����
		char ch
		int n;
		
		
		// ���� �� ó��
		
		// - ����� �ȳ� �޼��� ���
		System.out.print("�� ���� �Է�      : ");
		ch = (char)System.in.read();
		char kh;
		// check!!
		// �Է� ��⿭�� �����ִ� \r�� \n�� �ǳʶپ��. (��ŵ)
		
	
		// �Ű�����(2)�� ���� �� ���ڸ� ���� �ʰ� �ǳʶڴ�. (������.)
		
		// - ����� �ȳ� �޼��� ���
		System.out.print("�� �ڸ� ���� �Է� : ");
		n = System.in.read(); 
		
		// ASCII Code�� ��ŭ ���ش� �� -48 or -'0'
		n -= 48;
		
		// ��� ���
		System.out.println();
		System.out.println(">> �Է��� ���� : "+ ch);
		System.out.println(">> �Է��� ���� : "+ n);
		
	}
}