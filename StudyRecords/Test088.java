/*==================== 
���� �迭 ����
- �迭�� ����� �ʱ�ȭ
- �迭�� �⺻�� Ȱ��
======================*/

// ����ڷκ��� ������ �л� ���� �Է¹ް�
// �Է¹��� �л� �� ��ŭ�� ����(���� ����)�� �Է¹޾�
// ��ü �л� ������ ��, ���, ������ ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

import java.util.Scanner;

public class Test088
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num, sum=0;
		double avg;
		
		System.out.print("�л� �� �Է� : ");
		num = sc.nextInt();
		
		int[] score = new int[num]; 

		for(int i=0;i<score.length;i++){
			System.out.printf("%d�� �л��� ���� �Է� : ", i+1);
			score[i] = sc.nextInt();
			sum+=score[i];
		}
		
		avg=sum/(double)num;
	
		System.out.println(">> �� : "+sum);
		System.out.printf(">> ��� : %.1f\n",avg);
		System.out.println(">> ����"); 
		
//		for(int i=0;i<score.length;i++){
//			System.out.printf("%d : %.1f\n", score[i], avg-score[i]);
		
//		���� for��(forEach ����)
		
		for(int n : score)
			System.out.printf("%d : %.1f\n", n, n-avg);
		
		}
		
	}
}