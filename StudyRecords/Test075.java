/*================================================= 
■■■ 클래스와 인스턴스 ■■■ 
=================================================== 
*/

// Test074.java			→ Test074.class
//						→ Rect.class

// Test075.java         → Test075.class
// CircleTest.java		→ CircleTest.class	

// 원의 넓이와 둘레 구하기
// 원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.
// ( 클래스명 : CircleTest )
// Test074.java 파일을 참조하여 설계할 수 있도록 한다.

// package default;

import java.io.IOException;

public class Test075{
	
	public static void main(String[] args) throws IOException
	{
		CircleTest ob = new CircleTest();
		
		double a = ob.calArea();
		double l = ob.calLength();
		
		ob.print(a,l);
	}
}
