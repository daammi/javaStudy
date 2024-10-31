/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- break
=================================================== 

※ break 키워드가 지니는 의미
   → 멈춘다 (+ 그리고 빠져나간다)
   
   다음과 같은 처리가 이루어지는 프로그램을 구현한다.
   단, 입력받은 정수는 1~100 범위 안에서만 가능하도록 처리한다.
   
   실행 예)
   
   임의의 정수 입력 : -10
   
   임의의 정수 입력 : 0
   
   임의의 정수 입력 : 2024
   
   임의의 정수 입력 : 10
   >> 1 ~ 10 까지의 합 : 55
   계속하시겠습니까?(Y/N)? : y
   
   임의의 정수 입력 : 100
   >> 1 ~ 100 까지의 합 : 5050
   계속하시겠습니까?(Y/N)? : N
   계속하려면 아무 키나 누르세요....

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test069
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		// int n, s=0, i;
		int n,s,i;
		// n : 사용자 입력값을 담아둘 변수
		// s : 누적합 연산 결과를 담아낼 변수
		// i : 1부터 1씩 사용자의 입력값까지 증가할 변수
		
		char ch;
		// ch : 프로세스를 계속 진행할지 말지의 여부를 담아둘 변수
		
		while(true)
		{
			do
			{
				System.out.print("임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());
				
			}
			while (n<1 || n>100);
			
			// 테스트(확인)
			// System.out.print("유효한 정수 입력 완료~~");
			
			// 누적합 변수의 초기화 위치
			s=0;
			
			// 1부터 입력값(n)까지의 누적합 연산
			// → 1부터 입력값(n)까지 반복
			for (i=1; i<=n; i++)
			{
				s += i;				// s를 i만큼 증가 → 누적합 연산
			}
			
			System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", n, s);
			
			System.out.print("계속하시겠습니까(Y/N)? : ");
			ch = (char)System.in.read();
			//-- 계속할지 말지에 대한 여부(의사표현)
			
			// 그만할래~ → 반복문 빠져나감
			/*
			if (ch == 'N' || ch == 'n')			// N 또는 n 입력한거 맞아???
			{
			}
			*/
			if (ch != 'Y' && ch != 'y')  // Y 또는 y 입력하지 않은거 맞아??? ch == 'N' || ch == 'n'
			{															//		긍정   or    긍정  의 반대는  부정 && 부정 → 논리연산자 반전 주의
				// 반복문을 멈추고 빠져나갈 수 있는 코드 작성 필요
				// 즉, 위와 같은 의사 표현을 했다면
				// 그 동안 수행했던 반복문을 멈추고 빠져나가야 한다.
				break;
				// 멈춘다 + (그리고 빠져나간다) (가장 가까운 반복문을 빠져나간다)
			}
			
			// 엔터값(\r\n) 처리		// y 일 경우이니 다시 do 반복문 아래 임의의 정수 입력이 실행되지만 y를 누르면서 엔터값이 남아 있음. 
			System.in.skip(2);			// readLine은 숫자 형태의 문자열을 정수로 바꿔주는 것이니 n 값을 입력하기 전에 문자 형태인 엔터값을 버려줘야함
			
			
			
		}//end while(true)
		
	}// end main()
}//end class Test069
