/* ====================================
  ■■■ 컬렉션 (Collection) ■■■
======================================*/

// Map → Hashtable, HashMap

// null 불가 - Hashtable
//             한 단어이므로 t가 대문자가 아니다
// null 허용 - HashMap
//             Hash + Map 의 합성어 이므로 M 이 대문자이다.


/*
○ java.util.Map 인터페이스
   키(key)를 값(value)에 매핑(mapping)하며
   동일한 키를 등록할 수 없고, 유일해야 하며,
   각 키는 한 개의 값 만을 매핑해야 한다.
   즉, 하나의 키에 대응하는 하나의 값을 갖는 구조이다.
   
*/

/*
○ HashMap<K, V> 클래스

   - HashMap 클래스는 Hashtable 클래스와 마찬가지로
     Map 인터페이스를 상속받아 주요 기능이 같지만
	 Synchronization 이 없기 떄문에 동시성 문제가 없다면
	 (즉, 멀티 스레드 프로그램이 아닌 경우라면)
	 HashMap 을 사용하는 것이 성능을 향상시킬 수 있다.

   - 또한, HashMap 은 Hashtable 과 달리 null 을 허용한다.

*/

import java.util.*;
import java.io.*;

public class Test177
{
	public static void main(String[] args) throws IOException
	{
//		HashMap<String, String> map = new HashMap<String, String>();
		Map<String,String> map = new HashMap<String, String>();
		
		// map 이라는 HashMap 자료구조에 요소 추가
		//  → put();
		map.put("영화", "중경삼림");
		map.put("드라마", "오징어게임");
		map.put("만화", "슬램덩크");
		
		System.out.println(map);
		// {드라마=오징어게임, 영화=중경삼림, 만화=슬램덩크}
		// 데이터 매핑 구조 확인
		// 데이터 요소 격납 순서가 구성된 순서와 관계 없음
		
		// ※ null 관련 처리 Hashtable은 안되는데 HashMap은 됨ㅋㅋ
		
		map.put(null,null);
		
		System.out.println(map);
		
		map.put("동화", null);
		
		System.out.println(map);
		
		map.put(null, "모나리자");
		
		System.out.println(map);
		
//		데이터 입력 유형에 따라 모든 종류의 null 입력이 가능하지만
//		마지막 null 을 key 로 매핑된 "모나리자"가
//		최초 null 을 key 로 매핑하는 null 을 덮어쓰는 상황이 발생하게 된다.
//		즉, HashMap 은 null 을 하나의 고유한 key 로 간주한다.
	
		System.out.println();
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("카테고리, 타이틀 입력 (콤마 구분) : ");
		String[] temp;
		
		for(String str; (str=br.readLine())!=null; )
		{
			temp = str.split(",");
			if(temp.length<2)
			{
				System.out.print("카테고리, 타이틀 입력 (콤마 구분) : ");
				continue;
			}
			
			map.put(temp[0].trim(), temp[1].trim());
			
			System.out.println(map);
		}
		
	}
		
}
