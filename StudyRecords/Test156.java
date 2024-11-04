/* ============================================
  ■■■ 예외 처리(Exception Handling) ■■■
=============================================*/

// Test157.java 파일과 비교

class Demo
{
	private int value;		// 전역 변수는 자동 초기화!

	public void setValue(int value)
	{
		if (value <= 0)		// 매개변수로 음수를 넘겨주면 바로 메소드 종료하고 출력.
		{
			return;			// return을 포함한 가장 가까운 메소드 종료.(setValue())
							//-- 메소드 종료 → setValue()
							//-- 원래는 바로 종료되고 메소드가 동작하지 않도록 구성하려고 했는데
							//   0으로 초기화 되면서 0 값이 출력된다. → 원하지 않았던 상황.

		}

		this.value = value;	// 음수면 value 변수를 초기화하지 않는다.
	}

	public int getValue()
	{
		return value;
	}
}

public class Test156
{
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-7);
		int result = ob.getValue();// 전역변수, Demo 인스턴스 생성하면서 value 값이 0으로 초기화 되므로.
		System.out.println(result);
	}
}
