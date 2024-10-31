
// ★ 변수와 자료형
// ★ 자바 기본 입출력 : BufferedReader 클래스 활용

// Q. 삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
//    이 삼각형의 넓이를 구하는 프로그램을 구현한다.

// ※ 문제 인식 및 분석
//	  삼각형의 넓이 = 밑변 * 높이 / 2
//    사용자로부터 데이터를 입력받아 처리 - BufferedReader 활용
//    밑변과 높이를 사용자로부터 입력받는다고 해서
//    BufferedReader 두 개를 활용할 필요는 없다. == 키보드 두개를 사용할 필요는 없다!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		//밑변, 높이, 넓이
		int a, b;
		double area;					// 실수 check!
				
		// 연산 및 처리
		
		// 1.사용자에게 안내 메세지 출력
		System.out.println("=== 삼각형의 넓이를 구하는 프로그램 ===");
		System.out.print("\n삼각형의 밑변 입력 : ");
		
		// 2.사용자가 입력한 데이터(문자열)를 받아와 정수 형태로 변환한 후
		//   변수 a 에 담아내기
		a = Integer.parseInt(br.readLine());
		
		// 3. 다시 사용자에게 안내 메세지 출력
		System.out.print("삼각형의 높이 입력 : ");
		
		// 4. 사용자가 입력한 데이터(문자열)를 정수 형태로 변환한 후
		//    변수 b에 담아내기
		b = Integer.parseInt(br.readLine());
		
		// 5. 삼각형의 넓이를 구하는 연산 처리
		//    삼각형의 넓이 = 밑변 * 높이 / 2.0;
		area = (a * b) / 2.0;						// 이때, 2를 2.0으로 쓰지 않는다면 정수 기반의 연산으로 인하여 나머지를 버리게 된다.

		// 주의! area = (double)(a*b/2); 는 틀린 계산식! 아니..멍청한 계산식
				
		
		// 결과 출력
		
		System.out.println(); // 개행. 주의! System.out.print(); --==> 컴파일 에러 발생
		
		System.out.printf("\n>> 밑변이 %d, 높이가 %d인 삼각형의 넓이는 %.1f입니다.\n\n", a, b, area);

	}
}