/*================================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- Random Ŭ����
==================================================*/

/*
�� java.util.Random Ŭ������

   ���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
   Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵 ������ �߻����� �����ϴ� �޼ҵ�������
   0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
   �ʿ��� ���� ������ ������ ������ ���ؼ��� �߰����� ������ �����ؾ� �Ѵ�.
   �׷��� �ڹٴ� ������ �߻������ִ� ���� Ŭ������
   Random Ŭ������ ������ �����ϰ� �ִ�.
   
*/

// �ζ� ��ȣ ����(���� �߻�) ���α׷�

// ���α׷��� ����Ǹ�...
// �⺻������ �ζǸ� 5���� �����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// 3 5 12 24 31 42
// 1 2 8 36 40 43
// 4 9 12 13 22 34
// 5 10 13 17 21 40
// 22 31 36 37 40 43
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.*;

public class Test151
{
	public static void main(String[] args)
	{
/*
		Random rc = new Random();
		
		int[] lotto = new int[6];
		int n=0;
		
		while(n<5)
		{
			for(int i=0;i<lotto.length;i++){
				
				lotto[i]=rc.nextInt(45)+1;
				
				for(int j=0;j<i;j++)
				{
					if(lotto[i]==lotto[j])
					{
						i--;
						break;
					}
				}
			}
			
			for(int i=0;i<lotto.length-1;i++)
			{
				for(int j=i+1;j<lotto.length;j++)
				{
					if(lotto[i]>lotto[j])
					{
						lotto[i]=lotto[i]^lotto[j];
						lotto[j]=lotto[j]^lotto[i];
						lotto[i]=lotto[i]^lotto[j];				
					}
				}
			} 
			
			
			for(int i : lotto)
				System.out.printf("%3d", i);
			n++;
			
			System.out.println();
		}		
*/		
	Lotto ob = new Lotto();
	
		for(int i=0;i<5;i++)
		{	
			ob.start();
			int[] num = ob.getNum();
		
			for(int n : num)
				System.out.printf("%4d", n);
			System.out.println();
		}
	
	}
}

class Lotto
{
	// �ֿ� �Ӽ� ����
	// �ζ� ��ȣ�� ��Ƶ� �迭�� 6ĭ
	// �� �迭 ���� ���� �� �޸� �Ҵ�
	private int[] num;
	
	Lotto()
	{
		num = new int[6];
	}
	
	public int[] getNum()
	{
		return num;
	}
	
	// 6���� ������ �߻���Ű�� �޼ҵ� ����(�ߺ� ����)
	public void start()
	{
		Random rc = new Random();
		int n;
		int cnt = 0;
		
	jump:
		
		while(cnt<6)
		{
			n=rc.nextInt(45)+1;
			
			for(int i=0;i<cnt;i++)
			{
				if(num[i]==n)
					continue jump;
					
			}
			
			num[cnt++]=n;
			
//			cnt++;
		}
		
		sort();
		
	}
	
	// ���� �޼ҵ� ����
	private void sort()
	{
		Arrays.sort(num);
	}
	
	
}