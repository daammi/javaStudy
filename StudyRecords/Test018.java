
// ★ 변수와 자료형
// ★ 자바 기본 입출력 : java.util.Scanner

// ※ java.util.Scanner
//    단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//    디폴트(default)로 사용되는 단락 문자는 공백(엔터)이다.
//    작성된 다음 토큰은 next() 메소드를 사용
//    다른 형태(자료형)의 값으로 변환할 수 있다.

import java.util.Scanner;

public class Test018
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, math, sum;
		
		
		 
		// 연산 및 처리
		System.out.print("이름, 국어, 영어, 수학, 입력 (단, 『,』로 구분) : ");
		
		// 테스트(확인)
		//String temp = sc.next();
		//System.out.println("temp : " + temp);
		//--==> temp : 김정현,100,100,100

		
		sc = new Scanner(sc.next()).useDelimiter(",");        // int n = 10;          n = n + 1;
		//               ---------
		//          김정현,100,100,100
				
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		sum = kor + eng + math;
		
		// 결과 출력
		System.out.println();
		System.out.println(">> 이름 : "+ name);
		System.out.println(">> 총점 : " + sum);
		
	}
}