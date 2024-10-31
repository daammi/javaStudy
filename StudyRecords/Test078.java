/*================================================= 
■■■ 클래스와 인스턴스 ■■■ 
- 생성자(Constructor)
===================================================*/

/*

● 생성자의 역할

   1. 인스턴스 생성 → 메모리 할당
   2. 초기화
   
● 생성자의 특징

   1. 생성자는 메소드이지만, 일반 메소드처럼 호출될 수 없으며,
      반환 자료형을 가질 수 없다.
	  ( void 조차 가질 수 없으며, 값을 반환할 수도 없다.
   2. 생성자는 클래스와 동일한 이름을 가져야 한다.
      (대소문자 명확히 구분)
   3. 생성자는 객체를 생성하는 과정에서 new 생성자(); 의 형태로 호출된다
      (인스턴스 생성 과정에서 단 한 번만 호출)
      → final 변수(상수화된 변수) 초기화 가능.

*/

class NumberTest
{
	int num;
	
	// ※ 클래스에 사용자 정의 생성자를 정의하지 않았더라도...
	//    컴파일 과정에서 디폴트 생성자가 자동으로 삽입된다!
	
	// 디폴트 생성자
	/*
	NumberTest()
	{
	}
	*/
	
	NumberTest()
	{
		num = 10;
		System.out.println("생성자 호출~!!");
	}
	
	int getNum()
	{
		return num;
	}
}

public class Test078
{
	public static void main(String[] args)
	{	
		NumberTest nt1 = new NumberTest();
		//-- 인스턴스가 생성되는 시점에서
		//   이와 동시에 선택의 여지 없이 생성자 호출이 이루어진다.
		//
		//--==>> 생성자 호출
	
	    // Calculate ob = new Calculate;!			// 메모리에 퍼올려!!
	    //					      +
	    //					  Calculate();			// 호출!!
		
		int n = nt1.getNum();
		System.out.println(n);
		
		System.out.println(nt1.getNum());
	
		System.out.println(nt1.num);!
	}
}