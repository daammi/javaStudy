/*================================================= 
■■■ 클래스와 인스턴스 ■■■ 
- 생성자(Constructor)
===================================================*/

public class Test081
{
	int val1;
	double val2;
	
	Test081()
	{
		val1=0;
		val2=0;
		System.out.println("매개변수 없는 생성자...");
	}
	
	Test081(int val1)
	{
		this.val1=val1;
		val2=0;
		System.out.println("int형 데이터를 매개변수로 받는 생성자...");
	}
	
	Test081(double val2)
	{
		val1=0;
		this.val2=val2;
		System.out.println("double형 데이터를 매개변수로 받는 생성자...");
	}
	
	Test081(int val1, double val2)
	{
		this.val1=val1;
		this.val2=val2;
		System.out.println("int형과 double 데이터를 매개변수로 받는 생성자...");
	}
	
	public static void main(String[] args)
	{
		Test081 ob1 = new Test081();
		System.out.println(ob1.val1+", "+ob1.val2);
		
		Test081 ob2 = new Test081(4);
		System.out.println(ob2.val1+", "+ob2.val2);
		
		Test081 ob3 = new Test081(7.0);
		System.out.println(ob3.val1+", "+ob3.val2);
		
		Test081 ob4 = new Test081(4,7.0);
		System.out.println(ob4.val1+", "+ob4.val2);	
	}
}