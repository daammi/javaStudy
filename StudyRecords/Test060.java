/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- �ݺ���(do~while��) �ǽ�
===================================================*/

// ����ڷκ��� ���ϴ� ���� �Է¹޾�
// �ش� �������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, 1~ 9 �� ������ ���� �Է¹��� ��Ȳ�� �ƴ϶��
// �ٽ� ���� �� �ֵ��� �����Ѵ�.

import java.util.Scanner;

public class Test060
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num, i=0;
		
		do
		{
			System.out.printf("���ϴ� �� �Է� : ");
			num = sc.nextInt();
		}
		while (num<1||num>9);
		
		while(i<9){
			i++;
			System.out.printf("%d * %d = %d\n", num, i, num*i );
		}
	}
}