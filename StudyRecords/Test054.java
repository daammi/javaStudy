/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- �ݺ���(while��) �ǽ�
===================================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test054
{
	public static void main(String[] args) throws IOException
	{
	
		/*
		int num, i = 1, cnt = 0;
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.printf("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());
		
		while(i<num)
		{
			i++;
			
			if(num%i==0)
				cnt++;
		}
		
		if(cnt==1 || num != 1)
			System.out.printf(">> �Ҽ�\n");
		else
			System.out.printf(">> �Ҽ�x\n");
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num, i=2;

		String result="�Ҽ��� �ƴմϴ�";
		
		System.out.print("������ ������ �Է��Ͻÿ� : ");
		num = Integer.parseInt(br.readLine());
		
		while(i<num)
		{
			
			if(num%i==0){
				System.out.printf("%d��°�� Ȯ��\n",i);
				break;
			}
			else
				result = "�Ҽ��Դϴ�.\n";
					
			i++;
		}
					
		System.out.printf(">> %d��(��) %s", num, result );			
	}
}