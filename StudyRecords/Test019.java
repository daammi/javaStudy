
// ★ 변수와 자료형
// ★ 실수형 데이터타입 정밀도 테스트

public class Test019
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		float a = 0;
		double b = 0;
		
		
		// 연산 및 처리 → 반복 연산 → 반복문 구성 → 100000(십만)번 반복
		for(int i=1 ; i <= 100000 ; i++)
		{
			//System.out.println("반복문 출력");
			//System.out.println(i);
			
			a += 100000;		//-- a 를 100000 만큼 증가시켜줘!!
			b += 100000;		//-- b 를 100000 만큼 증가시켜줘!!
		
		}
		
		// a → 100000
		// b → 100000
		
		
		// 결과 출력
		System.out.println("float  a : " + (a / 100000));
		System.out.println("double b : " + (b / 100000));

	
	}
}

// 실행 결과

/*
	float  a : 99996.055
	double b : 100000.0
*/
	