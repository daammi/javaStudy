/* ========================================
  ���� �ڹ��� �⺻ �����(I/O) ����
  - Reader Writer ���� �ǽ�
==========================================*/

import java.io.*;

public class Test182
{
	public void process(InputStream is)	// System.in ����~ (�� �ڹ��� ǥ�� �Է� ��Ʈ�� 
										//					�� ����Ʈ ��� ��Ʈ��	  )
	{
		int data;
		
		System.out.println("���ڿ� �Է�(����:Ctrl+z)");
		
		try
		{
			// �Ű����� is ��� ����Ʈ ��� ��ü(InputStream)��
			// ���� ��� ��Ʈ������ ��ȯ�Ͽ�
			// (�� InputStreamReader �� ����)
			// Reader Ÿ���� rd ���� ������ �� �ֵ��� ó��
			Reader rd = new InputStreamReader(is);	// System.in �� InputStreamm �� Reader
			//-- ���� ��� �Է� ��Ʈ�� rd~!!
			
			// ����Ʈ ��� ��Ʈ���� �ڹ��� �⺻ ��� ��Ʈ��(System.out)��
			// ���� ��� ��Ʈ������ ��ȯ�Ͽ�
			// (�� OutputStreamWriter �� ����)
			// Writer Ÿ���� wt ���� ������ �� �ֵ��� ó��
			Writer wt = new OutputStreamWriter(System.out);
			//-- ���� ��� ��� ��Ʈ�� wt~!!
			
			
			while ((data=rd.read())!=-1)	//-- ���� ��� �Է� ��Ʈ������ �о���̱�...	�� �ݺ�
			{
				wt.write(data);				//-- ���� ��� ��� ��Ʈ��(���ٱ�)�� data ���  �� �ݺ�
				wt.flush();					//-- ����� ��Ʈ��(���ٱ�)�� �о�� ������    �� �ݺ�
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args)
	{
		Test182 ob = new Test182();
		ob.process(System.in);
//		���ڿ� �Է�(����:Ctrl+z)
//		1234
//		1234
//		abcd
//		abcd
//		�����ٶ�
//		�����ٶ�
//		^Z
//		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
	}
}