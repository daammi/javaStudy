/* ========================================
  ���� �ڹ��� �⺻ �����(I/O) ����
  - Reader �ǽ�
==========================================*/

// Test179.java ���ϰ� ��


// ���� ��� ��Ʈ��   - Reader. Writer.
// ����Ʈ ��� ��Ʈ�� - read, write
// new BufferedReader ( new ������ (System.in) );
// __________________  -----------  ==========
//       ����          ����Ʈ�湮��    ����Ʈ

// ������: InputStreamReader
//         ----------- ====
//          ����Ʈ     ����
//
// ����Ʈ ����� ���� ������� �о���̴� InputStreamReader
// InputStream �� ����Ʈ
// Reader �� ����            

import java.io.*;

public class Test180
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;
		
		// System.in		 : �ڹ��� ǥ�� �Է� ��Ʈ�� �� ����Ʈ ��� ��Ʈ��
		// InputStreamReader : ����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������... (�뿪, ����, ���͸�)
		// Reader			 : ���� ��� ��Ʈ�� ��ü
		Reader rd = new InputStreamReader(System.in);
		
		System.out.println("���ڿ� �Է�(����:Ctrl+z)");
		
		// ���� ��� �о���̴� ó��
		while((data=rd.read()) != -1)
		{
			ch = (char)data;
			
			// ���� ��� ��� ó��
			System.out.print(ch);
//			���ڿ� �Է�(����:Ctrl+z)
//			1234
//			1234
//			abcd
//			abcd
//			�����ٶ�
//			�����ٶ�
//			^Z
//			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

			System.out.write(ch);
//			���ڿ� �Է�(����:Ctrl+z)
//			1234
//			1234
//			abcd
//			abcd
//			�����ٶ�
//			��|
//			^Z
//			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

		}
	}
}