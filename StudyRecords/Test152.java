/*================================================
■■■ 자바의 주요(중요) 클래스 ■■■
- Random 클래스
==================================================*/

// 스무 고개 → 열 고개

// 다음과 같은 프로그램을 구현한다.

// 실행 예)
// 스무고개 10회 (1~100)
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
		System.out.println("스무고개 10회 (1~100)");	
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
				System.out.printf("%d보다 큽니다.\n", ans);
			else
				System.out.printf("%d보다 작습니다.\n",ans);
			
			cnt++;
		}
		
		if(cnt>10)
			System.out.printf("val = %d\n실패했습니다.\n",num);
	}
}