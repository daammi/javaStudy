/*=====================================
■■■ 클래스 고급 ■■■
- 중첩 클래스
=======================================*/

/*
◎ Annonymous 클래스(익명 클래스, 무명 클래스, 이름없는 클래스)

	- AWT 나 Swing, 안드로이드 이벤트 처리에서 일반적으로 사용
	- 상위 클래스 메소드를 하나 정도 재정의할 필요성이 있을 때 사용
	- 클래스의 객체가 필요하면 또 다시 클래스를 생성해야 하는
	  번거로움으로 인해 빈번하게 객체 생성이 필요한 경우
	  익명의 클래스를 활용하여 처리할 수 있다.
	  
◎ 형식 및 구조

	new 상위 클래스의 생성자()
	{
		접근제어지시자 자료형 메소드()
		{
			...;
		}
	};				// check! 세미콜론
*/

// import java.lang.Object;

class Test3
{
	/*
		Object 의 모든 멤버 상속~~!!
	*/
	
	public Object getString()
	{
		return new Object()
		{
//			특정 메소드 재구성 → 재정의
			@Override
			public String toString()
			{
				return "익명의 클래스...";
			}
		};
	};	// 세미콜론 필수 작성
}

public class Test129
{
	public static void main(String[] args)
	{
		Test3 ob = new Test3();
	}
}