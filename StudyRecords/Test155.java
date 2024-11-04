/* ============================================
  ���� ���� ó��(Exception Handling) ����
=============================================*/

// Test154.java �� ��

import java.io.*;

public class Test155
{
	String[] data = new String[3];
	String str;
	int n=0;
	
	Test155() //throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			System.out.print("�̸��� �Է��ϼ���(Crtl + z ����) : ");
			while((str=br.readLine())!=null)
			{
				data[n++]=str;
				System.out.print("�̸��� �Է��ϼ���(Crtl + z ����) : ");
			}
			
			print();	
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("�迭 �ε��� ���� ���� �߻�~!!!");
		}
		
	}
	
	void print(){
		
		for(int i=0;i<3;i++){
			if(data[i]!=null)
				System.out.println(data[i]);
		}
	}
		
	
	public static void main(String[] args) // throws IOException
	{
		Test155 ob = new Test155();
	}
}