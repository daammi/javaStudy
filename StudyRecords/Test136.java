/*=====================================
���� �ڹ��� �ֿ� Ŭ���� ����
- BigInteger Ŭ����
=======================================*/

import java.math.BigInteger;

public class Test136
{
	public static void main(String[] args)
	{
//		�Ұ���
//		int a1 = 123456789123456789;
		long a1 = 123456789123456789L;
		System.out.println(a1);
	
		BigInteger a = new BigInteger("123456789123456789");
		BigInteger b = new BigInteger("123456789123456789");
		System.out.println(a);
		System.out.println(b);
		
//		BigInteger c = a + b; // ��ü�� ��ĳ �� ���ؤ���

		BigInteger c = a.add(b);
		System.out.println("���� ��� : " + c);
		
		BigInteger d = a.subtract(b);
		System.out.println("���� ��� : " + d);		

		BigInteger f = a.divide(b);
		System.out.println("������ ��� : " + f);
		
		BigInteger g = new BigInteger("2");
		System.out.println("2�� 3�� : " + g.pow(3));
	}
}