/*================================================= 
���� Ŭ������ �ν��Ͻ� ���� 
=================================================== 
*/

// Test074.java			�� Test074.class
//						�� Rect.class

// Test075.java         �� Test075.class
// CircleTest.java		�� CircleTest.class	

// ���� ���̿� �ѷ� ���ϱ�
// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
// ( Ŭ������ : CircleTest )
// Test074.java ������ �����Ͽ� ������ �� �ֵ��� �Ѵ�.

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
