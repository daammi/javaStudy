/*=====================================
���� �ڹ��� �ֿ� Ŭ���� ����
- Wrapper Ŭ����
=======================================*/

// �߰� ����

public class Test139
{
	public static void main(String[] args)
	{
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);		
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);		
	
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);		
		
		System.out.println("1 : " + (3.0/0));
		System.out.println("2 : " + (-3.0/0));
		
		System.out.println("3 : " + (3.0/0 == 3.0/0));
		System.out.println("4 : " + (3.0/0 == -3.0/0));	
		
		System.out.println("5 : " + Double.isInfinite(3.0/0));
		System.out.println("6 : " + Double.isInfinite(-3.0/0));
		
		System.out.println("7 : " + (0.0/0));
		System.out.println("8 : " + (3.0/0 + - 3.0/0));
		
		System.out.println("9 : " + (0.0/0 == 0.0/0));
		System.out.println("10 : " + (0.0/0 != 0.0/0));
		
		System.out.println("11 : " + Double.isNaN(0.0/0));
		System.out.println("12 : " + Double.isNaN(1.0+2.0));		
		
//		�� NaN(Not a Number)�� ������ ����
//		   ũ�� �񱳸� �����ϴ� == �����ڸ� ���� �� ������ �����ϰ� �Ǹ�
//		   ����� ������ false�� ��ȯ�Ѵ�.
	}
}