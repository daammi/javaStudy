/*================================================= 
���� Ŭ������ �ν��Ͻ� ���� 
===================================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// (�� Calculate Ŭ���� ����)

import java.util.Scanner;

class Calculate
{
	int n1,n2, result;
	char op;
	
	Calculate() {}			 // �⺻ ������				------- �̶�, �����ڴ� �Ž������ �����ϰ� �빮�ڷ� ����!
	Calculate(int a, int b)  // �Ű� ������ ���� ������ -------		  �����ڴ� �ν���Ʈ ������ �������� ���������� ȣ��!
		{
			n1=a;
			n2=b;
		}
		
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.printf("������ �� ���� �Է�(���鱸��) : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.print("������ ������ �Է�(+ - * /) : ");
		op = sc.next().charAt(0);	
	}
	
	void output(){
		switch(op){
			case '+': result = n1+n2; break;
			case '-': result = n1-n2; break;
			case '*': result = n1*n2; break;
			case '/': result = n1/n2; break;
			default: System.out.print("����!!!\n");
		}
		System.out.printf(">> %d %c %d = %d\n", n1, op, n2, result);
	}
}


public class Test077
{
	public static void main(String[] args)
	{
		Calculate ob = new Calculate();
	 // Calculate ob = new Calculate;			// �޸𸮿� �ۿ÷�!!
	 //						   +
	 //					   Calculate();			// ȣ��!!
		ob.input();
		ob.output(); 
	}
}