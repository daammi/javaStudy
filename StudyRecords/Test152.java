/*================================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- Random Ŭ����
==================================================*/

// ���� �� �� �� ��

// ������ ���� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ 10ȸ (1~100)
// input :

import java.util.*;

public class Test152
{
	public static void main(String[] args)
	{
		Gogae gg = new Gogae();
		gg.print();
	}
}

class Gogae
{
	private int num, ans;
	
	Gogae()
	{
		Random rc = new Random();
		num=rc.nextInt(100)+1;
		System.out.println("������ 10ȸ (1~100)");	
	}
	
	private void input()
	{
		Scanner sc = new Scanner(System.in);	
		do
		{
			System.out.print("input : ");
			ans = sc.nextInt();
		}
		while (ans<1||ans>100);
	}
	
	public void print()
	{
		int cnt=1;
		
		while(cnt<=10)
		{
			input();
			
			if(num==ans)
			{
				System.out.printf("val = %d\ncount = %d\n",num,cnt);
				break;
			}
			else if(num>ans)
				System.out.printf("%d���� Ů�ϴ�.\n", ans);
			else
				System.out.printf("%d���� �۽��ϴ�.\n",ans);
			
			cnt++;
		}
		
		if(cnt>10)
			System.out.printf("val = %d\n�����߽��ϴ�.\n",num);
	}
}