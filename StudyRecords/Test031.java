/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- if ��
- if ~ else �� �ǽ�
=================================================== 

1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
   �б� ������ ���ϱ� ���� ���Ǵ� �������
   if�� if~else�� ���� ������ ����if ��, switch�� ���� �ִ�.
   
2. if���� if ������ ������ ���� ���
   Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.*/

import java.io.*;

public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		
		System.out.printf("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());
		
		if(num % 2 == 0)
			System.out.printf("�Է��Ͻ� %d��(��) ¦���Դϴ�.\n", num);
		
		if(num % 2 != 0)
			System.out.printf("�Է��Ͻ� %d��(��) Ȧ���Դϴ�.\n", num);
			
	}
}