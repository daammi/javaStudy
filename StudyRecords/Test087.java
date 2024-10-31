/*==================== 
■■■ 배열 ■■■
- 배열의 선언과 초기화
- 배열의 기본적 활용
======================*/

// 사용자로부터 임의의 정수를 임의의 개수만큼 입력받아
// 입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 구현한다.
// 단, 배열을 사용하도록 한다.

import java.util.Scanner;

public class Test087
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num, max;
		System.out.print("입력할 데이터의 개수 : ");
		num=sc.nextInt();
		
		int[] arr = new int[num];
		
		System.out.print("데이터 입력(공백 구분) : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		max = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(max<=arr[i])	
				max=arr[i];
		}
		
		System.out.printf("전체 출력 : ");
		for(int i=0;i<arr.length;i++)
			System.out.printf("%2d\n", arr[i]);
		
		System.out.printf(">> 가장 큰 수 → %d", max);
		
	}
}