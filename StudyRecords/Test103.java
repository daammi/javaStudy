/*================================================
���� Ŭ������ �ν��Ͻ� ����
- Ŭ���� ����
- �迭�� Ȱ��
- �������а� ��������ý���(���� ������, ���� ������, ���� ������, ���� ������)
===================================================*/

//   ����ڷκ��� ������ ��, ��, �����Է¹޾�
//   �ش� ��¥�� ������ ����ϴ� ���α׷��� �����Ѵ�.
//   ��, �޷� Ŭ������ ������� �ʴ´�.
//   ����, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�. (�� WeekDay Ŭ���� ����)
//   �׸���, �迭�� ���䵵 ������� �ۼ��� �� �ֵ��� �Ѵ�.
//   ���������������� ���䵵 Ȯ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
//   ����������... WeekDay Ŭ���� ���踦 ����
//   Test103 Ŭ������ main() �޼ҵ尡 ���������� �۵��Ͽ�
//   ���α׷� ����� �� �ֵ��� �Ѵ�.

import java.util.Scanner;

class WeekDay
{
	private int y, m, d,num=0,tmp;
	private int[] nal = new int[7];
	private char[] yoil = {'��', '��','ȭ','��','��','��','��'};
	
	WeekDay()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �� �Է�(���� ����) : ");
		y=sc.nextInt();
		m=sc.nextInt();
		d=sc.nextInt();		
	
		for(int i=1;i<=y;i++)
		{
			num+=1;
			num%=7;
			tmp = num;
			
			for(int j=0;j<nal.length;j++)
			{
				nal[j]=tmp++;
				tmp%=7;
			}			
			if(i%4==0&&i%100!=0||i%400==0)
						num++;	
		}
	}
	
	void nal()
	{
		int sum=0;
		
		switch(m-1)
		{
			case 11: sum+=30;
			case 10: sum+=31;
			case 9: sum+=30;
			case 8: sum+=31;
			case 7: sum+=31;
			case 6: sum+=30;
			case 5: sum+=31;
			case 4: sum+=30;
			case 3: sum+=31; 
			case 2:	if(y%4!=0||y%100!=0||y%400==0) sum+=29;
					else sum+=28;
			case 1: sum+=31;
		
			default: sum+=(d-1);
		}
			System.out.printf("%d�� %d�� %d���� %c����\n",y,m,d, yoil[nal[sum%=7]]) ;
	}
}
	
public class Test103
{
	public static void main(String[] args)
	{
		WeekDay wd = new WeekDay();
		wd.nal();
	}
}