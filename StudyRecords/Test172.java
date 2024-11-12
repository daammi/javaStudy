/* ====================================
  ¡á¡á¡á ÄÃ·º¼Ç (Collection) ¡á¡á¡á
======================================*/

/*
¡Û List
   - ¼ø¼­°¡ ÀÖÀ½, ¹è¿­°ú À¯»ç, Áßº¹À» Çã¿ë
   - ÁÖ¿ä ±¸Çö Å¬·¡½º
     ¡¤Vector (µ¿±âÈ­ Áö¿ø)
	 ¡¤ArrayList (µ¿±âÈ­ Áö¿ø ¾ÈÇÔ)
	 ¡¤LinkedList (Ã¼ÀÎ, ¸µÅ©, °áÇÕ, Å¥)


*/

import java.util.*;

public class Test172
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		
		list.add("¼­¿ï");
		list.add("ºÎ»ê");
		list.add("ÀÎÃµ");
		list.add("´ë±¸");
		list.add("±¤ÁÖ");
		list.add("´ëÀü");
		list.add("¿ï»ê");
		list.add("¼¼Á¾");
		
		System.out.println(list); // ´õ¹Ì ®c!!!
		
		System.out.println("ÀüÃ¼ °³¼ö : " + list.size());
		
		// Ã¹ ¹øÂ° ¿ä¼Ò¸¸ Ãâ·Â
		System.out.println("Ã¹¹øÂ° ¿ä¼Ò¸¸ Ãâ·Â : " + list.get(0));
		

		// ¸¶Áö¸· ¿ä¼Ò¸¸ Ãâ·Â
		System.out.println("¸¶Áö¸· ¿ä¼Ò¸¸ Ãâ·Â : " + list.get(list.size()-1));	
		
		// Ã³À½ À§Ä¡¿¡ ÇÑ±¹ Ãß°¡
		list.add(0, "ÇÑ±¹");
		
		System.out.println(list);
		System.out.println("ÀüÃ¼ °³¼ö : " + list.size());
		
		// Ã³À½ À§Ä¡ÀÇ µ¥ÀÌÅÍ¸¦ ´ëÇÑ¹Î±¹ À¸·Î º¯°æ
		list.set(0, "´ëÇÑ¹Î±¹");
		
		System.out.println(list);
		System.out.println("ÀüÃ¼ °³¼ö : " + list.size());
		
		// "¼­¿ï" ¿ä¼ÒÀÇ Á¸Àç¿©ºÎ È®ÀÎ
		if(list.contains("¼­¿ï"))
		{
			System.out.println("¼­¿ïÀÌ Á¸ÀçÇÕ´Ï´Ù.");
		}
		System.out.println();
	
		// ¼­¿ïÀÌ ¸î ¹øÂ° ÀÎµ¦½º¿¡ À§Ä¡ÇÏ´ÂÁö È®ÀÎ
		int n = list.indexOf("¼­¿ï");
		System.out.println("¼­¿ïÀÇ ÀÎµ¦½º : " + n );
	
		// ´ëÇÑ¹Î±¹ Áö¿ì±â
//		list.remove("´ëÇÑ¹Î±¹");
		list.remove(0);
		
		System.out.println(list);
		
		// list ÀÇ ÀüÃ¼ ¿ä¼Ò Ãâ·Â
		System.out.print("ÀüÃ¼ Ãâ·Â...¨ç : ");
		for(int idx=0;idx<list.size();idx++)
		{
			System.out.print(list.get(idx) + " " );
		}
		System.out.println();
		
		// list ÀÇ ÀüÃ¼ ¿ä¼Ò Ãâ·Â
		System.out.print("ÀüÃ¼ Ãâ·Â...¨è : ");
		for(String str : list)
		{
			System.out.print(str + " " );
		}
		System.out.println();
		
		// list ÀÇ ÀüÃ¼ ¿ä¼Ò Ãâ·Â
		System.out.print("ÀüÃ¼ Ãâ·Â...¨é : ");
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			String str = it.next();
			System.out.print(str + " " );
		}
		System.out.println();
		
		// list ÀÇ ÀüÃ¼ ¿ä¼Ò Ãâ·Â
		System.out.print("ÀüÃ¼ Ãâ·Â...¨ê : ");
		ListIterator<String> li = list.listIterator();
		while(li.hasNext())
		{
			String str = li.next();
			System.out.print(str + " " );
		}
		System.out.println();
		
		
		// list ÀÇ ÀüÃ¼ ¿ä¼Ò ¿ª¼ø Ãâ·Â
		System.out.print("¿ª¼ø Ãâ·Â...¨ç : ");
		for(int idx=list.size()-1;idx>=0;idx--)
		{
			System.out.print(list.get(idx) + " " );
		}
		System.out.println();
		
		// list ÀÇ ÀüÃ¼ ¿ä¼Ò ¿ª¼ø Ãâ·Â
		System.out.print("¿ª¼ø Ãâ·Â...¨è : ");
		while(li.hasPrevious())
		{
			String str = li.previous();
			System.out.print(str + " " );
		}
		System.out.println();
	}
}