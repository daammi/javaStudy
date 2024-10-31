/*================================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- Math Ŭ����
==================================================*/
/*

������ ȣ�� ���ϹǷ� �ν��Ͻ� ���� �Ұ�.
��� �޼ҵ� STATIC�̾, Ŭ���� ������ �����ϸ� �ȴ�. �� Math.PI

�� java.lang.Math Ŭ������

	����(Mathmatics)�� ���õ� ������ �Ӽ��� �޼ҵ带 �����ϴ� Ŭ������
	�����ڰ� �ֱ� ������... ��private������ ����Ǿ� �ֱ� ������
	�ܺο��� ��ü(�ν��Ͻ�) �� ������ �� ����.
	��, ��� �޼ҵ尡 ��static�� ���� ���ǵ�� �����Ƿ�
	��ü�� �������� �ʰ� �ٷ� �����Ͽ� ����ϴ� ���� �����ϴ�.


�� java.lang.Math Ŭ������ �ֿ� ��� �� �޼ҵ�

	- public static final double E = 2.71...;
	 : �ڿ� �α� ���

	- public static final double PI = 3.141592...;
	 : ������(��)	// ��

	- public static double sin(double a)
	- public static double cos(double a)
	- public static double tan(double a)
	 : sin(a), cos(a), tan(a) ���� ��ȯ�Ѵ�. (�ﰢ�Լ�)

	- public static double asin(double a)
	- public static double acos(double a)
	- public static double atan(double a)
	 : asin(a), acos(a), atan(a) ���� ��ȯ�Ѵ�. (�ﰢ�Լ��� ���Լ�)

	- public static double toRadians(double angdeg)
	 : ����(angdeg)�� ����(radian)���� �ٲپ� ��ȯ�Ѵ�.

	- public static double toDegrees(double angrad)
	 : ����(angrad)�� ����(degree)�� �ٲپ� ��ȯ�Ѵ�.

	- public static double exp(double a)
	 : e �� a ���� ���Ͽ� ��ȯ�Ѵ�.

	- public static double log(double a)
	 : �α�(log) ���� ���Ͽ� ��ȯ�Ѵ�.

	- public static double sqrt(double a)
	 : a �� �������� ���Ͽ� ��ȯ�Ѵ�.

	- public static double ceil(double a)
	 : a ���� ũ�ų� ���� ������ ��ȯ�Ѵ�. (�ø��� ����)

	- public static double floor(double a)
	 : a ���� �۰ų� ���� ������ ��ȯ�Ѵ�. (������ ����)

	- public static double pow(double a, double b)
	 : a �� b ���� ���Ͽ� ��ȯ�Ѵ�.

	- public static int round(float a)
	- public static long round(double a)
	 : a �� �ݿø��Ͽ� ������� ��ȯ�Ѵ�.

	- public static double random()
	 : 0.0 ~ 1.0 ������ ����(������ �Ǽ�)�� �߻����� ��ȯ�Ѵ�.

*/

public class Test150
{
	public static void main(String[] args)
	{
		System.out.println("������	   : " + Math.PI);
		System.out.println("2�� ������ : " + Math.sqrt(2));
		
		System.out.println("���̿� ���� Degree : "  + Math.toDegrees(Math.PI));
		System.out.println("2���̿� ���� Degree : "  + Math.toDegrees(2.0*Math.PI));
		
		double radian45 = Math.toRadians(45);
		System.out.println("���� 45 : " + radian45);
		
		System.out.println("����	45 : " + Math.sin(radian45));
		System.out.println("�ڽ���  45 : " + Math.cos(radian45));
		System.out.println("ź��Ʈ  45 : " + Math.tan(radian45));
		
		System.out.println("�α�    25 : " + Math.log(25));
		
		System.out.println("2�� 4��    : " + Math.pow(2, 4));
		
		System.out.println("0.0 ~ 1.0 ������ ���� : " + Math.random());
//		random �ż���� ������ ������ �ٸ���
		
		
	}
}