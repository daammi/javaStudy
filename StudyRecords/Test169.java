/* ====================================
  ■■■ 컬렉션 (Collection) ■■■
======================================*/

// Test169 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.

import java.util.*;
import java.io.*;

class Menus		// → 완성
{
	public static final int E_ADD = 1;		//-- 요소추가
	public static final int E_DISP = 2;		//-- 요소출력
	public static final int E_FIND = 3;		//-- 요소 검색
	public static final int E_DEL = 4;		//-- 요소 삭제
	public static final int E_CHA = 5;		//-- 요소 변경
	public static final int E_EXIT = 6;		//-- 종료
}

public class Test169
{
	private static final Vector<Object> v;
	private static BufferedReader br;
	private static Integer sel;
	private static String con;
	
	static
	{
		v = new Vector<Object>();
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		sel = 1;
		con = "Y";
	}
	
	public static void menuDisp()
	{
			System.out.println();
			System.out.println("[ 메뉴 선택 ]==============");
			System.out.println("1. 요소 추가");
			System.out.println("2. 요소 출력");
			System.out.println("3. 요소 검색");
			System.out.println("4. 요소 삭제");
			System.out.println("5. 요소 변경");
			System.out.println("6. 종료");	
			System.out.println("===========================");
	}
	
	public static void menuSelect() throws IOException, NumberFormatException
	{
		do
		{
			System.out.print(">> 메뉴 선택 (1~6) : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1||sel>6);
		System.out.println();
	}
	
	public static void menuRun() throws IOException
	{
		switch(sel)
		{
			case Menus.E_ADD: addElement(); break;
			case Menus.E_DISP: dispElement(); break;
			case Menus.E_FIND: findElement(); break;
			case Menus.E_DEL: delElement(); break;
			case Menus.E_CHA: chaElement(); break;
			case Menus.E_EXIT: exit(); break;			
		}

	}
	
	public static void addElement() throws IOException
	{
		int cnt=1;

		while(true){
			
		if(con.equals("N"))
				break;
		else if(con.equals("Y")){
			
				System.out.printf("%d번째 요소 입력 : ", cnt);
				String str = br.readLine();
				
				if(str!=null)
				{
					v.add((String)str);
					System.out.printf("%d번째 요소 입력 성공!\n",cnt);
					cnt++;
				}
				
		}
				System.out.print("요소 입력 계속(Y/N)? : ");
				con = br.readLine().toUpperCase();
		}
	
	}
	
	public static void dispElement()
	{
		if(v.size()!=0){
		System.out.println("[벡터 전체 출력]");
		for(Object n : v)
			System.out.println((String)n);
		System.out.println("벡터 전체 출력 완료~!!");
		}
		else
		{
			System.out.println("출력할 요소가 존재하지않습니다.");
		}
	}

	public static void findElement() throws IOException
	{
		System.out.print("검색할 요소 입력 : ");
		String str = br.readLine();

		if(v.contains(str))
		{
			System.out.printf("[검색 결과 출력]\n항목이 존재합니다.");
		}
		else
		{
			System.out.printf("[검색 결과 출력]\n항목이 존재하지 않습니다.");
		}
		System.out.println();
		
	}
	
	public static void delElement() throws IOException
	{
		System.out.print("삭제할 요소를 입력 : ");
		String str = br.readLine();
		
		if(v.contains(str))
		{
			int i= v.indexOf(str);
			v.remove(i);
			System.out.println("[삭제 결과 출력]");
			System.out.printf("%s 항목이 삭제되었습니다.\n",str);
		}
		else
		{
			System.out.println("[삭제 결과 출력]");
			System.out.println("항목이 존재하지 않아 삭제할 수 없습니다.");
		}
		System.out.println();
	}
	
	public static void chaElement() throws IOException
	{
		System.out.print("변경할 요소 입력 : ");
		String str1 = br.readLine();
		
		if(v.contains(str1))
		{	
			int i= v.indexOf(str1);
			
			System.out.print("수정할 내용 입력 : ");
			String str2 = br.readLine();
			
			v.set(i,str2);
			
			System.out.println("[변경 결과 출력]");
			System.out.println("변경이 완료되었습니다.");
		}
		else
		{
			System.out.println("[변경 결과 출력]");
			System.out.println("변경할 대상이 존재하지 않습니다.");
		}
		System.out.println();
	}		
	
	public static void exit() 
	{
		System.out.println("\n프로그램 종료~!!");
		System.exit(-1);
	}	
	
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}