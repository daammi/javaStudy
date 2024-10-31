/*================================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- Calendar Ŭ����
==================================================*/
/*

�� Calendar Ŭ������ �߻� Ŭ�����̱� ������ ��ü�� ������ �� ����.
   (�߻� Ŭ���� : �̿ϼ��� Ŭ���� ��, �ϼ����� ���� ���赵)

   Calendar ob = new Calendar();
   �� �̿� ���� ������ ���� �ν��Ͻ� ���� �Ұ�.


�� Calendar Ŭ���� ��ü(�ν��Ͻ�)�� ������ �� �ִ� ���

   1. Calendar ob1 = Calendar.getInstance(); 
      �� ��Calendar �ν��Ͻ��� ��ȯ�ϴ� getInstance() static �޼ҵ�� Calendar ��ü������
   
   2. Calendar ob2 = new GregorianCalendar();
      -------            ------------------  �� �ڽ� Ŭ������ �ν��Ͻ�    �� �� ĳ����!!!
        �� �θ� Ŭ���� ���� ����

	// GregorianCalendar gc = new GregorianCalendar();
	// Calendar ob2 = gc;
	// Calendar ob2 = (Calendar)gc;			
	  �� ���ڽ� Ŭ���� GregorianCalendar�� ��ĳ�������� Calendar ��ü������

   3. GregorianCalendar ob3 = new GregorianCalendar();
     (�� GregorianCalendar : Calendar Ŭ������ ���� Ŭ����)
	  �� ���ڽ� Ŭ������ �ν��Ͻ��� �����ϸ�, �� �ȿ� �θ� Ŭ������ �ν��Ͻ��� ���ԵǾ� �����ǷΡ�


*/

// ��, ��, ��, ������ Calendar ��ü�κ��� ������ ���

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test147
{
	public static void main(String[] args)
	{
//		Calendar �ν��Ͻ� ����
		Calendar rightNow = Calendar.getInstance();
		
//		������ �޷�(rightNow) �ν��Ͻ��� ����
//		��¥ ���� ������ �� �� �ִ� �޼ҵ�
//      �� get()
		
		int y = rightNow.get(Calendar.YEAR);
		System.out.println("y : " + y);
	
		int m = rightNow.get(Calendar.MONTH) + 1;  // ���� �迭�� �־��!!!
		System.out.println("m : " + m);
			
		int d = rightNow.get(Calendar.DATE);
		System.out.println("d : " + d);

		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("w : " + w);

		
//		�׽�Ʈ(Ȯ��)

//		System.out.println(Calendar.SUNDAY);		//--==>> 1 �� �Ͽ���
//		System.out.println(Calendar.MONDAY);		//--==>> 2 �� ������
//		System.out.println(Calendar.TUESDAY);		//--==>> 3 �� ȭ����
//		System.out.println(Calendar.WEDNESDAY);		//--==>> 4 �� ������
//		System.out.println(Calendar.THURSDAY);		//--==>> 5 �� �����
//		System.out.println(Calendar.FRIDAY);		//--==>> 6 �� �ݿ���
//		System.out.println(Calendar.SATURDAY);		//--==>> 7 �� �����

		String week="";
		
		switch (w)
		{
			case 1 : week = "�Ͽ���"; break;
			case 2 : week = "������"; break;
			case 3 : week = "ȭ����"; break;
			case 4 : week = "������"; break;
			case 5 : week = "�����"; break;
			case 6 : week = "�ݿ���"; break;
			case 7 : week = "�����"; break;
		}

		System.out.println(y + "-" + m + "-" + d + " " + week);

		Calendar rightNow2 = new GregorianCalendar();
		
		String[] week2 = {"��","��","ȭ","��","��","��","��"};
		
//		�޷��� ��¥�� ����
//		�� set() �޼ҵ� Ȱ��

		rightNow2.set(2025, 3, 22);       // ���� �迭�� �־ -1 �������!!!
		
		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		
	}
}