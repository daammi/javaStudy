/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- �ݺ���(while��) �ǽ�
===================================================*/

// ����ڷκ��� ���ϴ� ���� �Է¹޾�
// �ش� �������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, 1~9�� ������ ���� �Է¹��� ��Ȳ�� �ƴ϶��
// �̿� ���� �ȳ��� �� �� ���Ϸ��� ������ �� �ֵ��� ó���Ѵ�.

import java.io.*;

public class Test057
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num,i=0;
			
		System.out.print("���ϴ� �� �Է� : ");
		num = Integer.parseInt(br.readLine());
		
		if(num>=1 && num<=9)
		{
			while(i<9)
			{
				i++;
				System.out.printf("%d * %d = %d\n", num, i,num*i);
			}
		}
		else
		{
				System.out.printf("1 ���� 9 ������ ������ �Է��� �����մϴ�.\n");
				return;
		}	
	}
		
}
