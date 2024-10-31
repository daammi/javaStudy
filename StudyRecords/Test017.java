
// ★ 변수와 자료형
// ★ 자바 기본 입출력 : java.util.Scanner

// ※ java.util.Scanner
//    단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//    디폴트(default)로 사용되는 단락 문자는 공백(엔터)이다.
//    작성된 다음 토큰은 next() 메소드를 사용
//    다른 형태(자료형)의 값으로 변환할 수 있다.

import java.util.Scanner;

public class Test017
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);
		//서울.금천구.정현
		//서울.강남구.정현
		
		String name;
		int kor, eng, math, sum;
		
		// 연산 및 처리
		// - 사용자에게 안내 메세지 출력
		System.out.print("이름 국어 영어 수학 입력 (단, 공백 구분) : ");
		
		// - 사용자가 입력한 데이터를 변수에 담아내기
		// 이때, test = br.readLine()은 단일 문자열로 밖에 담아낼 수 없다.
		// 그러나, sc.next()을 사용하면 한줄 내에서 각각의 변수에 담아낼 수 가 있다.
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		// - 총점 산출
		sum = kor + eng + math;
		
		
		// 결과 출력
		System.out.println();
		System.out.println(">> 이름 : " + name);
		System.out.println(">> 총점 : " + sum);

		
	}
}