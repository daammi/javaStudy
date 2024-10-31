/*==================== 
■■■ 배열 ■■■
- 배열의 선언과 초기화
- 배열의 기본적 활용
======================*/

// 사용자로부터 인원수를 입력받고
// 입력받은 인원수만큼의 학생 이름과 전화번호를 입력받고
// 이렇게 입력받은 데이터를 이름 배열과 전화번호 배열로 구성하여
// 결과를 출력할 수 있는 프로그램을 구현한다.

import java.util.Scanner;

public class Test086
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;

		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			num = sc.nextInt();
		}
		while (num<1||num>10);
		
		String[] name = new String[num];
		String[] hp = new String[num];
				
		for(int i=0;i<num;i++)
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", i);
			name[i] = sc.next();
			hp[i] = sc.next();
		}
		System.out.println("");
		System.out.println("=====================");
		System.out.printf("전체 학생 수 : %d명\n", num);
		System.out.println("=====================");
		System.out.println("이름	전화번호");
		for(int i=0;i<num;i++)
			System.out.printf("%s %s\n", name[i], hp[i]);
		System.out.println("=====================");
		
	}
}