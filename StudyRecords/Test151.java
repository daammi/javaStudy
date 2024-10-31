/*================================================
■■■ 자바의 주요(중요) 클래스 ■■■
- Random 클래스
==================================================*/

/*
◎ java.util.Random 클래스는

   여러 형태의 난수를 발생시켜 제공하는 클래스이다.
   Math 클래스의 정적 메소드인 random() 메소드도 난수를 발생시켜 제공하는 메소드이지만
   0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
   필요한 여러 형태의 난수를 만들어내기 위해서는 추가적인 연산을 수행해야 한다.
   그래서 자바는 난수를 발생시켜주는 전용 클래스인
   Random 클래스를 별도로 제공하고 있다.
   
*/

// 로또 번호 생성(난수 발생) 프로그램

// 프로그램이 실행되면...
// 기본적으로 로또를 5게임 수행하는 프로그램을 구현한다.

// 실행 예)
// 3 5 12 24 31 42
// 1 2 8 36 40 43
// 4 9 12 13 22 34
// 5 10 13 17 21 40
// 22 31 36 37 40 43
// 계속하려면 아무 키나 누르세요...

import java.util.*;

public class Test151
{
	public static void main(String[] args)
	{
/*
		Random rc = new Random();
		
		int[] lotto = new int[6];
		int n=0;
		
		while(n<5)
		{
			for(int i=0;i<lotto.length;i++){
				
				lotto[i]=rc.nextInt(45)+1;
				
				for(int j=0;j<i;j++)
				{
					if(lotto[i]==lotto[j])
					{
						i--;
						break;
					}
				}
			}
			
			for(int i=0;i<lotto.length-1;i++)
			{
				for(int j=i+1;j<lotto.length;j++)
				{
					if(lotto[i]>lotto[j])
					{
						lotto[i]=lotto[i]^lotto[j];
						lotto[j]=lotto[j]^lotto[i];
						lotto[i]=lotto[i]^lotto[j];				
					}
				}
			} 
			
			
			for(int i : lotto)
				System.out.printf("%3d", i);
			n++;
			
			System.out.println();
		}		
*/		
	Lotto ob = new Lotto();
	
		for(int i=0;i<5;i++)
		{	
			ob.start();
			int[] num = ob.getNum();
		
			for(int n : num)
				System.out.printf("%4d", n);
			System.out.println();
		}
	
	}
}

class Lotto
{
	// 주요 속성 구성
	// 로또 번호를 담아둘 배열방 6칸
	// → 배열 변수 선언 및 메모리 할당
	private int[] num;
	
	Lotto()
	{
		num = new int[6];
	}
	
	public int[] getNum()
	{
		return num;
	}
	
	// 6개의 난수를 발생시키는 메소드 정의(중복 없음)
	public void start()
	{
		Random rc = new Random();
		int n;
		int cnt = 0;
		
	jump:
		
		while(cnt<6)
		{
			n=rc.nextInt(45)+1;
			
			for(int i=0;i<cnt;i++)
			{
				if(num[i]==n)
					continue jump;
					
			}
			
			num[cnt++]=n;
			
//			cnt++;
		}
		
		sort();
		
	}
	
	// 정렬 메소드 정의
	private void sort()
	{
		Arrays.sort(num);
	}
	
	
}