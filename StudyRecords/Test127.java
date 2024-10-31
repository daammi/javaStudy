/*=====================================
■■■ 클래스 고급 ■■■
- 중첩 클래스
=======================================*/

// outer 클래스
class Test2
{
	static int a = 10;
	int b = 20;
	
	void write()	// 첫번째!
	{
		System.out.println("write()...1");
		final int c = 30;
		int d = 40;
		
		d++;
		
		// inner 클래스
		// 메소드 안에 존재하는 또다른 클래스 (로컬 클래스, local 클래스, 지역 클래스)
		class LocalTest
		{
			void write()	// 두번째!
			{
				System.out.println("write()...2");
				System.out.println("a" + a);
				System.out.println("b" + b);
				System.out.println("c" + c);
//				System.out.println("d" + d);
				
			}
		}
		
		d++;
		
		LocalTest lt = new LocalTest();
		lt.write();		// -- 두번째 write 호출
		
		d++;
		
	}
}
public class Test127
{
	public static void main(String[] args)
	{
		Test2 ob = new Test2();
		ob.write(); // 첫번째 write 호출
	}
}