
// �� ������ �ڷ���
// �� �ڹ� �⺻ ����� : java.util.Scanner

// �� java.util.Scanner
//    �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//    ����Ʈ(default)�� ���Ǵ� �ܶ� ���ڴ� ����(����)�̴�.
//    �ۼ��� ���� ��ū�� next() �޼ҵ带 ���
//    �ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

import java.util.Scanner;

public class Test017
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		//����.��õ��.����
		//����.������.����
		
		String name;
		int kor, eng, math, sum;
		
		// ���� �� ó��
		// - ����ڿ��� �ȳ� �޼��� ���
		System.out.print("�̸� ���� ���� ���� �Է� (��, ���� ����) : ");
		
		// - ����ڰ� �Է��� �����͸� ������ ��Ƴ���
		// �̶�, test = br.readLine()�� ���� ���ڿ��� �ۿ� ��Ƴ� �� ����.
		// �׷���, sc.next()�� ����ϸ� ���� ������ ������ ������ ��Ƴ� �� �� �ִ�.
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		// - ���� ����
		sum = kor + eng + math;
		
		
		// ��� ���
		System.out.println();
		System.out.println(">> �̸� : " + name);
		System.out.println(">> ���� : " + sum);

		
	}
}