/*====================================
���� �ֹε�Ϲ�ȣ ��ȿ�� �˻� ����
======================================*/

// �� �ֹε�Ϲ�ȣ ���� ����
// 
//    �� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.
//	
//		123456-1234567
//		****** ******
//		234567 892345
//		
//	�� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.
//	
//	�� ������ ������� 11�� ������ ������ �� ���Ѵ�.
//	
//	�� 11���� �������� �� ������� ���Ѵ�.
//   
//  �� �� ���� ó���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ�
//     ��ġ�ϴ����� ���θ� ���Ͽ� Ȯ���Ѵ�.
//
//	�� ���� ������� 11 OR 10 �̸� �̸� �ٽ� 10���� ������ �������� ���Ѵ�.	

// �ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 

import java.util.*;

class ID
{
	private String id;
	private String head;
	private String tail;
	private int[] arr = new int[6];
	private int sum=0;
	
	ID()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : ");
		id = sc.next();
	}
	
	void check()
	{
		if(id.length()!=14){
			System.out.println(">> �Է� ����");
			return;
		}
		if(cal())
			System.out.println(">> ��Ȯ�� �ֹι�ȣ~");
		else
			System.out.println(">> �߸��� �ֹι�ȣ~");
	}
	
	boolean cal()
	{
		int cnt=0;
		int[] cal = {2,3,4,5,6,7,8,9};
		
		head=id.substring(0,6);
		tail=id.substring(7,id.length()-1);
		
		for(int i=0;i<arr.length;i++){
			arr[i]=head.charAt(i)-48;
			sum+=arr[i]*cal[cnt++];
		}
		
		for(int i=0;i<arr.length;i++){
			arr[i]=tail.charAt(i)-48;
			sum+=arr[i]*cal[cnt%8];
			cnt++;
		}
		
		sum%=11;
		int result=11-sum;
		
		if(result==11||result==10){
			result%=10;
			if(result==id.charAt(13)-48)
				return true;
			else
				return false;
		}
		
		if(result==id.charAt(13)-48)
				return true;
			else
				return false;
	}
}


public class Test110
{
	public static void main(String[] args)
	{
		ID id = new ID();
		id.check();
	}
}
