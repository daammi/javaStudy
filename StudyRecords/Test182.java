/* ========================================
  ■■■ 자바의 기본 입출력(I/O) ■■■
  - Reader Writer 관련 실습
==========================================*/

import java.io.*;

public class Test182
{
	public void process(InputStream is)	// System.in 전달~ (→ 자바의 표준 입력 스트림 
										//					→ 바이트 기반 스트림	  )
	{
		int data;
		
		System.out.println("문자열 입력(종료:Ctrl+z)");
		
		try
		{
			// 매개변수 is 라는 바이트 기반 객체(InputStream)를
			// 문자 기반 스트림으로 변환하여
			// (→ InputStreamReader 가 수행)
			// Reader 타입의 rd 에서 참조할 수 있도록 처리
			Reader rd = new InputStreamReader(is);	// System.in → InputStreamm → Reader
			//-- 문자 기반 입력 스트림 rd~!!
			
			// 바이트 기반 스트림인 자바의 기본 출력 스트림(System.out)을
			// 문자 기반 스트림으로 변환하여
			// (→ OutputStreamWriter 가 수행)
			// Writer 타입의 wt 에서 참조할 수 있도록 처리
			Writer wt = new OutputStreamWriter(System.out);
			//-- 문자 기반 출력 스트림 wt~!!
			
			
			while ((data=rd.read())!=-1)	//-- 문자 기반 입력 스트림으로 읽어들이기...	▶ 반복
			{
				wt.write(data);				//-- 문자 기반 출력 스트림(물줄기)에 data 기록  ▶ 반복
				wt.flush();					//-- 기록한 스트림(물줄기)을 밀어내어 내보냄    ▶ 반복
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args)
	{
		Test182 ob = new Test182();
		ob.process(System.in);
//		문자열 입력(종료:Ctrl+z)
//		1234
//		1234
//		abcd
//		abcd
//		가나다라
//		가나다라
//		^Z
//		계속하려면 아무 키나 누르십시오 . . .
	}
}