/*================================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- Calendar Ŭ����
==================================================*/

// ������ �������� �Է¹޴� ��¥��ŭ ���� �� �� �� ������
// Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
// 
// ���� ��)
// ���� ��¥: 2024-10-30 ������
// �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? :

// �� Calendar �� ������ API Document ����~!!!
//    ��add()��
//    : ���� ��¥�� �������� �� �� ���ϴ� ���� �޼ҵ�
//    �� ����ü.add(Calendar.DATE, �� ��);��

// �١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�
// ���ڿ� ��ȯ. ������ ���Ĵ��. %t �� �޷� ��ü ��
// String.format("%tF", �޷� ��ü);
// �� ����-��-�ϡ� ������ ���ڿ� ��ȯ

// String.format("%tA", �޷°�ü);
// �� ���� ������ ���ڿ� ��ȯ
// �١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�
		

import java.util.*;
public class Test149
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		
		int y = cal.get(cal.YEAR);
		int m =	cal.get(cal.MONTH)+1;
		int d = cal.get(cal.DATE);
		String[] w = {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
		int day=cal.get(cal.DAY_OF_WEEK)-1;
		System.out.printf("���� ��¥ : %tF %tA\n", cal,cal);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��ĥ ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
		int after = sc.nextInt();
		
		cal.add(cal.DATE,after);
		y = cal.get(cal.YEAR);
		m =	cal.get(cal.MONTH)+1;
		d = cal.get(cal.DATE);
		day=cal.get(cal.DAY_OF_WEEK)-1;
		System.out.println("=======================");
//		System.out.printf("%d�� �� : %d-%d-%d-%s\n",after,y,m,d,w[day] );
		System.out.printf("%d�� �� : %tF %tA\n",after,cal,cal);		
		System.out.println("=======================");
		
	}
}