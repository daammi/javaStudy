/*==================== 
���� �迭 ����
- �迭�� ����� �ʱ�ȭ
- �迭�� �⺻�� Ȱ��
======================*/

// ����ڷκ��� ������ ������ ������ ������ŭ �Է¹޾�
// �Է¹��� �� �߿��� ���� ū ���� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� ����ϵ��� �Ѵ�.

import java.util.Scanner;

public class Test087
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num, max;
		System.out.print("�Է��� �������� ���� : ");
		num=sc.nextInt();
		
		int[] arr = new int[num];
		
		System.out.print("������ �Է�(���� ����) : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		max = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(max<=arr[i])	
				max=arr[i];
		}
		
		System.out.printf("��ü ��� : ");
		for(int i=0;i<arr.length;i++)
			System.out.printf("%2d\n", arr[i]);
		
		System.out.printf(">> ���� ū �� �� %d", max);
		
	}
}