/*==================== 
■■■ 배열 ■■■
- 배열의 선언과 초기화
======================*/

// 임의의 정수들이 들어있는 배열
// 그 배열의 숫자 데이터들 중
// 짝수인 요소만 골라서 출력하고, 3의 배수인 요소만 골라서 출력하는
// 프로그램을 구현한다.

public class Test084
{
	public static void main(String[] args)
	{
		int[] arr = {4,7,9,1,3,2,5,6,8};
		
		System.out.println("배열요소 전체 출력");		
		for(int i=0;i<arr.length;i++)
			System.out.printf("%2d", arr[i]);
		
		System.out.println();
		
		System.out.println("짝수 선택적 출력");		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
				System.out.printf("%2d", arr[i]);
		}
		
		System.out.println();
		
		System.out.println("3의 배수 선택적 출력");		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%3==0)
				System.out.printf("%2d", arr[i]);
		}
		
	    System.out.println();
	}
}