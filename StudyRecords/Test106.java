/*================================================
���� Ŭ������ �ν��Ͻ� ����
 - Ŭ������ �ν��Ͻ� Ȱ��
===================================================*/

// 1~3 ���� ������ �߻����Ѽ�
// ����, ����, �� ���� ���α׷��� �����Ѵ�.
// Ŭ������ �迭�� Ȱ���Ѵ�.
// ���������� RpsGame Ŭ������ �ϼ��� �� �ֵ��� �Ѵ�.

import java.util.*;

class RpsGame
{
	int human;
	String[] rps = {"����", "����", "��" };
	
	RpsGame(){
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("1:����, 2:����, 3: �� �� �Է�(1~3) : ");
			human = sc.nextInt()-1;
		}
		while (human<0||human>2);
	}
	
	void print()
	{
		Random rd = new Random();
		int com=rd.nextInt(3);
		
		System.out.printf(" - ����	 : %s\n", rps[human]);
		System.out.printf(" - ��ǻ�� : %s\n", rps[com]);
		
		if(rps[human] == rps[com])
			System.out.println(">> �º� ���� ��� : ���º� ��Ȳ�Դϴ�.\n");
		else if((human==0&&com==2)||(human==1&&com==0)||(human==2&&com==1))
			System.out.println(">> �º� ���� ��� : ����� �¸��߽��ϴ�.\n");
		else
			System.out.println(">> �º� ���� ��� : ��ǻ�Ͱ� �¸��߽��ϴ�.\n");	
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
