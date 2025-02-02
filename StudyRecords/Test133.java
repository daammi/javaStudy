/*=====================================
■■■ 자바의 주요 클래스 ■■■
- Object 클래스
=======================================*/

class NewCar
{
	/*
	...;
	...;
	*/
	private int velocity;
	private int wheelNum;
	private String carName;
	
	// 생성자(사용자 정의 생성자)
	NewCar(int speed, String name, int wheel)
	{
		velocity = speed;
		carName = name;
		wheelNum = wheel;
	}
}

public class Test133
{
	public static void main(String[] args)
	{
		NewCar nCar0 = new NewCar(320, "제네시스", 4);
		NewCar nCar1 = new NewCar(320, "제네시스", 4);
		NewCar nCar2 = new NewCar(280, "그렌저", 4);	
		
//	    equals()
		System.out.println("1-0 : " + nCar0.equals(nCar1));
		System.out.println("1-1 : " + nCar1.equals(nCar2));
		System.out.println("1-2 : " + (nCar1==nCar2));
//		1-1 : false
//		1-2 : false
		
		NewCar nCar3 = nCar1;  // 객체 복사 → 얕은 복사(참조형)
							   //			→ 주소값 복사
							   
		System.out.println("2-1 : " + nCar1.equals(nCar3));
		System.out.println("2-2 : " + (nCar1 == nCar3));
		
		// toString()
		System.out.println("3-1 : " + nCar1.toString());
		System.out.println("3-2 : " + nCar2.toString());
		System.out.println("3-3 : " + nCar3.toString());
		
//		3-1 : NewCar@6d06d69c
//		3-2 : NewCar@7852e922
//		3-3 : NewCar@6d06d69c
		
		// hashCode()
		System.out.println("4-1 : " + nCar1.hashCode());
		System.out.println("4-2 : " + nCar2.hashCode());
		System.out.println("4-3 : " + nCar3.hashCode());
		
//		4-1 : 1829164700
//		4-2 : 2018699554
//		4-3 : 1829164700

//		getClass()
		System.out.println("5-1 : " + nCar1.getClass());
		System.out.println("5-2 : " + nCar2.getClass());
		System.out.println("5-3 : " + nCar3.getClass());
		
//		5-1 : class NewCar
//		5-2 : class NewCar
//		5-3 : class NewCar
//		생성된 객체를 통해 해당 객체의 기반 설계도를 확인할 수 있는 기능을 가진 메소드

//		clone()			// 객체 복사
//		
//		finalize()		// 객체 직렬화

//      기타 나머지 메소드는 스레드 처리와 관련이 있다.
	}
}