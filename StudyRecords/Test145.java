/*================================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- StringTokenizer Ŭ���� ( ���丸 ���� )
==================================================*/

/*
�� StringTokenizer Ŭ����

   ���ڿ� �Ľ�(parsing) �� ���� ������ �����ϴ� Ŭ������
   �Ľ�(parsing) �ϰ��� �ϴ� ���ڿ��� ���ڷ� �޾� �����ϴµ�,
   ���⿡�� �Ľ�(parsing) �̶� �ϳ��� ���ڿ��� ���� ���ڿ���
   ������ �۾��� �ǹ��ϰ� �Ǹ�, �� �� ������ ������ �Ǵ� ���ڿ���
   ��ū(Token) �̶�� �Ѵ�.
   
   StringTokenizer Ŭ������ ����ϱ� ���ؼ���
   java.util ��Ű���� StringTokenizer ��  import �ؾ� �Ѵ�.
   
   StringTokenizer Ŭ������ ȣȯ���� �����ϴ� ��������
   ���� �����ǰ� ������, ���ڿ��� �Ľ�(parsing) �ϱ� ���ؼ���
   String Ŭ������ split() �޼ҵ峪 java.util.regex ��Ű����
   ����� ���� �����ϰ� �ִ�.
   
�� ������

  - ����
	StringTokenizer(String str)
	StringTokenizer(String str, String delim)
	StringTokenizer(String str, String delim, boolean returnDelims)
	: �־��� ���ڿ� str �� �ܾ�� �и��ϴ� ��ü�� �����ϸ�
	  ����(����) ���ڴ� delim �� ���Ե� ���ڷ� ó���ϰ� �ȴ�.
	  ���� returnDelims �� true �̸�
	  ���� ���ڵ� �и��� �����Ϳ� �����Ͽ� ó���ϰ� �ȴ�.
*/

import java.io.*;
import java.util.*;

public class Test145
{
	public static void main(String[] args) throws IOException
	{
		String strTemp;
		String[] strArr;
		int n;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�Ľ��� ���ڿ� �Է�(�޸� ����) : ");
		strTemp = br.readLine();
		
//		StringTokenizer �ν��Ͻ� ����
		StringTokenizer st = new StringTokenizer(strTemp, ", ");
		
		strArr = new String[st.countTokens()];
		
		n=0;
		while(st.hasMoreTokens())
		{
			strArr[n++] = st.nextToken();
		}

//		hasMoreTokens()
//		: ����� �� �ִ� ��ū�� �����ִ� ��� true �� ��ȯ
//		  �� �̻� ����� ��ū�� ���� ��� false �� ��ȯ.
//		  Ȯ���� ����� ��ȯ�� ��..
//		  ���� �����͸� �о�������� �ʰ�
//		  ���� �����͸� �о���̴� ��带 �̵���Ű���� �ʴ´�.

//		nextToken()
//		: ���� ��ū�� ���´�.
//		  ���� ��ū�� ������ ��带 �̵���Ű�� �ȴ�.
//		  �����ڸ� �ٲپ��� ��� ���� ȣ�⿡��
//		  �ٲ� �����ڸ� Ȱ���Ͽ� ��ū�� �и��Ѵ�.
		
		for(String i : strArr)
		{
			System.out.println(i);
		}
	}
}