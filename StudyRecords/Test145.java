/*================================================
■■■ 자바의 주요(중요) 클래스 ■■■
- StringTokenizer 클래스 ( 개념만 숙지 )
==================================================*/

/*
◎ StringTokenizer 클래스

   문자열 파싱(parsing) 을 위한 정보를 제공하는 클래스로
   파싱(parsing) 하고자 하는 문자열을 인자로 받아 생성하는데,
   여기에서 파싱(parsing) 이란 하나의 문자열을 여러 문자열로
   나누는 작업을 의미하게 되며, 이 때 나누는 단위가 되는 문자열을
   토큰(Token) 이라고 한다.
   
   StringTokenizer 클래스를 사용하기 위해서는
   java.util 패키지의 StringTokenizer 를  import 해야 한다.
   
   StringTokenizer 클래스는 호환성을 유지하는 목적으로
   보관 유지되고 있으며, 문자열을 파싱(parsing) 하기 위해서는
   String 클래스의 split() 메소드나 java.util.regex 패키지를
   사용할 것을 권장하고 있다.
   
◎ 생성자

  - 원형
	StringTokenizer(String str)
	StringTokenizer(String str, String delim)
	StringTokenizer(String str, String delim, boolean returnDelims)
	: 주어진 문자열 str 을 단어로 분리하는 객체를 생성하며
	  공백(구분) 문자는 delim 에 포함된 문자로 처리하게 된다.
	  만약 returnDelims 가 true 이면
	  구분 문자도 분리된 데이터에 포함하여 처리하게 된다.
*/

import java.io.*;
import java.util.*;

public class Test145
{
	public static void main(String[] args) throws IOException
	{
		String strTemp;
		String[] strArr;
		int n;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("파싱할 문자열 입력(콤마 구분) : ");
		strTemp = br.readLine();
		
//		StringTokenizer 인스턴스 생성
		StringTokenizer st = new StringTokenizer(strTemp, ", ");
		
		strArr = new String[st.countTokens()];
		
		n=0;
		while(st.hasMoreTokens())
		{
			strArr[n++] = st.nextToken();
		}

//		hasMoreTokens()
//		: 사용할 수 있는 토큰이 남아있는 경우 true 를 반환
//		  더 이상 사용할 토큰이 없는 경우 false 를 반환.
//		  확인한 결과만 반환할 뿐..
//		  실제 데이터를 읽어들이지도 않고
//		  실제 데이터를 읽어들이는 헤드를 이동시키지도 않는다.

//		nextToken()
//		: 다음 토큰을 얻어온다.
//		  다음 토큰을 얻어오며 헤드를 이동시키게 된다.
//		  구분자를 바꾸었을 경우 다음 호출에도
//		  바뀐 구분자를 활용하여 토큰을 분리한다.
		
		for(String i : strArr)
		{
			System.out.println(i);
		}
	}
}