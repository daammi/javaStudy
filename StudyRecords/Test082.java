/*================================================= 
■■■ 클래스와 인스턴스 ■■■ 
- 생성자(Constructor)와 초기화 블럭(Initialized Block)
===================================================*/

public class Test082
{
//  수행X
//	int n;
//	int m;
//	
//	n=100;       
//	m=200;

//  수행O
//	int n=100;
//	int m=200;

	int n;
	int m;
	
//	초기화 블럭(Initialized Block)
	{
		n=100;
		m=200;
		System.out.println("초기화 블럭 실행..");
	}

//	생성자 → 사용자 정의 생성자
	Test082()
	{
		n=10;
		m=20;
		System.out.println("생성자 실행...");
	}
	
//	생성자 → 사용자 정의 생성자
	Test082(int n, int m)
	{
		this.n=n;
		this.m=m;
		System.out.println("매개변수 있는 생성자 실행...");
	}	

//	※ 중요도: 초기화 블럭 <<<<<<<<< 생성자 
	
	void write()
	{
		
		System.out.println("n:"+n+", m:"+m);
	}
	public static void main(String[] args)
 	{
		Test082 ob1 = new Test082();
		
		ob1.write();
		
		Test082 ob2 = new Test082(120, 2500);
	}
}