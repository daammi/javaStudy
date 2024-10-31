/*================================================= 
■■■ 클래스와 인스턴스 ■■■ 
- 생성자(Constructor)
===================================================*/

class NumberTest2
{
	int num;
	
	// 디폴트 생성자 → 자동 삽입
	/*
	NumberTest2()
	{
		
	}
	*/
	
	// 생성자 → 사용자 정의 생성자
	NumberTest2(int n)
	{
		this.num = n;
	}
	
	int getNum()
	{
		return num;	
	}
}

public class Test079
{
	public static void main(String[] args)
	{
	//	NumberTest2 클래스에는	
	//	사용자 정의 생성자가 존재하고 있는 상황이기 때문에
	//	디폴트 생성자 가 자동으로 삽입되지 않으며
	//  사용자가 정의한 생성자는 매개변수를 갖는 형태이기 때문에
	//	매개변수 없는 생성자를 호출하는 형태의 인스턴스 생성
	//	구문은 문제를 발생시키게 된다.
	
		int n = 10;
		NumberTest2 ob = new NumberTest2(n);
		System.out.println(ob.getNum());
		
		System.out.print
	}
}