/*==================================================================
■■■ 클래스와 인스턴스 ■■■
 - 메소드 오버로딩(Method Overloading)이 가능한 형태와 불가능한 형태
====================================================================*/

public class Test108
{
	public static void main(String[] args)
	{
		
	}
	
	public static void print() {}
	
//	public static void print() {}				//--(X)

	public static void print(int i){}
	
//	public static void print(int j){}			//--(X)
	
	public static void print(char c) {}			//-- 자동 형 변환 규칙
	
	public static void print(int i, int j) {}
	
	public static void print(double d) {}		//-- 자동 형 변환 규칙

//	public static double print(double e) {return 10.0;}	//--(X)
	
}