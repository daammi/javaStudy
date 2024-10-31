/*=====================================
■■■ 클래스 고급 ■■■
- 인터페이스(Interface)
=======================================*/

// 성적 처리 프로그램을 구현한다.
// 단, 인터페이스를 활용할 수 있도록 한다.

import java.util.*;

class Record
{
	private String hak, name;
	private int[] score = new int[3];
	private int tot=0;
	private double avg;
	
	public String getHak()
	{
		return hak;
	}
	
	public void setHak(String hak)
	{
		this.hak = hak;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

/*
	public int[] getScore()
	{
		return score;
	}
	
	public void setScore(int[] score)
	{
		this.score = score;
	}
*/	
	public int getScore(int i)
	{
		return score[i];
	}
	
	public void setScore(int i, int score)
	{
		this.score[i] = score;
	}
	
	public int getTot()
	{
		return tot;
	}
	
	public void setTot(int tot)
	{
		this.tot = tot;
	}
	
	public double getAvg()
	{
		return avg;
	}
	
	public void setAvg(double avg)
	{
		this.avg = avg;
	}	
}

interface Sungjuk
{
	public void set();
	public void input();
	public void print();
}

class SungjukImpl implements Sungjuk
{
	Scanner sc = new Scanner(System.in);
	private int inwon;
	private Record[] rec;
	
	@Override
	public void set()
	{   
		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>10);
		rec = new Record[inwon];
	}
	
	@Override
	public void input()
	{
		int sum=0;
		
		for(int i=0;i<rec.length;i++)
		{
			rec[i]=new Record();
			
			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) :  ",i+1);
			rec[i].setHak(sc.next());
			rec[i].setName(sc.next());
			System.out.print("국어 영어 수학 점수 입력   (공백 구분) :  ");
			for(int j=0;j<3;j++){
				rec[i].setScore(j, sc.nextInt());
				sum+=rec[i].getScore(j);
			}
			
			rec[i].setTot(sum);
			rec[i].setAvg(sum/3.0);
		}
		
		
		
	}
	
	private String panjung(int score)
	{
		switch(score/10)
		{
			case 9: return "수"; 
			case 8: return "우"; 
			case 7: return "미"; 
			case 6: return "양"; 			
			
			default: return "가";			
		}
		
	}
	
	@Override
	public void print()
	{
		for(int i=0;i<rec.length;i++){
			System.out.printf(">>| %s | %s |",rec[i].getHak(), rec[i].getName());
				for(int j=0;j<3;j++)
				System.out.printf(" %d(%s) |",rec[i].getScore(j),panjung(rec[i].getScore(j)));
			System.out.printf("| %d | %.2f |\n", rec[i].getTot(), rec[i].getAvg());
		} 	
	}
	
}

public class Test125
{
	public static void main(String[] args)
	{
		Sungjuk ob;
		
		ob = new SungjukImpl();
		
		ob.set();
		ob.input();
		ob.print();
		
	}
}


