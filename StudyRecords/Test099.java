/*================================================
■■■ 배열 ■■■
- 배열과 난수 처리(※ Random 클래스 활용)
===================================================

사용자로부터 임의의 정수를 입력받아
그 정수의 갯수만큼 난수(1~100)를 발생시켜 a 배열에 담고
다시 사용자가 입력하는 값을 공백으로 구분하여 b 배열을 구성한 후
두 배열의 요소를 합집합의 형태로 출력하는 프로그램을 구현한다.

실행 예)
발생시킬 난수의 갯수 입력 : 5
(내부적으로 무작위 난수 발생... → 2 3 7 10 11)
배열에 담아내기... → int[] a = {2, 3, 7, 10 ,11}

// 구성할 배열의 길이 입력 : 4
임의의 정수로 배열 구성(공백 구분) : 3 6 10 14
>> 2 3 7 10 11 6 14
계속하려면 아무키나 누르세요...
*/

import java.util.Scanner;
import java.util.Random;

public class Test099
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int size;  // 발생시킬 난수의 변수
		
		System.out.print("발생시킬 난수의 갯수 입력 : ");
		size = sc.nextInt(); // 정수로 반환
		
		int[] a = new int[size]; // a 배열 생성
		Random rd = new Random(); // 랜덤 값 생성
		
		for (int i=0; i<size; i++)
		{
			a[i]=rd.nextInt(100)+1; // 배열에 랜덤 값 넣기
		}
		
		for (int n=0; n<a.length; n++)
		{
			System.out.print(a[n] + " ");
		}
		
		int size2;	   // 배열 구성할 임의의 정수
		
		System.out.print("구성할 배열의 길이 입력 : ");
		size2 = sc.nextInt();
		
		int[] b = new int[size2];  // 길이가 4인 b 배열 생성
		System.out.print("임의의 정수로 배열 구성(공백 구분) : ");
		for (int i=0; i<size2; i++)  // 입력한 임의의 정수 b 배열에 넣기
		{
			b[i]=sc.nextInt();
		}
		
		// 전체 요소 출력
		System.out.print(">>");
		
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		for (int i=0; i<b.length; i++)
		{
			boolean flag = false;
			
			for (int j=0; j<a.length ; j++)
			{
				if (b[i] == a[j])
				{
				   flag = true;
				   break;
				}  
			}
		 // b배열의 요소를 출력하는 과정에서 중복되는 것을 확인하면 출력하지 않음
			    if(flag)
				continue;
				System.out.print(b[i] + " ");
		}
			   System.out.println();	
	}
}

/*
		// 두 배열 구성
		int[] a = {2, 3, 7, 10 ,11};
		int[] b = {3, 6, 10, 14};
		
		// 집합 a(a배열) 전체 출력
		for (int n=0; n<a.length; n++)
		{
			System.out.print(a[n] + " ");
		}
		
		// 집합b(b배열) 집합a(a배열)와 중복되는 것을 제거하며 출력
		for (int n=0; n<b.length; n++) // b 배열의 길이만큼 반복
		{
			boolean flag = false;
			
			// a 배열의 각 요소들과 비교하여 확인
			for (int m=0; m<a.length; m++) // a 배열의 길이만큼 반복
			{
				if (b[n] == a[m])
				{
					flag = true;
					break;
				}
			}
			// b배열의 요소를 출력하는 과정에서 중복되는 것을 확인하면 출력하지 않음
			if(flag)
				continue;
			
			 System.out.print(b[n] + " ");
		}
		System.out.println();
	}
}
		*/
		
		
		