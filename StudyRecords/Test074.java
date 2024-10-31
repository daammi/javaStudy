/*================================================= 
■■■ 클래스와 인스턴스 ■■■ 
- 직사각형 클래스 설계 실습
=================================================== 

직사각형의 넓이와 둘레 계산 → 클래스로 표현(설계)

클래스의 정체성 → 직사각형 객체의 설계도
클래스의 속성   → 가로, 세로, 넓이, 둘레, 부피, 무게. 재질, 색상, 질량, 냄새, ...
클래스의 기능   → 넓이 계산, 둘레 계산, 가로 세로 입력, 결과 출력, 일부 잘라내기, 가로 변경, 세로 변경, 재질 변경, ...

※ 객체를 구성 → 데이터(속성, 상태) + 기능 (동작, 행위)

       ↓				↓				      ↓
	   
   클래스 설계 →      변수			 +      메소드
   

public class 직사각형
{
	// 데이터(속성, 상태) → 변수(순서 의미 없음)
	
	int 가로, 세로;
	
	// 기능(동작, 행위)   → 메소드(순서 의미 없음)
	
	가로세로입력()
	{
	}
	둘레계산()
	{
	}
	넓이계산()
	{
	}
	결과 출력()
	{
	}
}
*/

import java.util.Scanner;

// 직사각형 클래스 설계
// 이때, public 클래스는 대표 클래스 하나만!!!
class Rect
{		
	// 데이터(속성, 상태) → 변수(순서 의미 없음)
	int w, h;			  // 가로, 세로
	
	// 기능(동작, 행위)   → 메소드(순서 의미 없음)
	void input()	      // 가로세로입력()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 입력 : ");
		// int x = sc.nextInt();  // 클래스에서 선언해둔 w 사용가능 why? 여기는 메소드니까
		w = sc.nextInt();
		
		System.out.print("세로 입력 : ");
		h = sc.nextInt();
	}
	int calLength()
	{
		return (w+h)*2;
	}
	int calArea()
	{
		int result = w*h;
		 
		return result;
	}
	void print(int l, int a)   
	{	
		// l, a 는 이 메소드 내에서만 쓸 변수명! 	
		System.out.println("가로: " + w );
		System.out.println("세로: " + h );
		System.out.println("둘레: " + l );	
		System.out.println("넓이: " + a ); 
	}
}

// ※ 하나의 자바 파일(.java)에 여러 개의 클래스(class)를 설계할 수 있다. 
//    하지만, 『public class』 는 이 파일 내에서 하나만 올 수 있다.
//	  파일을 저장할 때의 이름은
//	  이 『public class』의 이름으로 지정해야 한다.
//	  일반적으로는(실무적으로는) 하나의 파일에 하나의 클래스를 설계한다.
//	  또한, 여러 개의 클래스가 설계된 파일을 컴파일하게 되면
//    내부에 설계된 클래스의 수 만큼 클래스 파일(.class)이 파생된다.

public class Test074
{
	public static void main(String[] args)
	{
		//Rect 클래스 기반 인스턴스(객체) 생성 
		Rect ob = new Rect(); 
        // Rect ob = new Rect; + Rect ob = new Rect();  두 문장이 축약된 것.	
		// ob라는 이름으로 선언 및 초기화하면서 동시에 메소드 호출. 
		
		ob.input(); // 입력 메소드 호출 
		
		// 둘레, 넓이 계산 메소드 호출, 변수에 담기 
		int l = ob.calLength();	   // 스코프 내에서 찾아야하므로 따로 변수로 선언.
		int a = ob.calArea();      // 출력 메소드 호출 시, 매개변수를
		
		// 출력 메소드 호출  →  print()는 int형 매개변수만 2개 받으면 됨. 
		ob.print(l, a);   // 위에서 계산 메소드 호출로 담긴 값을 매개변수로 사용했다.
	}
}