/*================================================
■■■ 클래스와 인스턴스 ■■■
 - 클래스와 인스턴스 활용
===================================================*/

// 1~3 사이 난수를 발생시켜서
// 가위, 바위, 보 게임 프로그램을 구현한다.
// 클래스와 배열을 활용한다.
// 최종적으로 RpsGame 클래스를 완성할 수 있도록 한다.

import java.util.*;

class RpsGame
{
	int human;
	String[] rps = {"가위", "바위", "보" };
	
	RpsGame(){
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("1:가위, 2:바위, 3: 보 중 입력(1~3) : ");
			human = sc.nextInt()-1;
		}
		while (human<0||human>2);
	}
	
	void print()
	{
		Random rd = new Random();
		int com=rd.nextInt(3);
		
		System.out.printf(" - 유저	 : %s\n", rps[human]);
		System.out.printf(" - 컴퓨터 : %s\n", rps[com]);
		
		if(rps[human] == rps[com])
			System.out.println(">> 승부 최종 결과 : 무승부 상황입니다.\n");
		else if((human==0&&com==2)||(human==1&&com==0)||(human==2&&com==1))
			System.out.println(">> 승부 최종 결과 : 당신이 승리했습니다.\n");
		else
			System.out.println(">> 승부 최종 결과 : 컴퓨터가 승리했습니다.\n");	
	}
}

public class Test106
{
	public static void main(String[] args)
		
	{
		RpsGame rg = new RpsGame();
		rg.print();
	}
}
