/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- if ��
- if ~ else �� �ǽ�
===================================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�,
// ��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ������� ó���� �� �ֵ��� �Ѵ�.

import java.io.*;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		// ��� ��
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2;
		char op;
		
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("ù ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("������ �Է� [+ - * /] : ");
		op = System.in.read();	
		
		if(op == 43)
			System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
		else if(op == 45)
			System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		else if(op == 42)
			System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
		else if(op == 47)
			System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
		else
			System.out.printf("! �Է� ���� !\n");
		*/
		
		// ��� ��
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2;
		char op;
		
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("ù ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("������ �Է� [+ - * /] : ");
		op = (char)System.in.read();	
	 // op = (char)Integer.parseInt(br.readLine()); (X) 
		
		if(op == '+')
			System.out.printf("\n>> %d + %d = %d\n", num1, num2, num1+num2);
		else if(op == '-')
			System.out.printf("\n>> %d - %d = %d\n", num1, num2, num1-num2);
		else if(op == '*')
			System.out.printf("\n>> %d * %d = %d\n", num1, num2, num1*num2);
		else if(op == '/')
			System.out.printf("\n>> %d / %d = %d\n", num1, num2, num1/num2);
		else
			System.out.printf("! �Է� ���� !\n");
				
		*/
		
		// ��� ��
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, result = 0;
		char op;
		
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();
		
		if(op == '+')
			result = a+b;
		else if(op == '-')
			result = a-b;
		else if(op == '*')
			result = a*b;
		else if(op == '/')
			result = a/b;	
		
		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);
		
	}
}