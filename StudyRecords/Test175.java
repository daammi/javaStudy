/* ====================================
  ■■■ 컬렉션 (Collection) ■■■
======================================*/

// Set → HashSet, TreeSet
// - 순서 없음
// - 중복을 허용하지 않는 구조(기본)

/*
○ TreeSet<E> 클래스

   java.util.TreeSet<E> 클래스는
   Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
   데이터를 추가하면 데이터들이 자동으로 오름차순 정렬이 된다.
*/


// VO  - Value Object
// DTO - Data Transfer Object
// DAO - Data Access Object

// ↓ 실무에서 주로 사용하는 것
// DTO	- Data Transfer Object
// DAO	- Data Access Object

// VO DTO 비슷한 계층이다.
// 업무 로직에 따라 구분한다...
 
// VO 계층으로도 사용
// DAO

/*
	1. VO (Value Object)
	정의: Value Object는 보통 특정한 값을 표현하기 위해 사용되는 객체로, 해당 값 자체가 중요한 경우에 사용됩니다. VO는 불변성(immutable)을 유지하며, 동일한 값을 가지는 두 VO는 같은 것으로 간주됩니다.
	주요 특징:
	불변성(Immutable): VO 객체의 속성이 한 번 설정되면 변경되지 않습니다. 불변성을 통해 값의 일관성을 유지할 수 있습니다.
	동등성(Equality): VO는 값의 동등성(Equality)을 비교하는 데 중점을 둡니다. 즉, 동일한 값이 들어있는 두 VO는 같은 것으로 간주됩니다.
	예시: Money, Address, Coordinate와 같은 객체가 VO로 사용됩니다. 예를 들어, 두 Money 객체가 동일한 금액과 통화를 가질 경우 동일한 것으로 간주됩니다.
	2. DTO (Data Transfer Object)
	정의: DTO는 시스템의 여러 계층 간에 데이터를 전달하기 위한 객체로, 주로 컨트롤러와 서비스 간 또는 서버와 클라이언트 간 데이터 전송을 위해 사용됩니다. DTO는 비즈니스 로직이 없고, 오직 데이터만을 담고 있습니다.
	주요 특징:
	단순한 데이터 보유: DTO는 데이터 전송의 목적으로만 사용되며, 어떤 비즈니스 로직도 포함하지 않습니다.
	주로 직렬화(Serialization) 사용: 클라이언트-서버 통신 등에서 데이터를 직렬화하여 전송하고, 수신 측에서는 역직렬화하여 객체로 변환합니다.
	예시: 예를 들어, 사용자 정보를 전달하는 UserDTO 클래스에는 id, name, email 등의 속성만 포함됩니다.
	3. DAO (Data Access Object)
	정의: DAO는 데이터베이스와의 상호작용을 전담하는 객체입니다. 데이터베이스에 접근하여 데이터를 조회하거나 저장하는 기능을 수행하며, 데이터베이스와 비즈니스 로직을 분리하기 위해 사용됩니다.
	주요 특징:
	데이터베이스 조작 전담: DAO는 SQL 쿼리나 ORM(Object-Relational Mapping)을 통해 데이터베이스 CRUD(Create, Read, Update, Delete) 작업을 수행합니다.
	비즈니스 로직과의 분리: 비즈니스 로직에서 직접 데이터베이스에 접근하지 않고, DAO를 통해 데이터베이스에 접근함으로써 코드의 유지보수성과 재사용성을 높입니다.
	예시: 예를 들어 UserDAO는 데이터베이스에서 User 정보를 조회하거나, 새로운 User를 삽입하는 등의 작업을 수행합니다.
*/

import java.util.*;

class MyComparator<T> implements Comparator<T>
{
	
	// 비교 기능을 수행하는 메소드 재정의
	// 매개변수로 들어온 값들을
	// GradeDTO 타입으로 변경하도록
	// 부모 클래스 Comparator의 compare() 메소드를
	// 오버라이딩 하고 있다.
	
	@Override
	public int compare(T o1, T o2)
	{
		GradeDTO s1 = (GradeDTO)o1;
		GradeDTO s2 = (GradeDTO)o2;
	
		// 학번 기준(오름차순);
//		return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
	
		// 학번 기준(내림차순);
//		return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());		
	
//		return s1.getTot() - s2.getTot();
		
//		return s2.getTot() - s1.getTot();
//
//		return s1.getName().compareTo(s2.getName()); 
		
		return s2.getName().compareTo(s1.getName()); 
	}
	
	// compare를 통해 들어온 두 인자 o1, o2를 빼서
	// 음수가 나오면 뒤에 값 o2가 더 큰 것이고
	// 양수가 나오면 앞에 값 o1이 더 큰 것이며
	// 0이 나오면 서로 같다는 원리를 이용하여 compare() 메소드는
	// 문자열 크기를 비교한다.
}

/*
	public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // 업캐스팅: Dog 객체를 Animal 타입으로 참조
        Animal myCat = new Cat(); // 업캐스팅: Cat 객체를 Animal 타입으로 참조
        
        // Animal 타입으로는 Dog의 fetch() 메소드에 접근할 수 없으므로 다운캐스팅이 필요
        if (myDog instanceof Dog) {
            Dog dog = (Dog) myDog;  // 다운캐스팅
            dog.fetch();            // Dog의 fetch() 메소드 호출
        }
        
        // 마찬가지로 Cat의 scratch() 메소드를 사용하기 위해 다운캐스팅이 필요
        if (myCat instanceof Cat) {
            Cat cat = (Cat) myCat;  // 다운캐스팅
            cat.scratch();          // Cat의 scratch() 메소드 호출
        }
    }
}

*/

class GradeDTO
{
	// 주요 속성 구성
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public GradeDTO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public GradeDTO()
	{
		this("","",0,0,0);
	}
	
	// getter / setter 구성
	public String getHak()
	{
		return hak;
	}
	
	public void setHak(String hak)
	{
		this.hak = hak;
	}
   
   	public String getName()
	{
		return name;
	}
	
   	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getKor()
	{
		return kor;
	}
	
	public void setKor(int kor)
	{
		this.kor = kor;
	}
	
	public int getEng()
	{
		return eng;
	}
	
	public void setEng(int eng)
	{
		this.eng = eng;
	}
	
	public int getMat()
	{
		return mat;
	}
	
	public void setMat(int mat)
	{
		this.mat = mat;
	}
	
	public int getTot()
	{
		return kor+eng+mat;
	}
}

public class Test175
{
	public static void main(String[] args)
	{
		TreeSet<String> set	 = new TreeSet<String>();
		
		set.add("귀멸의칼날");
		set.add("슬램덩크");
		set.add("궁");
		set.add("원피스");
		set.add("블리치");
		set.add("천원돌파그렌라간");
		set.add("주술회전");
		set.add("블루록");	
		set.add("나루토");
		set.add("스파이패밀리");
		set.add("장송의프리렌");
		
		
		// Iterator 를 활용하여 set 요소 전체 출력
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------");
		
//		TreeSet<GradeDTO> set2 = new TreeSet<GradeDTO>();
		TreeSet<GradeDTO> set2 = new TreeSet<GradeDTO>(new MyComparator<GradeDTO>());
		
		set2.add(new GradeDTO("2409123","윤영식",90,80,70));
		set2.add(new GradeDTO("2409225","곽유진",91,81,71));
		set2.add(new GradeDTO("2409332","박세진",88,78,68));
		set2.add(new GradeDTO("2409156","정승민",70,60,50));
		set2.add(new GradeDTO("2409133","이은솔",99,88,77));
		set2.add(new GradeDTO("2409452","안석창",56,86,96));	
		
		Iterator<GradeDTO> it2 = set2.iterator();
		while(it2.hasNext())
		{
			GradeDTO dto = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n"
							 , dto.getHak(), dto.getName()
							 , dto.getKor(), dto.getEng(), dto.getMat()
							 , dto.getTot());
		}
		System.out.println();
		
		// 비교 불가 → 정렬 불가 → 런타임 에러
	}
		
}

