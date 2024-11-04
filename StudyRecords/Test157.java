/* ============================================
  ■■■ 예외 처리(Exception Handling) ■■■
=============================================*/

// Test156.java 파일과 비교~!!!

// ※ throws    /    throw
//     처리     /      발생
class Demo
{
	private int value;

	public void setValue(int value) throws Exception	// 예외 던져~
	{

		if (value <=0)
		{
			// return;
			throw new Exception("value 는 0 보다 작거나 같을 수 없습니다.");
			// new 라는 객체생성연산자를 통해서 예외(Exception)를 생성하고 있는 구문이다.
			// ★☆ 『예외를 생성했으므로... 필수적으로 예외처리를 해 주어야 한다.』
		}

		this.value = value;			// 전역 변수 value를
									// 메소드의 매개변수로 전달된 int 값으로 초기화
	}

	public int getValue()			// value 값을 가져오는 메소드 (private 접근제어지시자로 설정되었으므로)
	{
		return value;
	}
}


public class Test157
{
	public static void main(String[] args) // throws Exception
	{
		Demo ob = new Demo();

		try
		{
			ob.setValue(-3);
			int result = ob.getValue();	
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
}

// 실행 결과

/*
java.lang.Exception: value 는 0 보다 작거나 같을 수 없습니다.
계속하려면 아무 키나 누르십시오 . . .
*/
