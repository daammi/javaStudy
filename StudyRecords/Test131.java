/*=====================================
■■■ 자바의 주요 클래스 ■■■
- Object 클래스
=======================================*/

public class Test131
{
	@Override
	public String toString()
	{
		return "재정의한 toString()...";
	}
	
	public static void main(String[] args)
	{
		Test131 ob = new Test131();
		
		System.out.println(ob.toString());
//		재정의한 toString()...
		
		System.out.println(ob);
//		재정의한 toString()...
	}
}

/*
System.out.println(Object obj); 메서드는 객체를 출력할 때 자동으로 obj.toString() 메서드를 호출하여 반환된 문자열을 출력합니다.

Test131 클래스에서 toString() 메서드를 재정의했으므로 System.out.println(ob);는 ob.toString()의 결과로 재정의된 "재정의한 toString()..." 문자열을 출력하게 됩니다.

따라서 System.out.println(ob.toString());과 System.out.println(ob);은 동일하게 "재정의한 toString()..."를 출력합니다.

*/