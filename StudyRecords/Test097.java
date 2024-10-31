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
// C B
// D E F
// J I H G
// K L M N O

public class Test097
{
   public static void main(String[] args)
   {
//	    주요 변수 선언 및 초기화
        char[][] arr = new char[5][5];
        int n = 0;

//		배열에 값을 담기 위한 코드
//		이때, Test096.java와 다른 점은 1행과 3행 즉 i가 홀수일때 값이 뒤에서 부터 담긴다는 것이다.
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)					//-- i가 짝수일때 올바르게 담는다.
			{
                for(int j=0;j<i+1;j++)
                {
                    arr[i][j]=(char)(65+n++);
                }
            }
            else                        //-- i가 홀수일때 뒤에서부터 담는다.
            {
                for(int j=0;j<i+1;j++)
                {
                    arr[i][i-j]=(char)(65+n++);
                }
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
	 C B
	 D E F
	 J I H G
	 K L M N O
	계속하려면 아무 키나 누르십시오 . . .
*/