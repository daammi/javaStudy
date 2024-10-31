/*================================================= 
■■■ 클래스와 인스턴스 ■■■ 
===================================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.
// (→ Calculate 클래스 설계)

import java.util.Scanner;

class Calculate
{
	int n1,n2, result;
	char op;
	
	Calculate() {}			 // 기본 생성자				------- 이때, 생성자는 매써드지만 유일하게 대문자로 시작!
	Calculate(int a, int b)  // 매개 변수를 가진 생성자 -------		  생성자는 인스턴트 생성시 최초이자 마지막으로 호출!
		{
			n1=a;
			n2=b;
		}
		
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.printf("임의의 두 정수 입력(공백구분) : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.print("임의의 연산자 입력(+ - * /) : ");
		op = sc.next().charAt(0);	
	}
	
	void output(){
		switch(op){
			case '+': result = n1+n2; break;
			case '-': result = n1-n2; break;
			case '*': result = n1*n2; break;
			case '/': result = n1/n2; break;
			default: System.out.print("오류!!!\n");
		}
		System.out.printf(">> %d %c %d = %d\n", n1, op, n2, result);
	}
}


public class Test077
{
	public static void main(String[] args)
	{
		Calculate ob = new Calculate();
	 // Calculate ob = new Calculate;			// 메모리에 퍼올려!!
	 //						   +
	 //					   Calculate();			// 호출!!
		ob.input();
		ob.output(); 
	}
}