/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- �ݺ���(while��) �ǽ�
===================================================*/
		
// ����)
// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �Է¹��� �� ����������
// ��ü �հ�, ¦���� �հ�, Ȧ���� ����
// ���� ��������� ����ϴ� ���α׷��� �����Ѵ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test056
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num, i=0;
		int odd=0, even=0, sum=0;
		
		// ������ �Է¡� �˸� �޼���
		System.out.print("������ ���� �Է� : ");
		// ���ڿ��� ������ ��ȯ�Ͽ� ���� ���� �Է�
		num = Integer.parseInt(br.readLine());
			
			
		// �ݺ��� ���� ó��
		while(i<num){
			
			i++;
			
			if(i%2==0)
				even+=i;	// ¦���϶� ¦���տ� ���Ѵ�.
			else
				odd+=i;		// Ȧ���϶� Ȧ���տ� ���Ѵ�.
			
			sum+=i;			// ���ǰ� ������ ���տ� ���Ѵ�.
		}
		
		
		// ��� ��� �޼���
		System.out.printf("1 ~ %d ���� ������ �� : %d\n",num,sum);
		System.out.printf("1 ~ %d ���� Ȧ���� �� : %d\n",num,odd);
		System.out.printf("1 ~ %d ���� ¦���� �� : %d\n",num,even);
				
	}
}

// ���� ���

/*
	������ ���� �Է� : 100
	1 ~ 100 ���� ������ �� : 5050
	1 ~ 100 ���� Ȧ���� �� : 2500
	1 ~ 100 ���� ¦���� �� : 2550
	����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
	
	������ ���� �Է� : 586
	1 ~ 586 ���� ������ �� : 171991
	1 ~ 586 ���� Ȧ���� �� : 85849
	1 ~ 586 ���� ¦���� �� : 86142
	����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/