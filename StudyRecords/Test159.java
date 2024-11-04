/* ============================================
  ■■■ 예외 처리(Exception Handling) ■■■
=============================================*/

// 다른 예외 다시 던지기

public class Test159
{
	public int getValue(int value) throws Exception		// ⑦ 예외 던지기 (파랑 폭탄)
	{							
		int a = 0;
		
		try
		{
			a = getData(value);			// ③ 예외 발생 (빨강 폭탄)   
		}
		catch (Exception e)				// ④ 예외 잡아내기 (빨강 폭탄)
		{
			// ⑤ 잡아낸 예외에 대한 처리 (빨강 폭탄)														
			System.out.println("printStackTrace ........................");
			e.printStackTrace();
			
			// check~!!!                    
			// ⑥ 예외 발생 (파랑 폭탄)
			throw new Exception("value 가 음수입니다.");
			// 새롭게 예외를 발생시켰기 때문에 무조건 throws Exception 을 써줘야 한다.
		}

		return a;
	}

	public int getData(int data) throws Exception		// ② 예외 던지기 (빨강 폭탄)
	{							
		if (data < 0)
		{
			throw new Exception("data 가 0 보다 작습니다.");	// ① 예외 발생 (빨강 폭탄)
		}

		return data + 10;
	}



	public static void main(String[] args)
	{
		Test159 ob = new Test159();

		try
		{
			int a = ob.getValue(-2);		// ⑧ 예외 발생 (파랑 폭탄)
			System.out.println("a : " + a);	    

		}
		catch (Exception e)				// ⑨ 예외 잡아내기 (파랑 폭탄)
		{		
			// ⑩ 잡아낸 예외에 대한 처리 (파랑 폭탄)
			System.out.println("printStackTrace ........................");
			e.printStackTrace();

		}

	}
}
