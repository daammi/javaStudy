
// �� ������ �ڷ���
// �� �ڹ� �⺻ ����� : java.util.Scanner

// �� java.util.Scanner
//    �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//    ����Ʈ(default)�� ���Ǵ� �ܶ� ���ڴ� ����(����)�̴�.
//    �ۼ��� ���� ��ū�� next() �޼ҵ带 ���
//    �ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

import java.util.Scanner;

public class Test018
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, math, sum;
		
		
		 
		// ���� �� ó��
		System.out.print("�̸�, ����, ����, ����, �Է� (��, ��,���� ����) : ");
		
		// �׽�Ʈ(Ȯ��)
		//String temp = sc.next();
		//System.out.println("temp : " + temp);
		//--==> temp : ������,100,100,100

		
		sc = new Scanner(sc.next()).useDelimiter(",");        // int n = 10;          n = n + 1;
		//               ---------
		//          ������,100,100,100
				
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		sum = kor + eng + math;
		
		// ��� ���
		System.out.println();
		System.out.println(">> �̸� : "+ name);
		System.out.println(">> ���� : " + sum);
		
	}
}