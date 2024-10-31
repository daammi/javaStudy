/*================================================= 
■■■ 클래스와 인스턴스 ■■■ 
===================================================*/

// 사용자로부터 임의의 정수를 입력받아
// 1부터 입력받은 수 까지의 합을 연산하여
// 결과 같을 출력하는 프로그램을 구현한다.

// 단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.(→ Hap 클래스 설계)
// 입력 데이터가 1보다 작거나 1000보다 큰 경우
// 다시 입력받을 수 있는 처리를 포함하여 구현할 수 있도록 한다.

import java.io.*;

class Hap
{
	int num;
	
	Hap() throws IOException
	{
		do
		{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("임의의 정수 입력(1~1000) : ");
		num = Integer.parseInt(br.readLine());
		}while(num<1||num>100);
	}
		
	void sum()
	{
		int sum=0;
		for(int i=1; i<=num; i++)
			sum+=i;
		System.out.printf(">> 1~%d까지의 합 : %d\n", num, sum);
	}
}

public class Test076{

	public static void main(String[] args) throws IOException
	{
		// Hap 인스턴스(객체) 생성
		Hap ob = new Hap();	
		ob.sum();
	}
}