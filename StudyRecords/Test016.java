
// �� ������ �ڷ���
// �� �ڹ� �⺻ ����� : java.util.Scanner

// �� java.util.Scanner
//    �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//    ����Ʈ(default)�� ���Ǵ� �ܶ� ���ڴ� ����(����)�̴�.
//    �ۼ��� ���� ��ū�� next() �޼ҵ带 ���
//    �ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

import java.util.Scanner;
// import java.io.IOException;

public class Test016
{
	public static void main(String[] args) // throws IOException
	{
		// Scanner Ŭ���� ����� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		
		// �ֿ� ���� ����
		String name;
		int kor, eng, math;
		
		
		// ���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next();
		
	
		// �׽�Ʈ(Ȯ��)
		// System.out.println("�Է��Ͻ� �̸� : " + name);
		
		
		System.out.print("���� ���� �Է� : ");
		kor = sc.nextInt();
		
		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();
		
		System.out.print("���� ���� �Է� : ");
		math = sc.nextInt();
		
		
		// ��� ���
		System.out.println();
		System.out.println(">> �̸� : " + name);
		
		// ����! ���ڿ� ������ != ��� ������
		System.out.println(">> ���� : " + (kor+eng+math));
				
	}
}