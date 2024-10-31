/*================================================
���� ���� �޷� ����
 - ������ ���� ����� ���α׷��� �����Ѵ�.
===================================================*/

// ���� ��)
// ���� �� �Է��ϼ��� :
// �� �� �Է��ϼ��� : 

/*
	[ 2024�� 10�� ]
	
��	��	ȭ	��	��	��	��
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
			System.out.print("������ �Է��ϼ��� : ");
			y = sc.nextInt();
		}
		while (y<1);

		do
		{
			System.out.print("���� �Է��ϼ��� : ");
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
        System.out.printf("\n\t   [ %d�� %d�� ]\n\n", y, m);
        System.out.printf("   ��   ��   ȭ   ��   ��   ��   ��\n");
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

    private int[][] arr = new int[6][7];  // 6�ֱ��� ��� (�ִ� 6�ְ� �� �� ����)
    private int y, mNum, dayOfWeek, numOfDays;
    int[] m = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    int sum = 0;

    WeekDay() {
        Scanner sc = new Scanner(System.in);
        System.out.print("�� �� �Է�(���� ����) : ");
        y = sc.nextInt();
        mNum = sc.nextInt();

        // ���� ���
        if (isLeapYear(y)) {
            m[1] = 29;  // 2���� 29��
        }

        // 1�� 1�� 1�� �������� �Էµ� ���������� �� �ϼ��� ����
        for (int i = 1; i < y; i++) {
            sum += isLeapYear(i) ? 366 : 365;
        }

        // �ش� ������ �Էµ� �� ���������� �ϼ��� ����
        for (int i = 0; i < mNum - 1; i++) {
            sum += m[i];
        }

        // �ش� ���� ù ��° ���� ������ ����
        dayOfWeek = (sum + 1) % 7;  // 1�� 1�� 1���� �������̶�� ����
        numOfDays = m[mNum - 1];    // �ش� ���� �ϼ�
    }

    // ���� ��� �Լ�
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    void print() {
        System.out.printf("         [ %d�� %d�� ]         \n\n", y, mNum);
        System.out.printf("  ��   ��   ȭ   ��   ��   ��   ��\n");
        System.out.println("=================================");

        // �޷� �迭 �ʱ�ȭ
        int day = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 && j < dayOfWeek) {
                    // ù ��° ���� ���� ���� ������ �������� ó��
                    arr[i][j] = 0;
                } else if (day <= numOfDays) {
                    // ��¥�� �迭�� ä��
                    arr[i][j] = day++;
                } else {
                    // ���� ĭ�� 0���� ä��
                    arr[i][j] = 0;
                }
            }
        }

        // �޷� ���
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    System.out.print("     ");  // ����
                } else {
                    System.out.printf(" %3d ", arr[i][j]);  // ��¥ ���
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