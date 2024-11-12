/* ========================================
  ■■■ 자바의 기본 입출력(I/O) ■■■
  - Reader 실습
==========================================*/

// Test179.java 파일과 비교


// 문자 기반 스트림   - Reader. Writer.
// 바이트 기반 스트림 - read, write
// new BufferedReader ( new 번역기 (System.in) );
// __________________  -----------  ==========
//       문자          바이트→문자    바이트

// 번역기: InputStreamReader
//         ----------- ====
//          바이트     문자
//
// 바이트 기반을 문자 기반으로 읽어들이는 InputStreamReader
// InputStream → 바이트
// Reader → 문자            

import java.io.*;

public class Test180
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;
		
		// System.in		 : 자바의 표준 입력 스트림 → 바이트 기반 스트림
		// InputStreamReader : 바이트 기반 스트림을 문자 기반 스트림으로... (통역, 번역, 필터링)
		// Reader			 : 문자 기반 스트림 객체
		Reader rd = new InputStreamReader(System.in);
		
		System.out.println("문자열 입력(종료:Ctrl+z)");
		
		// 문자 기반 읽어들이는 처리
		while((data=rd.read()) != -1)
		{
			ch = (char)data;
			
			// 문자 기반 출력 처리
			System.out.print(ch);
//			문자열 입력(종료:Ctrl+z)
//			1234
//			1234
//			abcd
//			abcd
//			가나다라
//			가나다라
//			^Z
//			계속하려면 아무 키나 누르십시오 . . .

			System.out.write(ch);
//			문자열 입력(종료:Ctrl+z)
//			1234
//			1234
//			abcd
//			abcd
//			가나다라
//			섆|
//			^Z
//			계속하려면 아무 키나 누르십시오 . . .

		}
	}
}