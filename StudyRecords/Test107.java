/*================================================
���� Ŭ������ �ν��Ͻ� ����
 - �޼ҵ� �ߺ� ����(Method Overloading)
===================================================*/

/*
�� �޼ҵ� �����ε�(Method Overloading)�� ����

   �޼ҵ� �����ε�(Method Overloading) �̶� �޼ҵ尡 ó���ϴ� ����� ����
   �޼ҵ� ��ȣ �ӿ� ���� �μ�(����, �Ű�����, �Ķ����)�� ������ �ٸ��ų�
   �ڷ���(Data Type) �� �ٸ� ��� �޼ҵ��� �̸��� ������ �̸����� �ο��Ͽ�
   �޼ҵ带 ������ �� �ֵ��� ���������� ����ϰ� �Ǵµ�,
   �̸� �޼ҵ� �����ε�(Method Overloading)�̶�� �Ѵ�.
*/ 

public class Test107
{
	public static void main(String[] args)
	{
		Test107.drawLine();
		drawLine();
		drawLine('=');
		drawLine('<');
		drawLine('>',30);
	}
	
	// ���� �׸��� �޼ҵ� ����
	public static void drawLine()
	{
		System.out.println("-----------------------------");
	}
	
	// ���� �׸��� �޼ҵ� ����
	public static void drawLine(char c)
	{
		for(int i=0;i<30;i++)
			System.out.print(c);
		System.out.println();
	}
	
	public static void drawLine(char c, int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(c);
		System.out.println();
	}
}