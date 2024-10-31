/*================================================
■■■ 만년 달력 ■■■
 - 다음과 같은 기능의 프로그램을 구현한다.
===================================================*/

// 실행 예)
// 연도 를 입력하세요 :
// 월 을 입력하세요 : 

/*
	[ 2024년 10월 ]
	
일	월	화	수	목	금	토
==========================
		1	2	3	4	5
6	7	8	9	10	11	12
13	14	...

				31
==========================				
*/

import java.util.Scanner;

class WeekDay {
	
    int[][] arr = new int[6][7];
    int y, m, num = 0, tmp;
    int[] mD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    int sum = 0;
	int[] day = new int[7];
	int totDay; 

    WeekDay() {
        Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("연도를 입력하세요 : ");
			y = sc.nextInt();
		}
		while (y<1);

		do
		{
			System.out.print("월을 입력하세요 : ");
			m = sc.nextInt();
		}
		while (m<1||m>12);
		
		if (y % 4 != 0 || y % 100 != 0 || y % 400 == 0)
				mD[1] = 29;
		
		totDay=mD[m-1];
		
        for (int i = 1; i <= y; i++) {
            num += 1;
            num %= 7;
            tmp = num;

            for (int j = 0; j < day.length; j++) {
                day[j] = tmp++;
                tmp %= 7;
            }
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
                num++;
        }
		
        for (int i = 0; i < m-1; i++)
            sum += mD[i];

    }
	
	void input()
	{
		
	}

    void print() {
				
        int day = 1;
        System.out.printf("\n\t   [ %d년 %d월 ]\n\n", y, m);
        System.out.printf("   일   월   화   수   목   금   토\n");
        System.out.printf("====================================\n");
		
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 && j < sum%7+1)
                    arr[i][j]=0;
                else if (day <= totDay)    
                    arr[i][j] = day++;
                else 
                    break;
            }
        }
		
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

public class Test109 {
    public static void main(String[] args) {
        WeekDay wd = new WeekDay();
        wd.print();
    }
}
























/*
import java.util.Scanner;

class WeekDay {

    private int[][] arr = new int[6][7];  // 6주까지 고려 (최대 6주가 될 수 있음)
    private int y, mNum, dayOfWeek, numOfDays;
    int[] m = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    int sum = 0;

    WeekDay() {
        Scanner sc = new Scanner(System.in);
        System.out.print("년 월 입력(공백 구분) : ");
        y = sc.nextInt();
        mNum = sc.nextInt();

        // 윤년 계산
        if (isLeapYear(y)) {
            m[1] = 29;  // 2월이 29일
        }

        // 1년 1월 1일 기준으로 입력된 연도까지의 총 일수를 구함
        for (int i = 1; i < y; i++) {
            sum += isLeapYear(i) ? 366 : 365;
        }

        // 해당 연도의 입력된 달 이전까지의 일수를 더함
        for (int i = 0; i < mNum - 1; i++) {
            sum += m[i];
        }

        // 해당 달의 첫 번째 날의 요일을 구함
        dayOfWeek = (sum + 1) % 7;  // 1년 1월 1일이 월요일이라고 가정
        numOfDays = m[mNum - 1];    // 해당 월의 일수
    }

    // 윤년 계산 함수
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    void print() {
        System.out.printf("         [ %d년 %d월 ]         \n\n", y, mNum);
        System.out.printf("  일   월   화   수   목   금   토\n");
        System.out.println("=================================");

        // 달력 배열 초기화
        int day = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 && j < dayOfWeek) {
                    // 첫 번째 주의 시작 요일 이전은 공백으로 처리
                    arr[i][j] = 0;
                } else if (day <= numOfDays) {
                    // 날짜를 배열에 채움
                    arr[i][j] = day++;
                } else {
                    // 남은 칸은 0으로 채움
                    arr[i][j] = 0;
                }
            }
        }

        // 달력 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    System.out.print("     ");  // 공백
                } else {
                    System.out.printf(" %3d ", arr[i][j]);  // 날짜 출력
                }
            }
            System.out.println();
        }
        System.out.println("=================================");
    }
}

public class Test109 {
    public static void main(String[] args) {
        WeekDay wd = new WeekDay();
        wd.print();
    }
}
*/