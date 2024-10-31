
// ★ 변수와 자료형
//  
// Q. 직사각형의 넓이와 둘레를 구하는 프로그램을 작성한다.
//    가로 : 10, 세로 : 20

import java.util.Scanner;

public class Test011
{	
	public static void main(String[] args)
	{
		//내꺼
		/*
		int width = 10, height = 20;
		System.out.printf("넓이 : %d\n둘레 : %d\n", width*height, 2*(width+height));
		*/
		
		
		// 변수 선언 및 초기화
		int width = 10;
		int height = 20;
		
		// 연산 및 처리
		int area = width * height;
		int length = (width + height) * 2;
		
		// 결과 출력
		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + length);
		
		System.out.printf("%d & %d\n", area, length);
	}
}