/* ====================================
  ■■■ 컬렉션 (Collection) ■■■
======================================*/

// Map → HashTable, HashMap
// - Key 와 Value 의 쌍으로 구성


/*
(이름표가 달려있다. key와 value로 데이터를 저장한다.)

○ java.util.Map 인터페이스
   키(key)를 값(value)에 매핑(mapping)하며
   동일한 키를 등록할 수 없고, 유일해야 하며,
   각 키는 한 개의 값 만을 매핑해야 한다.
   즉, 하나의 키에 대응하는 하나의 값을 갖는 구조이다.
   
*/

/*
○ Hashtable<K, V> 클래스

   - 해시 테이블 구조를 개체 모델링화 한 클래스로
     검색이 용이하기 때문에 사용 빈도가 높은 편에 속한다.
   - 해시테이블이란 키(key)와 그에 상응하는 데이터(value)로
     구분된 데이터 구조이다.
   - 데이터를 저장하고, 검색하기 위해서 키(key)로 접근하며
     이 구조에서는 키 값을 부여하면 해당 데이터가 변환된다.
   - 또한, Hashtable 클래스는 key 또는 value 의 값으로 null 을 허용하지 않는다.

*/

import java.util.*;

public class Test176
{
	private static final String[] names
		={"김믿음","박지우","엄서연", "정영훈", "박제훈", "임성산"};
	private static final String[] tels
		= {"010-1234","010-5234","010-5233", "010-2324","010-2135","010-6134"};
	
	public static void main(String[] args)
	{
		Hashtable<String, String> ht = new Hashtable<String, String>();	
		
//		ht 라는 Hashtable 자료구조에
//		각각의 배열(names, tels)에 담겨있는 데이터를 요소로 담아내기
//      → put(k,v)
		for (int i=0;i<names.length;i++)
		{
			ht.put(names[i],tels[i]);
		}
		
//		Hashtable 자료구조 ht 에서 key 를 이용한 데이터 검색
//		 → get(k)
		String findName1 = "박지우";
		String str = ht.get(findName1);
		if(str != null)
		{
			System.out.println(findName1 + "전화번호 : " + str);
		}
		System.out.println();
		
//		Hashtable 자료구조 ht 에 key 가 존재하는지의 여부 확인
//		 → containsKey()
		String findName2 = "엄서연";
		if(ht.containsKey(findName2))
			System.out.println(findName2 + " 데이터가 존재합니다.");
		else
			System.out.println(findName2 + " 데이터가 존재하지 않습니다.");
		System.out.println();
		
//		Hashtable 자료구조 ht에 value 가 존재하는지의 여부 확인
//		 → contains()
		String findTel1 = "010-1234";
		if(ht.contains(findTel1))
			System.out.println(findTel1 + " 데이터가 존재합니다.");
		else
			System.out.println(findTel1 + " 데이터가 존재하지않습니다.");
		System.out.println();
		
		ht.remove("임성산");
		
		// remove 메소드는 인자값으로 key를 넘겨받지만
		// 이때, key 만 삭제되는 것이 아니다.
		// 해당 key 왜 연결되어(매핑되어) 있는 value 도 함께 삭제된다.
		
		if(ht.containsKey("임성산"))
			System.out.println("데이터가 존재합니다.");
		else
			System.out.println("데이터가 존재하지 않습니다.");
		System.out.println();
		
		if(ht.contains("010-6134"))
			System.out.println("데이터가 존재합니다.");
		else
			System.out.println("데이터가 존재하지 않습니다.");
		System.out.println();	
		
		// ※ null 관련 처리
		
//		ht.put(null, null);		// key 와 value 모두 null → 런타임 에러!!
		
//		ht.put("안석창", null);		// value 만 null → 런타임 에러!!
		
//		ht.put(null, "010-1234-1234");		// key 만 null → 런타임 에러!!

//		※ 중복 데이터 관련 처리

		// 중복된 key 입력
		ht.put("박제훈", "010-1111-1111");
		
		System.out.println(ht.get("박제훈"));
		System.out.println();
		
		// 중복된 key를 활용하여 value 를 입력하였을
		// 경우 값이 기존 값에서 010-1111-1111 롤 변경됨 (덮어쓰기)
		
		// 중복된 value
		ht.put("김민승", "010-1234");
		System.out.println(ht.get("김믿음"));
		System.out.println();
	
		System.out.println(ht.get("김민승"));
		System.out.println();
		
		// ※ value 는 중복된 데이터를 사용하더라도
		//    기존 데이터에 아무런 영향을 미치지 않음을 확인
		// 두개의 key가 하나의 value를 공유!
	}
}