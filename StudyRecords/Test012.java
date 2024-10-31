
// ★ 변수와 자료형
// → 자바 기본 입출력 : BufferedReader 클래스 활용 

import java.io.*;
// io == input / output

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

public class Test012
{
	public static void main(String[] args) throws IOException
	{
		// 키보드(버퍼)의 장착
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// -----------------------------------
		//     문자 입력을 읽어드리는 장치
		//                                     ---------------------
		//                                      바이트 → 문자(번역)
		//                                                           ----------
		//                                                           바이트 입력값
		
		
		// 주요 변수 선언 및 초기화
		int r;
		final double PI = 3.141592;
		double area, length;
		
		// 연산 및 처리
		// 1. 사용자에게 안내 메세지 출력
		System.out.print("원의 반지름 입력 : ");
		
		// 2. 사용자가 입력한 값을 받아와 반지름 변수 r에 담기
		// br.readLine(); → BufferedReader의 readLine == 입력 대기열에 남아있는 문자열 반환
		// ex."1234"
		
		//Integer.parseInt("1234"); → 1234라는 정수로 변환
		//Integer.parseInt("김밥"); → 에러 발생
		//Integer.parseInt("adas"); → 에러 발생
		
		r = Integer.parseInt(br.readLine());
		// 사용자 입력 값 → br에 문자열 형태로 읽어드린 후
		// 그 값을 정수형으로 변환 후 변수 r에 담는 과정
		
		// 3. 넓이 및 둘레 계산
		//    연산 결과를 각각 변수 area, length에 담아내기
		area = r*r*PI;
		length = r*2*PI;
		
		// 최종 결과 출력
		// 변수 area와 length에 담겨있는 값 출력
		System.out.printf("반지름이 %d인 원의 넓이는 %f 이며,\n반지름이 %d인 원의 둘레는 %f 이다.\n",r, area,r, length);
		
		// 원의 반지름 입력 : 5
		// 넓이 : 78.5398
	    // 둘레 : 31.4159
		
		/*
		원의 반지름 입력 : 42
		반지름이 42인 원의 넓이는 5541.7683 이며,
		반지름이 42인 원의 둘레는 263.8937 이다.
		*/
		
	}
}