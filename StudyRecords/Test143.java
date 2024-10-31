/*================================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- StringBuffer Ŭ����
==================================================*/

/*
�� StringBuffer Ŭ����

   ���ڿ��� ó���ϴ� Ŭ������ String Ŭ�������� ��������
   String Ŭ������ ���� ���ڿ� �������� ������ �Ұ���������
   StringBuffer Ŭ������ ���ڿ��� ����� ��
   ���� ���ڿ��� ���� �ܰ迡�� ������ �� �ִ�.
   
   ��, StringBuffer ��ü�� �������� ���̸� �����Ƿ�
   ��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
   ���� ������ ������ ũ�⸦ �ٲ� �� �ִ� ����� �����Ѵ�.
   
   ����, JDK 1.5 ���� ���ʹ�
   ���ڿ��� ó���ϴ� StringBuilder ��� Ŭ������ �����Ѵ�.
   StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ����������
   ���� ū �������� multi-thread unsafe ��� ���̴�.
   ��, Syncronization �� ���� ������
   StringBuffer ���� ������ ���ü�(����ȭ) ������ ���ٸ�
   StringBuilder �� ����ϴ� ���� ������ ����ų �� �ִ�.
*/


public class Test143
{
	public static void main(String[] args)
	{
		String str1 = new String("seoul");
		String str2 = new String("seoul");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
//		false
//		true
		
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");
//		String Ŭ���� �ܿ��� ��� ���ڿ� ���� Ŭ������ 
//	    new �����ڸ� ���ؼ��� �޸� �Ҵ� ����.
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));		
//		false
//		false

		System.out.println("----------------------------------------");
		
		System.out.println(sb1);					// StringBuffer Ÿ��
		System.out.println(sb1.toString());			// String Ÿ��
		
		System.out.println(sb1.toString().equals(sb2.toString()));	
		
		System.out.println("----------------------------------------");
		
		StringBuffer sb3 = new StringBuffer();		// �⺻ ������ ȣ��
													// �⺻������ �����Ǵ� ������ ũ��� ��16��
		
//		capacity();
		System.out.println("���� ũ�� : " + sb3.capacity());
		
		String name = "��";
		name += "��";
		name += "��";
		name += "¯";
		
		System.out.println(name);
		
		sb3.append("seoul");
		sb3.append("korea");
		sb3.append("�츮����");		
		sb3.append("���ѹα�");
		
		System.out.println(sb3);
		System.out.println(sb3.toString());
		System.out.println("���� ũ�� : " + sb3.capacity());
		
		String tmp1 = "java and oracle";
		System.out.println(tmp1.toUpperCase());		  // String Ÿ���� Method
		
		String tmp2 = "JAVA AND ORACLE";
		System.out.println(tmp2.toLowerCase());       // String Ÿ���� Method
		
		
//		�� ��� ���ڿ� �� seoul �տ� "�ѱ�" �̶�� ���ڿ� �߰�
		sb3.insert(0, "�ѱ�");
		System.out.println(sb3);

//		�� ��� ���ڿ� �� korea �ڿ� "���" �̶�� ���ڿ� �߰�
		sb3.insert(sb3.indexOf("korea")+"korea".length(), "���");
		System.out.println(sb3);		
	
//		�� ��� ���ڿ� �� "�츮����" ���ڿ� ����	
//		sb3.delete(14,18);
//		System.out.println(sb3);
		
//		�� ��� ���ڿ� �� "�츮����" ���ڿ� ����	
		sb3.delete(sb3.indexOf("�츮����"),sb3.indexOf("�츮����")+"�츮����".length());
		System.out.println(sb3);
		
//		�� ��� ���ڿ�(sb3) ����
//		   "korea" ���� ��� ���ڿ� ����(korea ����)
		sb3.delete(sb3.indexOf("korea"),sb3.length() );
		System.out.println(sb3);
	
//		���� ũ�� �ٽ� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		
//		���� ũ�� ����
//		�� ���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���...
//		trimToSize();
		sb3.trimToSize();
		
//		���� ũ�� ���� ���� ���� ũ�� �ٽ� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());		
	}
}