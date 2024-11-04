/* ====================================
  ■■■ 컬렉션 (Collection) ■■■
======================================*/

import java.util.Vector;
import java.util.Collections;

public class Test166{
	
	private static final String[] colors
		= {"검정","노랑","초록","파랑","빨강","연두",};
		
	public static void main(String[] args){
		
		Vector<String> v = new Vector<String>();
		
		for(String color : colors){
			v.add(color);
		}
		
		System.out.println("첫 번째 요소 : " + (String)v.elementAt(0));
		System.out.println("두 번째 요소 : " + (String)v.elementAt(1));
		System.out.println("마지막  요소 : " + (String)v.lastElement());
		System.out.println("요소의  개수 : " + v.size());		
		
//		◎ 첫 번째 요소를 "하양"으로 변경 → set(인덱스, 요소)
		v.set(0,"하양");
		System.out.println("첫 번째 요소 : " + (String)v.elementAt(0));
		System.out.println("두 번째 요소 : " + (String)v.elementAt(1));
		System.out.println("마지막  요소 : " + (String)v.lastElement());
		System.out.println("요소의  개수 : " + v.size());	
//		결과 : 검정 → 하양 덮어쓰기		
		
//		◎ 첫 번째 요소에 주황 추가 → insertElementAt(요소, 인덱스)
		v.insertElementAt("주황",0);
		System.out.println("첫 번째 요소 : " + (String)v.elementAt(0));
		System.out.println("두 번째 요소 : " + (String)v.elementAt(1));
		System.out.println("마지막  요소 : " + (String)v.lastElement());
		System.out.println("요소의  개수 : " + v.size());	
//		결과 : 주황이 처음에 쏙 들어감		

//		◎ 오름차순 정렬
		Collections.sort(v);
	
		for(String str : v)
			System.out.print(str+ " ");
		System.out.println();
		
//		◎ 검색
//		Collections.binarySearch(); → 검색 기능 수행 
//		단, 오름차순 정렬이 수행되어 있는 자료에 대해서만 사용이 가능하다.
//		검색 결과가 존재하지 않을 경우 『음수』를 반환한다.

		int idxBlue = Collections.binarySearch(v, "파랑");
		System.out.printf("파랑은 몇번? %d번!\n",idxBlue);
		
		
//		◎ 내림차순 정렬
		Collections.sort(v, Collections.reverseOrder());
		
		for(String str : v)
			System.out.print(str+ " ");
		System.out.println();		
	
		idxBlue = Collections.binarySearch(v, "파랑");
		System.out.printf("파랑은 몇번? %d번!\n",idxBlue);
//		음수 나왔음 == 찾지 못했다

		idxBlue = Collections.binarySearch(v, "파랑",Collections.reverseOrder());
		System.out.printf("파랑은 몇번? %d번!\n",idxBlue);
		
	}
	
}