/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- return 연습
=================================================== 

※ return 키워드가 지니는 의미
1. 값의 반환
2. 메소드 종료

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n,s;
		
		//System.out.print("임의의 정수 입력 : ");
		System.out.print("임의의 정수 입력(10 이상) : ");
		n = Integer.parseInt(br.readLine());
		
		if (n < 10)
		{
			System.out.println("10 이상의 정수를 입력해야 합니다.");
			return;			// return xxx;
			// rutern 만 쓸 경우 메소드 종료 → return 문을 포함하고 있는 메소드
			// → main() 메소드 → 프로그램 종료
		}		
		
		s = 0;
		for (int i=1; i<=n; i++)
		{
			s += i;
		}
		System.out.println("연산 결과 : " + s);
		
		
	}
}

//실행 결과

/*
임의의 정수 입력(10 이상) : 100
연산 결과 : 5050
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력(10 이상) : 5
10 이상의 정수를 입력해야 합니다.
계속하려면 아무 키나 누르십시오 . . .
*/

06. 메소드의 재귀 호출

메소드 내부 실행부에서 자기 자신을 다시 호출하여 반복한다.


 //  상략
 public static void main(String[] args)
 {
	showHi(3); 
 }

public static void showHi(int cnt) ---> 오류 코드 ! 고쳐보기
 {	
	System.out.println("Hi~ "); //  출력문

	showHi(cnt--);				//  1 감소

	if (cnt == 1)				// 조건식 
		return;
}
위 코드는 컴파일은 정상실행되나, 런타임에서 무한 루프로 Hi~를 출력한다.

원인을 파악하고 수정해보자.

// 상략
public static void showHi(int cnt)		
{	
	System.out.println("Hi~ ");		//  출력문
	if (cnt == 1)					// 조건식
		return;
	showHi(--cnt);					
}
실행부의 최상단에서 1회 출력했으므로 즉시 1을 감소하고 다시 실행해야 무한루프를 고칠 수 있다. 

함수는 최하단에 위치해야한다. 안 그러면 뒤에 작성된 코드는 한 번도 실행되지 않는다.

프리픽스로 1 바로 감소시켜서 인자로 넘겼다.