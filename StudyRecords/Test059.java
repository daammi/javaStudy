/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- �ݺ���(do~while��) �ǽ�
===================================================*/

// ����ڷκ��� ���� ���� ���� ������ �Է¹ް�
// �� ���� ����Ͽ� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ��, ����ڰ� -1 �� �Է��ϴ� ����
// �� �̻��� �Է� �ݺ� ������ �ߴ��ϰ�
// �� ���� �Էµ� ������ ���� ������ִ� ���α׷��� �����Ѵ�.
// ��, -1 �� �Է� ���� Ŀ�ǵ�� Ȱ���Ѵ�. do~while�� �� ��!!

import java.io.*;

public class Test059
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num, sum=1, i=0;
		
		do
		{
			i++;
			System.out.printf("%d��° ���� �Է�(-1 ����) : ", i);
			num = Integer.parseInt(br.readLine());
			sum += num;
		}
		while (num!=-1);
		
		System.out.println(">> ������� �Էµ� ������ �� : " + sum);
		
	}
}