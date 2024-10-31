
// ★ 변수와 자료형
// ★ 자바 기본 입출력 : BufferedReader 클래스 활용

// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		
		// 주요 변수 선언
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	
		String strName;
		int nKor, nEng, nMath, nTotal;
		
		String strTemp;
		
		// 연산 및 처리
		
		// - 사용자에게 안내 메세지 출력
		System.out.printf("\n====성적 입력 프로그램====\n\n");
		
		System.out.print("이름을 입력하세요 : ");
		// - 사용자가 입력한 값(외부 바이트 데이터 -> 문자열)을 변수에 담아내기
		
		strName = br.readLine();
		// - 사용자에게 안내 메세지 출력
		System.out.print("국어 점수 입력 : ");
		
		// - 사용자가 입력한 값(외부 바이트 데이터 -> 문자열)을 받아서 정수로 변환 후 변수에 담아내기
		
		strTemp = br.readLine();
		nKor = Integer.parseInt(strTemp);
		
		// - 사용자에게 안내 메세지 출력
		System.out.print("영어 점수 입력 : ");
		
		// - 사용자가 입력한 값(외부 바이트 데이터 -> 문자열)을 받아서 정수로 변환 후 변수에 담아내기
		nEng = Integer.parseInt(br.readLine());
		
		// - 사용자에게 안내 메세지 출력
		System.out.print("수학 점수 입력 : ");
		
		// - 사용자가 입력한 값(외부 바이트 데이터 -> 문자열)을 받아서 정수로 변환 후 변수에 담아내기
		nMath = Integer.parseInt(br.readLine());
		
		// - 연산
		nTotal = nKor + nEng + nMath;
		double fAvg = nTotal / 3.0;
		
		// - 결과 출력
		System.out.println();
		System.out.println("====결과====");
		System.out.printf("이름 : %s\n총점 : %d\n평균 : %.2f\n", strName, nTotal, fAvg);
		System.out.println();
		
	}
	
}


