/*=====================================
¡á¡á¡á ÀÚ¹ÙÀÇ ÁÖ¿ä Å¬·¡½º ¡á¡á¡á
- BigInteger Å¬·¡½º
=======================================*/

import java.math.BigInteger;

public class Test136
{
	public static void main(String[] args)
	{
//		ºÒ°¡´É
//		int a1 = 123456789123456789;
		long a1 = 123456789123456789L;
		System.out.println(a1);
	
		BigInteger a = new BigInteger("123456789123456789");
		BigInteger b = new BigInteger("123456789123456789");
		System.out.println(a);
		System.out.println(b);
		
//		BigInteger c = a + b; // °´Ã¼¸¦ ¾îÄ³ ¸· ´õÇØ¤»¤»

		BigInteger c = a.add(b);
		System.out.println("µ¡¼À °á°ú : " + c);
		
		BigInteger d = a.subtract(b);
		System.out.println("»¬¼À °á°ú : " + d);		

		BigInteger f = a.divide(b);
		System.out.println("³ª´°¼À °á°ú : " + f);
		
		BigInteger g = new BigInteger("2");
		System.out.println("2ÀÇ 3½Â : " + g.pow(3));
	}
}