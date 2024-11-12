/* ====================================
  ■■■ 컬렉션 (Collection) ■■■
======================================*/

// List → String[] : List.toArray()
// String[] → List : Arrays.asList()

import java.util.*;

public class Test173
{
	public static void main(String[] args)
	{
		List<String> mList = new ArrayList<String>();
		
		mList.add("1");
		mList.add("2");
		mList.add("3");

		// List → String[]
		// mList.toArray(new String[100])
		String[] sArrays = mList.toArray(new String[mList.size()]);
		
		for(String str : sArrays)
		{
			System.out.print(str : " ");
		}
		System.out.println();
		
		Arrays.asList(sArrays);
		// ※ Arrays.asList() 의 반환 자료형은 List
		
		for(String sr : mNewList)
		{
			System.out.print(str + " ");
		}
		System.out.println();
		
	}
}