/*================================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- StringBuffer Ŭ����
==================================================*/

public class Test144
{
	public static void main(String[] args)
	{
		String s1 = "123456789";
		s1 = (s1+"123").replace('2', 'A');
		System.out.println("s1 : " + s1);
		
		StringBuffer s2 = new StringBuffer("123456789");
		s2.delete(0,3).replace(1,3,"24").delete(4,6);
		System.out.println("s2 : " + s2);
		
		StringBuffer s3 = new StringBuffer("123456789");
		String s4 = s3.substring(3, 6);
		System.out.println("s4 : " + s4);
	
		StringBuffer s5 = new StringBuffer("123456789");
		s5.delete(0,3).delete(1,3).delete(2,5).insert(1,"24");
		System.out.println("s5 : " + s5);
	}
}