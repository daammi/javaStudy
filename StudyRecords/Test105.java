/*================================================
���� Ŭ������ �ν��Ͻ� ����
- static ����(Ŭ���� ����)�� static �޼ҵ�(Ŭ���� �޼ҵ�)
===================================================*/

// �л����� ����, ���� ,���� ������ �Է¹޾�
// ����, ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// ����, �� �������� �迭�� ���������� Ȱ���� �� �ֵ��� �Ѵ�.
// Ŭ������ ����� Record, Sungjuk, Test105 Ŭ������ Ȱ���Ѵ�.
 
// 1. Record Ŭ���� - �Ӽ��� �����ϴ� Ŭ����
// 2. Sungjuk Ŭ���� - �ο� ���� �Է¹޾�, �Է¹��� �ο� �� ��ŭ
//					 �̸�, ����, ����, ���� ������ �Է¹ް�
//					 ������ ����� �����ϴ� Ŭ������ ������ ��
//		             �Ӽ� : �ο� ��, Record Ÿ���� �迭
//					 ��� : �ο� �� �Է�, �� ������ �Է�, ���� �� ��� ����, ��� ���
// 3. Test105 Ŭ����
//    - main() �޼ҵ尡 �����ϴ� �ܺ� Ŭ������ ������ ��

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
			System.out.print("�ο� �� �Է� : ");
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
			System.out.printf("%d��° �л��� �̸� �Է� : ", i+1);
			rc[i].name = sc.next();		
			System.out.print("���� ���� �Է� : ");
			rc[i].kor = sc.nextInt();
			System.out.print("���� ���� �Է� : ");
			rc[i].eng = sc.nextInt();
			System.out.print("���� ���� �Է� : ");
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
		System.out.println("�̸� | �������� | �������� | �������� | ���� | ��� | ���");
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