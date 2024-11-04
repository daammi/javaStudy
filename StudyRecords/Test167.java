/* ====================================
  ■■■ 컬렉션 (Collection) ■■■
======================================*/

// 검색 및 삭제

import java.util.*;

public class Test167
{
	private static final String[] colors
		= {"검정","노랑","초록","파랑","빨강","연두",};
		
	public static void main(String[] args)
	{
		Vector<String> v = new Vector<String>();
		
		for(String color : colors)
			v.add(color);
		
		System.out.print("전체 요소 출력 : ");
		for(String str : v)
			System.out.print(str + " ");
		System.out.println();
		
		String s1 = "보라";
		
		// indexOf()
		int i = v.indexOf(s1);
		System.out.println(s1 + " → index 위치 : " + i);
		
		String s2 = "노랑";
		
//		contains()
//		v.contains(s)
//		벡터 자료구조 v에 찾고자 하는 s 가 포함되어 있다면...
//		→ index 위치 확인

		if(v.contains(s2))
		{
			i= v.indexOf(s2);
			System.out.println(s2 + " → index 위치 : " + i);
			
			// ① 존재하는지의 여부를 확인하고 → line39
			// ② 어디에 있는지 확인하고	   → line41
			// ③ 확인했으면 삭제해라		   → line55
			v.remove(i);
		}
		System.out.println();
		
		System.out.print("삭제 후 전체 요소 출력 : ");
		for(String str : v)
			System.out.print(str + " ");
		System.out.println();	
	}
}