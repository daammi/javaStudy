/*================================================
■■■ 배열 ■■■
- 배열과 난수 처리(※ Random 클래스 활용)
===================================================

사용자로부터 임의의 정수를 입력받아
그 정수의 갯수만큼 난수(1~100)를 발생시켜 배열에 담고
배열에 담겨있는 데이터들 중
가장 큰 값과 가장 작은 값을 선택하여
결과를 출력하는 프로그램을 구현한다.

※ 난수 발생 전용 객체 → 『java.util.Random』

실행 예)
발생시킬 난수의 갯수 입력 : 10
(내부적으로 무작위 난수 발생... → 50 78 93 61 13 5 46 1 45 22)
배열에 담아내기... → int[] arr = {50, 78, 93, 61, 13, 5, 46, 1, 45, 22}
가장 큰 값 : 93, 가장 작은 값 : 1
계속하려면 아무키나 누르세요...
*/

import java.util.Scanner;
import java.util.Random;

public class Test098
{
	public static void main(String[] args)
	{
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// 주요 변수 선언
		int size;			// 사용자의 입력값을 담아낼 변수 → 배열의 길이
		
		// 안내 메시지 출력
		System.out.print("발생시킬 난수의 갯수 입력 : ");
		size = sc.nextInt();
		
		// size 변수에 담애낸 수 만큼의 배열방
		// 즉, 배열 선언 및 메모리 할당
		int[] arr = new int[size];
		
		// 무작위 정수(난수)를 발생시키기 위해서는 난수 발생 전용 객체가 필요하다.
		// → 『java.util.Random』
		Random rd = new Random();
		// Random 클래스의 인스턴스 생성
		
		// ※ Random 객체의 『nextInt』 메소드 
		//	  0 ~ 매개변수로 념겨받은 정수 n → n-1 까지의 수 중 무작위 정수(난수) 1개를 발생시킨다.
		//    ex)
		//    rd.nextInt(10);  → 0 ~ 9 중 1개 발생
		
		/*
		// 테스트(확인)
		System.out.println("발생한 난수 확인 : " + rd.nextInt(10));
		// 발생한 난수 확인 : 0~9 까지의 범위 내에서 무작위 정수 한 개 발생~!!!
		*/
		
		// 배열 구성
		for (int i=0; i<size; i++)
		{
			// rd.nextInt(100);
			// → 0 ~ 99 중 1개 발생
		
			arr[i] = rd.nextInt(100) + 1; // → 1 ~ 100 중 1개 발생
		}	
		
		// 작은 값, 가장 큰 값 출력
		int max, min;
		min=max=arr[0];  // 최소 값을 구하기 위해선 최대값인 100부터 출발.......!!#!@$!@@$$#$@!#@
		
		for (int i=1; i<arr.length; i++)
		{
			if (max < arr[i])
				max = arr[i];
			if (min > arr[i])
				min = arr[i];
		}
		
		// 테스트(확인) → 배열 요소 전체 출력
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
			System.out.println();
			System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d\n", max, min);
	}
}