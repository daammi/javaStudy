/* ====================================
  ■■■ 컬렉션 (Collection) ■■■
======================================*/
 
// List → Vector, ArrayList, LinkedList, ...
// ·순서 있음
// ·배열과 유사
// ·중복 허용


/*
(동기화를 지원하지 않는다. 비동기화 클래스이다. → 이 점만 Vector와 다르다.)
(멀티 스레드 safe하게 사용해야 한다 → Vector, 그렇지 않으면 ArrayList)

○ ArrayList 클래스 ★★★


   - ArrayList 와 Vector 클래스는
     List 를 크기 변경이 가능한 배열로 구성한 것으로
	 차이점은 Vector 클래스의 객체는 기본적으로 동기화 되지만,
	 ArrayList 는 그렇지 않다는 점이다.

   - 비동기화 컬렉션은 동기화된 컬렉션보다 더 나은 성능을 제공하며
     스레드들이 컬렉션을 공유할 필요가 없는 프로그램에서는 
	 일반적으로 ArrayList 를 Vector 보다 더 선호하며,
	 ArrayList 는 동기화를 고려하지 않은 Vector 처럼 동작함으로써
 	 스레드 동기화에 따르는 부담을 가지지 않기 때문에
	 Vector 보다 더 빠르게 실행된다.

   - null 을 포함한 모든 요소를 허용하며
     List 인터페이스를 구현하는 것 외에 리스트에 격납하기 위해
	 내부적으로 사용되는 배열의 사이즈를 조작하는 메소드를 제공한다.
	 
*/

// List, Set, Map → 인터페이스 이므로 자료구조 생성 불가.

import java.util.*;

public class Test171
{
	public static void main(String[] args)
	{
		// List 자료구조 list 생성
		// ArrayList<String> list1 = new ArrayList<String>();
		// Vector<String> list1 = new Vector<String>();
//		List<String> list1 = new Vector<String>();		// 가능
		List<String> list1 = new ArrayList<String>();	// 가능
		
//		list1 자료구조에 요소 추가
//		 → add()
		list1.add("귀멸의칼날");
		list1.add("중경삼림");
		list1.add("대도시의사랑법");
		
		
//		List 자료구조 list2 생성
//		List<String> list2 = new List<String>();
//		List<String> list2 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>(list1); // 가능
		
		
//		list2 자료구조에 요소 추가
//		 → add()
		list2.add("청설");
		list2.add("부끄럼");
		
		
//		List 자료구조 list3 생성
		List<String> list3 = new ArrayList<String>();
		
//		list3 자료구조에 list2 의 전체 요소 추가
//		 → addAll()
		list3.addAll(list2);
		
//		list3 자료구조의 "청설" 앞에 "어바웃타임" 추가
		list3.add(list3.indexOf("청설"), "어바웃타임");
		
//		출력 → 더미 데이터 확인
		System.out.println("----------------------");
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println("----------------------");
		
//		출력 → ListIterator 를 활용하여 출력(→ listIterator())
		ListIterator<String> li = list3.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();
		
//		출력 → ListIterator 를 활용하여 역순으로 접근
		while(li.hasPrevious())
		{
			System.out.print(li.previous() + " ");	
		}
		System.out.println();
		
	}
}