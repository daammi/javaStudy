/*
 �� �ڹ��� ���� �� Ư¡ ��
 �� ������ �ڷ���
 �� Ű���� �� �ĺ���
 �� printf()
*/
public class Test005
{
	public static void main(String[] args)
		{
			// ���� ����(�޸� Ȯ��) �� �ʱ�ȭ(�޸𸮿� �� �Ҵ�)
			// int a=10;
			// int b=5;
			int a=10, b=5;
			
			// ������ ���� ����
			int c, d;
			
			// ���� �� ó��
			c = a + b; 
			d = a - b; 
			
			// ��� ���
			System.out.println(a+" + "+b+" = "+c);
			
			// print() / println() / printf() / format()
			
			// ���ڿ� ���� �ȿ��� ���Ǵ� ��"\n"��, ��"%n"���� ����!
			System.out.print("1\n2\n3\n");
			
			// printf() / format()
			// JDK 1.5 ���� �����Ǵ� �޼ҵ�
			
			System.out.printf("%d * %d = %.1f\n", 10, 20, (double)200);
			System.out.printf("%d+%d=%.2f\n", a, b, (double)c);
			System.out.printf("%.0f / %.0f = %.2f%n", (double)19, (double)4, (double)19/4);
			
			// 10�� 20 - ���� �ۼ�
			System.out.printf("%d�� %d\n", 10, 20);
			
			// 10�� 3.14 - ���� �ۼ�
			// System.out.printf("%d�� %d\n", 10, 3.14);
			// --==>��Ÿ�� ������ �߻��Ѵ�.
			System.out.printf("%d�� %f\n", 10, 3.14);
			
			// ��%d���� ������ ���� ���� �ɼ�
			// ��%f���� �Ǽ��� ���� ���� �ɼ�
			
			System.out.printf("%d�� %.2f\n", 10, 3.14);
			
			System.out.printf("%.3f\n", 3.1415923);
			// �ݿø� �߻�!
			
		}
}