/* ======================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=========================================================*/

import java.util.Stack;

public class Test161
{
	private static final String[] colors
		= {"검정","노랑","초록","파랑","빨강","연두",};
	
//	생성자(사용자 정의 생성자)
	public Test161()
	{
//		st 라는 Stack 자료구조 생성
//		제네릭을 활용하여 자료구조에 담기는 데이터 표현 → <String>
		 Stack<String> st = new Stack<String>();
		
//		st 라는 Stack 자료구조에 데이터 담기
//		st = colors; (X)
		for(String str : colors)
			st.add(str); // == st.push(str)
	
		st.push("보라");
		
//		출력 메소드
		popStack(st);
		
	}

//      출력 메소드
		private void popStack(Stack st)
		{
			while(!st.isEmpty())
			{
				System.out.println("pop : " + st.pop());
			}
		}
	
	
	public static void main(String[] args)
	{
		new Test161();		// 생성자만 호출!!

	}
}