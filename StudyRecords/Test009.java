
// �� ������ �ڷ��� ��
// �� ������ �ڷ��� �ǽ� �� �׽�Ʈ : double
// �� ������ ���� �ǽ�

public class Test009
{
	public static void main(String[] args)
		{
			// ������ ������ ������
			// double a = 1 / 2;
			double a = 1 / 2f;
			
			System.out.println("double a : "+a);
			
			double b = (double)1 / 2;
			System.out.println("double b : "+b);
			
			double c = 1/2 + 1/2;
			// double c = 0 + 1/2;
			// double c = 0 + 0;
			// double c = 0;
			// double c = 0.0;
			System.out.println("double c : "+ c);
			
			// �� �����ڿ� �Ǽ��� ���ԵǾ� �ִ� ������ ����
			double d = 1 / 2.0;
			System.out.println("double d : "+ d);
			// ������ ����� �����Ͽ�
			// �ǿ����� �� �Ǽ��� �ϳ��� ȣ�ԵǾ� �ִٸ�
			// ������ �Ǽ� ����� �ȼ��� ����Ǹ�
			// ����� ���� �Ǽ� ���·� ��ȯ�ȴ�.
			
			double e = 3/2 + 1/2;
			System.out.println("double e : " + e);
			// double e : 1.0
			
			double f = 3/2 + 1/2.0;
			// double f = 1 + 1/2.0;
			// double f = 1 + 0.5;
			// double f = 1.0 + 0.5;
			// double f = 1.5;
			
			System.out.println("double f : " + f);
			// double f : 1.5
		}
}