/* ================================================
���� ������(Operator) ����
- ���� ������(���� ������)
=================================================== */
/*
����ڷκ��� ������ �� ���ڸ� �Է¹޾� �Է¹��� ���ڰ� �빮���̸� �ҹ��ڷ�, �ҹ����̸� �빮�ڷ�
���ĺ��� �ƴ� ��Ÿ ���ڶ�� �� ���ڸ� �Է¹��� �״�� ����ϴ� ���α׷��� �����Ѵ�. 

���� ��)
�� ���� �Է� : 
A �� a
����Ϸ��� �ƹ� Ű�� ��������.... */

import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		/*
		int a, b;
		
		System.out.print("�� ���� �Է� : ");
		a = System.in.read();
		
		//(�빮�� ) ? (�ҹ���) : ((�ҹ���)? (�빮��):(�״��))
		b = (a >= 65 && a <= 90) ? (a+32) : ((a >= 97 && a <= 122) ? (a-32) : (a));
		
		//System.out.printf("%c �� %c\n", (char)a, (char)b);
		System.out.println((char)a + " �� " + (char)b);
		*/
		
		char ch, result;
		
		System.out.print("�� ���� �Է� : ");
		ch = (char)System.in.read();
		
		// Ȯ��
 		// System.out.println("�Է¹��� �� Ȯ�� : " + temp);
		
	    result = ( ch >= 'A' && ch <= 'Z' ) ? (char)(ch + 32) : ((ch >= 'a' && ch <= 'z') ? (char)(ch - 32) : ch);
		
		System.out.printf("%c  ��  %c\n", ch, result); 
		
	}
}