/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- switch ����
===================================================*/
                               
// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.
          
import java.util.Scanner;
            
public class Test042
{              
	public static void main(String[] args)
	{
		
		// ��� ��
		
		/*
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		char op;
		
		System.out.print("ù ��° ���� �Է� : ");
		num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		num2 = sc.nextInt();
		System.out.print("������ �Է� [+ - * /] : ");
		op = sc.next().charAt(0);
		
		switch(op)
			{
				case '43': System.out.printf("%d %c %d = % d\n", num1, op, num2, num1+num2); break;
				case '45': System.out.printf("%d %c %d = % d\n", num1, op, num2, num1-num2); break;	
				case '42': System.out.printf("%d %c %d = % d\n", num1, op, num2, num1*num2); break;
				case '47': System.out.printf("%d %c %d = % d\n", num1, op, num2, num1/num2); break;
				
				default: return; // return �� 1. ���� ��ȯ
								 //           2. �޼ҵ� ���� �� main() �޼ҵ� ���� (WHY? main �ȿ��� return�� ��� ����) �� ���α׷� ����
		
			}
		*/
		
		// ��� ��
		
		/*
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		char op;
		
		System.out.print("ù ��° ���� �Է� : ");
		num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		num2 = sc.nextInt();
		System.out.print("������ �Է� [+ - * /] : ");
		op = sc.next().charAt(0);
		
		switch(op)
			{
				case '+': System.out.printf("%d %c %d = % d\n", num1, op, num2, num1+num2); break;
				case '-': System.out.printf("%d %c %d = % d\n", num1, op, num2, num1-num2); break;	
				case '*': System.out.printf("%d %c %d = % d\n", num1, op, num2, num1*num2); break;
				case '/': System.out.printf("%d %c %d = % d\n", num1, op, num2, num1/num2); break;
				
				default: return; // return �� 1. ���� ��ȯ
								 //           2. �޼ҵ� ���� �� main() �޼ҵ� ���� (WHY? main �ȿ��� return�� ��� ����) �� ���α׷� ����
		
			}		
		*/
		
		// ��� ��
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		String op;
		
		System.out.print("ù ��° ���� �Է� : ");
		num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		num2 = sc.nextInt();
		System.out.print("������ �Է� [+ - * /] : ");
		op = sc.next();
		
		switch(op)
			{
				case "+": System.out.printf("%d %s %d = % d\n", num1, op, num2, num1+num2); break;
				case "-": System.out.printf("%d %s %d = % d\n", num1, op, num2, num1-num2); break;	
				case "*": System.out.printf("%d %s %d = % d\n", num1, op, num2, num1*num2); break;
				case "/": System.out.printf("%d %s %d = % d\n", num1, op, num2, num1/num2); break;
				
				default: return; // return �� 1. ���� ��ȯ
								 //           2. �޼ҵ� ���� �� main() �޼ҵ� ���� (WHY? main �ȿ��� return�� ��� ����) �� ���α׷� ����
		
			}	
	}
}