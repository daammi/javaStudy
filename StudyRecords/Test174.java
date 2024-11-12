/* ====================================
  ■■■ 컬렉션 (Collection) ■■■
======================================*/

// Set → HashSet, TreeSet
// - 순서 없음
// - 중복을 허용하지 않는 구조(기본)

/*
○ HashSet<E> 클래스
   
   java.util.HashSet<E> 클래스는
   Set 인터페이스를 구현하는 클래스로
   순서의 개념이 아니라 집합의 개념으로 이해해야 하는 자료구조이다.
   이로 인해 데이터의 중복을 허용하지 않는다.
   또한, 동기화를 지원하지 않는다.
*/

import java.util.*;

public class Test174
{
	public static void main(String[] args)
	{
		Set<String> dog = new HashSet<String>();
		
		dog.add("비숑");
		dog.add("골든리트리버");
		dog.add("사모예드");
		dog.add("진돗개");
		dog.add("말티즈");
		dog.add("시바");
		
		for (String str : dog)
		{
			System.out.print(str + " ");
		}
		System.out.println();
//		순서가 의미 없는 자료구조이기 때문에
//		데이터의 입력 순서와 자료구조의 요소 격납 순서가
//		상관 관계 없이 구성되어 있는 것을 관찰 및 확인

		// 데이터 추가
		dog.add("포메라니안");
		dog.add("치와와");
		dog.add("스피츠");
		dog.add("푸들");
		
		dog.add("푸들");
		dog.add("푸들");
		dog.add("푸들");
		dog.add("푸들");
		dog.add("푸들");
		
		for (String str : dog)
		{
			System.out.print(str + " ");
		}
		System.out.println();
		
//		데이터가 추가되는 순서와 상관없이 목록이 구성되어 있으며
//		같은 데이터가 여러 번 반복되어 추가될 경우
//		이들 중 하나만 유효한 데이터로 구성되는 것을 확인할 수 있다.
//		(아무리 추가해도 한 번만 출력됨 → 하나만 요소로 구성되어 있음)
		
//		또한, 자료구조의 특성 상
//		중복 데이터를 허용하지 않는다고 해서
//		중복된 데이터를 추가할 경우
//		에러가 발생한다는 의미는 아니라는 것도 확인할 수 있다.
	}
}