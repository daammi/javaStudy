/*================================================= 
���� Ŭ������ �ν��Ͻ� ���� 
===================================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �Է¹��� �� ������ ���� �����Ͽ�
// ��� ���� ����ϴ� ���α׷��� �����Ѵ�.

// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.(�� Hap Ŭ���� ����)
// �Է� �����Ͱ� 1���� �۰ų� 1000���� ū ���
// �ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ������ �� �ֵ��� �Ѵ�.

import java.io.*;

class Hap
{
	int num;
	
	Hap() throws IOException
	{
		do
		{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("������ ���� �Է�(1~1000) : ");
		num = Integer.parseInt(br.readLine());
		}while(num<1||num>100);
	}
		
	void sum()
	{
		int sum=0;
		for(int i=1; i<=num; i++)
			sum+=i;
		System.out.printf(">> 1~%d������ �� : %d\n", num, sum);
	}
}

public class Test076{

	public static void main(String[] args) throws IOException
	{
		// Hap �ν��Ͻ�(��ü) ����
		Hap ob = new Hap();	
		ob.sum();
	}
}