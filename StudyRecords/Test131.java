/*=====================================
���� �ڹ��� �ֿ� Ŭ���� ����
- Object Ŭ����
=======================================*/

public class Test131
{
	@Override
	public String toString()
	{
		return "�������� toString()...";
	}
	
	public static void main(String[] args)
	{
		Test131 ob = new Test131();
		
		System.out.println(ob.toString());
//		�������� toString()...
		
		System.out.println(ob);
//		�������� toString()...
	}
}

/*
System.out.println(Object obj); �޼���� ��ü�� ����� �� �ڵ����� obj.toString() �޼��带 ȣ���Ͽ� ��ȯ�� ���ڿ��� ����մϴ�.

Test131 Ŭ�������� toString() �޼��带 �����������Ƿ� System.out.println(ob);�� ob.toString()�� ����� �����ǵ� "�������� toString()..." ���ڿ��� ����ϰ� �˴ϴ�.

���� System.out.println(ob.toString());�� System.out.println(ob);�� �����ϰ� "�������� toString()..."�� ����մϴ�.

*/