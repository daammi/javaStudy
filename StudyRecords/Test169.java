/* ====================================
  ���� �÷��� (Collection) ����
======================================*/

// Test169 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

import java.util.*;
import java.io.*;

class Menus		// �� �ϼ�
{
	public static final int E_ADD = 1;		//-- ����߰�
	public static final int E_DISP = 2;		//-- ������
	public static final int E_FIND = 3;		//-- ��� �˻�
	public static final int E_DEL = 4;		//-- ��� ����
	public static final int E_CHA = 5;		//-- ��� ����
	public static final int E_EXIT = 6;		//-- ����
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
			System.out.println("[ �޴� ���� ]==============");
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ���");
			System.out.println("3. ��� �˻�");
			System.out.println("4. ��� ����");
			System.out.println("5. ��� ����");
			System.out.println("6. ����");	
			System.out.println("===========================");
	}
	
	public static void menuSelect() throws IOException, NumberFormatException
	{
		do
		{
			System.out.print(">> �޴� ���� (1~6) : ");
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
			
				System.out.printf("%d��° ��� �Է� : ", cnt);
				String str = br.readLine();
				
				if(str!=null)
				{
					v.add((String)str);
					System.out.printf("%d��° ��� �Է� ����!\n",cnt);
					cnt++;
				}
				
		}
				System.out.print("��� �Է� ���(Y/N)? : ");
				con = br.readLine().toUpperCase();
		}
	
	}
	
	public static void dispElement()
	{
		if(v.size()!=0){
		System.out.println("[���� ��ü ���]");
		for(Object n : v)
			System.out.println((String)n);
		System.out.println("���� ��ü ��� �Ϸ�~!!");
		}
		else
		{
			System.out.println("����� ��Ұ� ���������ʽ��ϴ�.");
		}
	}

	public static void findElement() throws IOException
	{
		System.out.print("�˻��� ��� �Է� : ");
		String str = br.readLine();

		if(v.contains(str))
		{
			System.out.printf("[�˻� ��� ���]\n�׸��� �����մϴ�.");
		}
		else
		{
			System.out.printf("[�˻� ��� ���]\n�׸��� �������� �ʽ��ϴ�.");
		}
		System.out.println();
		
	}
	
	public static void delElement() throws IOException
	{
		System.out.print("������ ��Ҹ� �Է� : ");
		String str = br.readLine();
		
		if(v.contains(str))
		{
			int i= v.indexOf(str);
			v.remove(i);
			System.out.println("[���� ��� ���]");
			System.out.printf("%s �׸��� �����Ǿ����ϴ�.\n",str);
		}
		else
		{
			System.out.println("[���� ��� ���]");
			System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.");
		}
		System.out.println();
	}
	
	public static void chaElement() throws IOException
	{
		System.out.print("������ ��� �Է� : ");
		String str1 = br.readLine();
		
		if(v.contains(str1))
		{	
			int i= v.indexOf(str1);
			
			System.out.print("������ ���� �Է� : ");
			String str2 = br.readLine();
			
			v.set(i,str2);
			
			System.out.println("[���� ��� ���]");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("[���� ��� ���]");
			System.out.println("������ ����� �������� �ʽ��ϴ�.");
		}
		System.out.println();
	}		
	
	public static void exit() 
	{
		System.out.println("\n���α׷� ����~!!");
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