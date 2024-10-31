/*==================== 
■■■ 배열 ■■■
- 다차원 배열(배열의 배열)
======================*/

// 과제)
// 다차원 배열을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// A
// B C
// D E F
// G H I J
// K L M N O

public class Test096
{
	public static void main(String[] args)
	{
//		주요 변수 선언 및 초기화
		char[][] arr = new char[5][5];
		int n = 0;

//		반복문을 통한 배열에 원하는 값 저장
		for(int i=0;i<arr.length;i++)
		{
//			이때, j<i+1 이라는 조건을 통해 행마다 넣을 방 개수를 조작한다.
//          따라서, 1행 : A, 2행 : B,C ... 순으로 입력된다. 
			for(int j=0;j<i+1;j++)
			{
				arr[i][j]=(char)(65+n++);
			}
		}
		
//      결과 출력 (by 향상된 for문)
		for (char[] i : arr)
		{	
			for (char j : i)
				System.out.printf("%2c", j);
			System.out.println();
		}
	
	}
}

// 실행결과

/*
	 A
	 B C
	 D E F
	 G H I J
	 K L M N O
	계속하려면 아무 키나 누르십시오 . . .
*/