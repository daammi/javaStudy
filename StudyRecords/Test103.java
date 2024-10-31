/*================================================
■■■ 클래스와 인스턴스 ■■■
- 클래스 설계
- 배열의 활용
- 정보은닉과 접근제어시시자(접근 지시자, 접근 제어자, 접근 지정자, 접근 제한자)
===================================================*/

//   사용자로부터 임의의 년, 월, 일을입력받아
//   해당 날짜의 요일을 출력하는 프로그램을 구현한다.
//   단, 달력 클래스는 사용하지 않는다.
//   또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다. (→ WeekDay 클래스 설계)
//   그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.
//   접근제어지시자의 개념도 확인하여 작성할 수 있도록 한다.
//   최종적으로... WeekDay 클래스 설계를 통해
//   Test103 클래스의 main() 메소드가 정상적으로 작동하여
//   프로그램 실행될 수 있도록 한다.

import java.util.Scanner;

class WeekDay
{
	private int y, m, d,num=0,tmp;
	private int[] nal = new int[7];
	private char[] yoil = {'일', '월','화','수','목','금','토'};
	
	WeekDay()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력(공백 구분) : ");
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
			System.out.printf("%d년 %d월 %d일은 %c요일\n",y,m,d, yoil[nal[sum%=7]]) ;
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