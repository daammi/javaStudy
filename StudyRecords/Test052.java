/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- �ݺ���(while��) �ǽ�
===================================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �ش� ���� �ڸ����� ����ϴ� ���α׷��� �����Ѵ�.

import java.io.*;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*
		int n, len=1, m=1;
		
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		
		while (true)
		{	
			if(n/(m*=10) == 0)
				break;
			len++;
		}
		
		System.out.printf(">> %d�� �ڸ����� %d\n", n, len);
*/

		int num;
		int len;
		int temp;
		
		temp=num;
		len=1;
		
		while(temp<0){
			temp/=10;
			len++;
		}
		System.out.printf(">> %d�� �ڸ����� %d�Դϴ�.\n", num, len);

	}
}