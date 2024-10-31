/*================================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- String Ŭ����
==================================================

substiring()
equals()
equalsIgnoreCase()
indexOf()
endsWith()
lastIndexOf()
charAt()
compareTo()
replaceAll()
format()
split()
*/

public class Test141
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println("s : " + s);
		//--==>> s : seoul korea
		
		// �� ���ڿ� ����
		// seoul korea
		System.out.println(s.substring(6,9));
		//--==>> kor
		
		// �� ��String.substring(s, e)��
		//     String ���ڿ��� �������
		//     s ��°����... e-1 ��°���� �����Ͽ� ��� ���ڿ� ��ȯ
		//     (��, �ε����� 0���� ����)
		
		// seoul korea
		System.out.println(s.substring(7));
		//--==>> orea
		
		// �� ��String.substring(s)��
		//     String ���ڿ��� �������
		//     s ��°����... ������ �����Ͽ� ��� ���ڿ� ��ȯ
		//     (��, ���ڿ��� ���� ���̸�ŭ...)
		
		// �� ���ڿ��� ������(��) ��
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("seoul Korea"));
		//--==>> true
		//		 false
		//-- ��ҹ��� ������ ����
		
		System.out.println(s.equalsIgnoreCase("SEOUL KOREA"));
		System.out.println(s.equalsIgnoreCase("SeOuL kOrEa"));
		//--==>> true
		//		 true
		//-- ��ҹ��� ���� ����
		
		// �� ã���� �ϴ� ��� ���ڿ���
		//    ��kor�� ���ڿ��� �����ұ�?
		//    �����Ѵٸ�... �� ��ġ�� ��� �ɱ�?
		
		// seoul korea
		// 01234567890
		System.out.println(s.indexOf("kor"));
		//--==>> 6
		// �ε����� �����ϴ� ��ġ ��ȯ
		
		// seoul korea
		// 01234567890
		System.out.println(s.indexOf("ea"));
		//--==>> 9
		
		// seoul korea
		// 01234567890
		System.out.println(s.indexOf("e"));
		//--==>> 1
		//-- ���� ã�� ���ڿ��� �ε����� ��ȯ�ϰ� ����Ǵ� ����
		
		// seoul korea
		// 01234567890
		System.out.println(s.indexOf("tt"));
		//--==>> -1
		//-- ã���� �ϴ� ���ڿ�(tt)�� ��� ���ڿ�(s)�� ������ ���
		//   �� ���ڿ��� �ε����� ��ȯ������
		//   �������� ���� ��� ������ ��ȯ�ϰ� �ȴ�.(-1)
		
		// �� ��� ���ڿ�(s)�� ��rea���� ���������� ���� Ȯ��
		//   (�� true / false)
		System.out.println(s.endsWith("rea"));
		System.out.println(s.endsWith("oul"));
		//--==>> true
		//       false
		
		// �� ã���� �ϴ� ���ڿ�(s)��
		//	  ��kor�� ���ڿ��� �����ұ�?
		//	  �����Ѵٸ�... �� ��ġ�� ��� �ɱ�?
		//    (��, �ڿ������� �˻�)
		
		// seoul korea
		System.out.println(s.indexOf("e"));
		System.out.println(s.indexOf("o"));
		//--==>> 1
		//       2
		
		// seoul korea
		System.out.println(s.lastIndexOf("e"));
		System.out.println(s.lastIndexOf("o"));
		//--==>> 9
		//		 7

		// �� ��� ���ڿ�(s) ��
		//    ��6�� ��° �ε��� ��ġ�� ���ڴ�?
		
		//  seoul korea
		System.out.println(s.charAt(6));
		System.out.println(s.charAt(10));
		//--==>> k
		//		 a
		
		// seoul korea
		// System.out.println(s.charAt(22));
		//--==>> ���� �߻�(��Ÿ�� ����)
		//		 StringIndexOutOfBoundsException �� ��� ���ڿ��� ������ �ε����� ��� ���...
		
		// �� ��� ���ڿ�(s)�� �� ���ڿ� ��seoul corea�� ��
		//    � ���ڿ��� �� ū��?        �� ���ڿ��� ���� ũ�� ��
		//	  - �� ���ڿ��� ���ٸ�...		�� 0
		//    - �� ���ڿ��� �ٸ��ٸ�...     �� ���̸� ��ȯ(������ �迭)
		
		// seoul korea
		System.out.println(s.compareTo("seoul korea"));
		//--==>> 0
		//-- �� ���ڿ��� ����.
		//   ��, s�� "seoul korea" �� ����.
		
		System.out.println(s.compareTo("seoul corea"));
		//--==>> 8
		//-- �� ���ڿ��� ���� �ʴ�.
		//   ��, s�� "seoul corea" �� ���� �ʴ�.
		//-- c ~ k �� defghijk �� 8
		
		// �� ��� ���ڿ�(s) ��
		//    �ش� ���ڿ��� ��� ã�� ���ϴ� ���·� ������ ���ڿ� ��ȯ
		
		s = "�츮���� ���ѹα� ���ѵ��� ����";
		System.out.println("s : " + s);
		//--==>> s : �츮���� ���ѹα� ���ѵ��� ����
		
		s = s.replaceAll("����", "����");
		//-- �� ��repalceAll()���� JDK 1.5 ���ĺ��� ��� ����.
		
		System.out.println("s : " + s);
		//--==>> s : �츮���� ���ѹα� ���ѵ��� ����
		//		 s : �츮���� ���ֹα� ���ֵ��� ����
		
		// �� ���� ����
		s = s.replaceAll(" ", "");		// s = s.replaceAll("\\s", "");
		System.out.println("s : " + s);
		//--==>> s : �츮�������ֹα����ֵ�������
		
		s = "          ��        ��         ";
		System.out.println(s);
		//--==>>           ��        ��
		
		System.out.println("|" + s + "|");
		//--==>> |          ��        ��         |
		
		System.out.println("|" + s.trim() + "|");
		//--==>> |��        ��|
		// -- ���� �����ڸ� ���� ����
		
		System.out.println("|" + s.replaceAll(" ", "") + "|");
		//--==>> |���|
		
		// "50"
		int temp = Integer.parseInt("50");
		//System.out.println(temp);
		System.out.printf("%d\n", temp);
		//--==>> 50
		
		s = Integer.toString(30);
		System.out.printf("%s\n", s);
		//--==>> 30
		
		int n = 2345678;
		//System.out.printf("%d", n);
		//--==>> 2345678
		//System.out.format("%d", n);
		//--==>> 2345678
		
		System.out.println();	// ����
		
		
		s = String.format("%d", n);	// 2345678 �� "2345678"  (�̷� ������ ���ڿ��� ��ȯ�ض�)
		System.out.println(s);
		//--==>> 2345678
		
		s = String.format("%d��", 10);
		System.out.println(s);
		//--==>> 10�� �� ���ڿ� ����
		
		s = String.format("%.2f", 3.141592);
		System.out.println(s);
		//--==>> 3.14
		
		s = String.format("%d + %d = %d", 10, 20, 30);
		System.out.println(s);
		//--==>> 10 + 20 = 30
		
		s = String.format("%b", true);
		System.out.println(s);
		//--==>> true
		
		// String str = "�⺻,����,���";
		// String[] strArr = str.split(",");
		
		// line 214 ~ 215 �� ������ ����
		String[] strArr = "�⺻,����,���".split(",");
		
		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();
		//--==>> �⺻ ���� ���
	}
}
