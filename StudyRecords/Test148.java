/*================================================
■■■ 자바의 주요(중요) 클래스 ■■■
- Calendar 클래스
==================================================*/

/*
○ java.util.Calendar 클래스는
   날짜와 시간을 객체 모델링화 한 클래스로
   연, 월, 일, 요일, 시, 분, 초 까지의
   시간과 날짜와 관련된 정보를 제공한다.
   그리고, Calendar 클래스는 추상 클래스이므로 직접 객체를 생성할 수 없으며
   실제적인 메소드 구현은 Calendar 클래스의 서브 클래스인
   GregorianCalendar 클래스에 정의되어 있다.

   시스템으로부터 현재 시스템 시간 정보를 얻어올 때
   getInstance() 라는 정적(static) 메소드를 이용하여 객체를 생성할 수 있다.
   생성된 Calendar 클래스 객체는 시스템의 현재 날짜와 시간 정보를 가지며,
   이 객체가 생성되면 갖고있는 시간 정보들은
   get() 메소드를 이용하여 쉽게 가져올(사용할) 수 있다.

   getInstance() 메소드는 내부적으로 GregorianCalendar 객체를 생성하여
   반환해 주기 때문에  GregorianCalendar 객체를 직접 생성하여 날짜 시간 정보를
   구할 수도 있다.
*/

/*
○ 실습 문제

   사용자로부터 연, 월을 입력받아
   달력을 그려주는(출력하는) 프로그램을 구현한다.
   단, Calendar 클래스를 활용하여 작성할 수 있도록 한다.
   ※ API Document 참조하여 getActualMaximum() 메소드의 활용 방법 검토할 것~!!!


실행 예)
연도 입력 : 0
연도 입력 : 2024
월 입력   : -10
월 입력   : 13
월 입력   : 5

   [ 2024 년 5월 ]

 일  월  화  수  목  금  토
===========================
              1   2   3   4
  5   6   7   8   9  10  11
 12  13  14  15  16  17  18
 19  20  21  22  23  24  25
 26  27  28  29  30  31
===========================
계속하려면 아무 키나 누르세요...

*/

import java.util.*;

public class Test148
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Calendar ob = Calendar.getInstance();
		int[][] arr = new int[6][7];
		int y,m,d=1;
		
		do
		{
			System.out.print("연도 입력 : ");
			y=sc.nextInt();
		}
		while (y<1);
		
		do
		{
			System.out.print("월 입력 : ");
			m=sc.nextInt();
		}
		while (m<1||m>12);
		
		ob.set(y,m-1,d);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==0&&j<ob.get(Calendar.DAY_OF_WEEK)-1)
				{
					arr[i][j] = 0;
				}
				else if(d<=ob.getActualMaximum(Calendar.DATE))
				{
					arr[i][j] = d++; 
				}
				else
				{
					arr[i][j] = 0;
				}
				
			}
		}
		
		System.out.printf("\t[ %d 년 %d 월 ]\n", y, m);
		System.out.println("=======================");	
		System.out.println("   일   월   화   수   목   금   토");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==5&&arr[i][j]==0)
					break;
				else if(arr[i][j]!=0)
					System.out.printf("%5d",arr[i][j]);
				else
				System.out.printf("     ");
			}
			if(i!=0 && arr[i][0]==0)
				break;
			System.out.println();
		}
		
		System.out.printf("====================================\n");
	}
}