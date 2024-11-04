/*================================================
■■■ 예외 처리(Exception Handling) ■■■
==================================================*/

import java.io.*;

public class Test154
{
	private String[] data = new String[3];
	
	public void proc() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		int n=0;
		
		System.out.print("이름 입력(종료:Ctrl+z) : ");
		while ((str=br.readLine())!=null)
		{
			data[n++] = str;
			System.out.print("이름 입력(종료:Ctrl+z) : ");
		}
		
		System.out.println("입력된 내용 ......... ");
		for(String s : data)
		{
			if(s != null)
				System.out.println(s);
		}
	}
	
// BufferedReader 의 readLine() 메소드도... IOException을 사용하는 것!!
// 부모 클래스의 메소드에서 사용하는 예외처리이므로 자식한테까지 넘어간 것이다.

// ArrayIndexOutOfBounds → 런타임 에러이므로 unchecked exception 이다.
// unchecked exception 이므로, 예외처리를 하지 않아도 자바에서 자동으로 컴파일을 시켜준다.

	public static void main(String[] args) throws IOException
	{
		Test154 ob = new Test154();
		ob.proc();
	}
}