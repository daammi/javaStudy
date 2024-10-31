/*=====================================
■■■ 클래스 고급 ■■■
- 상속 관계에 있는 클래스들 간의 캐스팅
   (업 캐스팅, 다운 캐스팅)
=======================================*/

class SuperTest120
{
	public int a=10, b=20;
	
	public void write()
	{
		System.out.println("슈퍼 클래스 write() 메소드...");
	}
	
	public int hap()
	{
		return a + b;
	}
}

class SubTest120 extends SuperTest120
{
	/*
	public int a=10, b=20;
	
	public void write()
	{
		System.out.println("슈퍼 클래스 write() 메소드...");
	}
	
	public int hap()
	{
		return a + b;
	}
	*/
	public int b=100, c=200;
	
	public void print()
	{
		System.out.println("서브 클래스 print() 메소드...");
	}
	
	@Override
	public int hap()
	{
		return a+b+c;
	}
}

public class Test120
{
	public static void main(String[] args)
	{
		SubTest120 ob1 = new SubTest120();
		
		System.out.println("ob1.b : "+ ob1.b);
		
//		◎ 업 캐스팅
//		SuperTest120 ob2;
		SuperTest120 ob2 = ob1;
//	  = SuperTest120 ob2 = (SuperTest120)ob1;
		System.out.println(((SuperTest120)ob1).b);
		System.out.println(ob2.b);
//		변수는 객체별로 따로 할당되기 때문에
//		변수 b는 ob2의 변수이다.

		System.out.println("합	:" + ob2.hap());
//		hap() 메서드는 오버라이딩 되어 있고
//		ob2 는 ob1 을 업캐스팅한 상태의 객체이므로
//		SuperTest120 의 hap() 메소드를 호출하는 것이 아니라
//		SubTest120 에서 재정의한 hap() 메서드를 호출하게 된다
//		즉, 메소드는 업캐스팅 되더라도
//		재정의(덮어쓰기)한 이상... 원래의 기능으로 되돌릴 수 없다.

		ob2.write();
		
//		ob2.print();
//      컴파일 에러!!! 부모 클래스에는 print() 가 없다.

//	    ○ 다운 캐스팅
		((SubTest120)ob2).print();
//      
//      추가 관찰
//      다운 캐스팅의 가능 여부

//      상위 클래스 기반 인스턴스 생성
		SuperTest120 ob3 = new SuperTest120();
		
		SubTest120 ob4;
		
//		System.out.println("ob3.c : " + ob3.c);  // 에러 발생
//		상위 객체는 하위 객체의 멤버에 접근하는 것이 불가능하다.
//		(사실 상위 객체 입장에서는 어떤 하위 객체가 존재하는지도 알 수 없음)
	
//		ob4=ob3;   // 에러 발생 >> 작은 객체 안에 큰 객체를 담을 수 없다!
	    
//		ob4 = (SubTest120)ob3; // 런타임 에러 발생 >>
//      작성된 구문의 문법적인 구조만 봤을 때
//		다운 캐스팅이 이루어지는 상황이다
//		하지만, 정상적인 캐스팅이 이루어지지 않는다.
//		현재 SubTest120 객체에 대한 메모리 할당이 이루어지지 않은 상태이기 때문에
//		다운 캐스팅은 불가능한 것이다.
		
		System.out.println("ob3.c : " + ob3.c);
		
// ○ 업 캐스팅, 다운 캐스팅이 정상적으로 이루어지는 경우 ----
		
//	  1. 하위 객체 생성;  //check
//	  2. 상위 = 하위;	  // 업 캐스팅, 정상 --- 연산자 선택 입력
//	  3. 하위 = 상위;     // 에러 발생
//	  4. 하위 = (하위)상위;  // 다운 캐스팅 정상 --- 연산자 필수 입력
		
// ○ 다운 캐스팅이 정상적으로 이루어지지 않는 경우 ----

//    1. 상위 객체 생성;    // check
//	  2. 하위 = 상위;       // 에러 발생
//    3. 하위 = (하위)상위;	// 에러 발생

// ※ 업 캐스팅은 항상 가능. 다운 캐스팅은 경우에 따라 가능.

	}
}

