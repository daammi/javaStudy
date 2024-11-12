/* ====================================
  ���� �÷��� (Collection) ����
======================================*/

// Map �� Hashtable, HashMap

// null �Ұ� - Hashtable
//             �� �ܾ��̹Ƿ� t�� �빮�ڰ� �ƴϴ�
// null ��� - HashMap
//             Hash + Map �� �ռ��� �̹Ƿ� M �� �빮���̴�.


/*
�� java.util.Map �������̽�
   Ű(key)�� ��(value)�� ����(mapping)�ϸ�
   ������ Ű�� ����� �� ����, �����ؾ� �ϸ�,
   �� Ű�� �� ���� �� ���� �����ؾ� �Ѵ�.
   ��, �ϳ��� Ű�� �����ϴ� �ϳ��� ���� ���� �����̴�.
   
*/

/*
�� HashMap<K, V> Ŭ����

   - HashMap Ŭ������ Hashtable Ŭ������ ����������
     Map �������̽��� ��ӹ޾� �ֿ� ����� ������
	 Synchronization �� ���� ������ ���ü� ������ ���ٸ�
	 (��, ��Ƽ ������ ���α׷��� �ƴ� �����)
	 HashMap �� ����ϴ� ���� ������ ����ų �� �ִ�.

   - ����, HashMap �� Hashtable �� �޸� null �� ����Ѵ�.

*/

import java.util.*;
import java.io.*;

public class Test177
{
	public static void main(String[] args) throws IOException
	{
//		HashMap<String, String> map = new HashMap<String, String>();
		Map<String,String> map = new HashMap<String, String>();
		
		// map �̶�� HashMap �ڷᱸ���� ��� �߰�
		//  �� put();
		map.put("��ȭ", "�߰�︲");
		map.put("���", "��¡�����");
		map.put("��ȭ", "������ũ");
		
		System.out.println(map);
		// {���=��¡�����, ��ȭ=�߰�︲, ��ȭ=������ũ}
		// ������ ���� ���� Ȯ��
		// ������ ��� �ݳ� ������ ������ ������ ���� ����
		
		// �� null ���� ó�� Hashtable�� �ȵǴµ� HashMap�� �ʤ���
		
		map.put(null,null);
		
		System.out.println(map);
		
		map.put("��ȭ", null);
		
		System.out.println(map);
		
		map.put(null, "�𳪸���");
		
		System.out.println(map);
		
//		������ �Է� ������ ���� ��� ������ null �Է��� ����������
//		������ null �� key �� ���ε� "�𳪸���"��
//		���� null �� key �� �����ϴ� null �� ����� ��Ȳ�� �߻��ϰ� �ȴ�.
//		��, HashMap �� null �� �ϳ��� ������ key �� �����Ѵ�.
	
		System.out.println();
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("ī�װ�, Ÿ��Ʋ �Է� (�޸� ����) : ");
		String[] temp;
		
		for(String str; (str=br.readLine())!=null; )
		{
			temp = str.split(",");
			if(temp.length<2)
			{
				System.out.print("ī�װ�, Ÿ��Ʋ �Է� (�޸� ����) : ");
				continue;
			}
			
			map.put(temp[0].trim(), temp[1].trim());
			
			System.out.println(map);
		}
		
	}
		
}
