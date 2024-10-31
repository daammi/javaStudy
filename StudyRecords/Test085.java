/*==================== 
■■■ 배열 ■■■
- 배열의 선언과 초기화
======================*/

// char 자료형의 배열을 만들어
// 그 배열의 각 방에 알파벳 대문자를 채우고
// 채워진 그 배열의 전체 요소를 출력하는 프로그램을 구현한다.
// 단, 채우는 구문과 출력하는 구문은 따로 분리하여 처리할 수 있도록 한다.

public class Test085
{
	public static void main(String[] args)
	{
		char[] arr = new char[26];
		
		for(int i=0; i<arr.length;i++)
			arr[i] = (char)(65+i);
		
		for(int i=0; i<arr.length;i++)
			System.out.printf("%c ", arr[i]);
		
		System.out.println();
	}
}