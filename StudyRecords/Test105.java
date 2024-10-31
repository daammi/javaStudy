/*================================================
■■■ 클래스와 인스턴스 ■■■
- static 변수(클래스 변수)와 static 메소드(클래스 메소드)
===================================================*/

// 학생별로 국어, 영어 ,수학 점수를 입력받아
// 총점, 평균을 계산하는 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
// 또한, 이 과정에서 배열을 적극적으로 활용할 수 있도록 한다.
// 클래스의 설계는 Record, Sungjuk, Test105 클래스를 활용한다.
 
// 1. Record 클래스 - 속성만 존재하는 클래스
// 2. Sungjuk 클래스 - 인원 수를 입력받아, 입력받은 인원 수 만큼
//					 이름, 국어, 영어, 수학 점수를 입력받고
//					 총점과 평균을 산출하는 클래스로 설계할 것
//		             속성 : 인원 수, Record 타입의 배열
//					 기능 : 인원 수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력
// 3. Test105 클래스
//    - main() 메소드가 존재하는 외부 클래스로 설계할 것

import java.util.*;

class Record
{
	String name;
	int kor, eng, mat;
//	int[] score = new int[3];
	int tot=0;
	double avg;
	int rank=1;
}

class Sungjuk
{
	Scanner sc = new Scanner(System.in);
	int num;
	Record[] rc;
	
	Sungjuk()
	{
		do
		{
			System.out.print("인원 수 입력 : ");
			num=sc.nextInt();
		}
		while (num<0||num>100);
		rc=new Record[num];
	}
	
	void input()
	{
		for(int i=0;i<rc.length;i++)
		{
			rc[i] = new Record();
			System.out.printf("%d번째 학생의 이름 입력 : ", i+1);
			rc[i].name = sc.next();		
			System.out.print("국어 점수 입력 : ");
			rc[i].kor = sc.nextInt();
			System.out.print("영어 점수 입력 : ");
			rc[i].eng = sc.nextInt();
			System.out.print("수학 점수 입력 : ");
			rc[i].mat = sc.nextInt();
			
			rc[i].tot =(rc[i].kor+rc[i].eng+rc[i].mat);
			rc[i].avg = rc[i].tot / 3.0;
		}
			ranking();
	}
	
	void ranking()
	{
		for(int i=0;i<rc.length;i++){					
			for(int j=1+i; j<rc.length; j++){			
				if(rc[i].tot < rc[j].tot)
						rc[i].rank++;
				else if(rc[i].tot > rc[j].tot)
					rc[j].rank++;
			}
		}
	}
	
	void print()
	{
		System.out.println("이름 | 국어점수 | 영어점수 | 수학점수 | 총점 | 평균 | 등수");
		for(int i=0;i<rc.length;i++)
			System.out.printf("%s	%d	%d	%d	%d	%.2f       %d\n", rc[i].name,rc[i].kor,rc[i].eng,rc[i].mat,rc[i].tot,rc[i].avg,rc[i].rank);
		
	}
	
}

public class Test105
{
	public static void main(String[] args)
	{
		Sungjuk ob = new Sungjuk();
		ob.input();
		ob.print();
	}
}