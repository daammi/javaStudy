/*================================================
���� ���� ó��(Exception Handling) ����
==================================================*/

import java.io.*;

public class Test154
{
	private String[] data = new String[3];
	
	public void proc() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		int n=0;
		
		System.out.print("�̸� �Է�(����:Ctrl+z) : ");
		while ((str=br.readLine())!=null)
		{
			data[n++] = str;
			System.out.print("�̸� �Է�(����:Ctrl+z) : ");
		}
		
		System.out.println("�Էµ� ���� ......... ");
		for(String s : data)
		{
			if(s != null)
				System.out.println(s);
		}
	}
	
// BufferedReader �� readLine() �޼ҵ嵵... IOException�� ����ϴ� ��!!
// �θ� Ŭ������ �޼ҵ忡�� ����ϴ� ����ó���̹Ƿ� �ڽ����ױ��� �Ѿ ���̴�.

// ArrayIndexOutOfBounds �� ��Ÿ�� �����̹Ƿ� unchecked exception �̴�.
// unchecked exception �̹Ƿ�, ����ó���� ���� �ʾƵ� �ڹٿ��� �ڵ����� �������� �����ش�.

	public static void main(String[] args) throws IOException
	{
		Test154 ob = new Test154();
		ob.proc();
	}
}