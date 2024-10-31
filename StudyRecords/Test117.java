/*================================================
■■■ 배열 ■■■
- 배열의 선언과 초기화
===================================================*/

// 다음과 같은 프로그램을 구현한다.
// 단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의 두 정수 입력(공백 구분) : 20 15
// 연산자 입력(+ - * /) : '-'
 // 20 - 15 = 5
 
 import java.util.*;
 import java.io.*;
 
 class Aclass
 {
	 protected int x, y;
	 protected char op;
	 
	 Aclass()
	 {
		 
	 }
	 
	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op,y,result);
	}
	
 }

// Aclass 를 상속 받는 클래스로 설계
class Bclass extends Aclass
{
	
/*
	protected int x, y;
	protected char op;
	 	 
	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op,y,result);
	}
*/

	private double result;
	
	boolean input() throws IOException
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.print("임의 두 정수 입력(공백 구분) : ");
		 String temp = br.readLine();
//		 ※ str.split("구분자");
//		 ※ str.split("\\s");         //-- 구분자 → 공백
		 String[] nums=temp.split("\\s");
		 
		 if(nums.length!=2)
			 return false;
		 
		 x=Integer.parseInt(nums[0]);
		 y=Integer.parseInt(nums[1]);
		 
		 System.out.print("연산자 입력 : ");
		 op = (char)System.in.read();
		 
		  if(op!='+' && op!='-' && op!='*' && op!='/')
			 return false;
		 
		 return true;

	}
	 
	double calc()
	{
		switch(op)
		{
			case '+': result = x+y; break;
			case '-': result = x-y; break;
			case '*': result = x*y; break;
			case '/': result = (double)x/y; break;			
		}
		
		return result;
	}
}	

public class Test117

{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();
		
		if(!ob.input())
		{
			System.out.println("Error");
			return;
		}
		
		double result = ob.calc();
		ob.write(result);
	}
}