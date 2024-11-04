/* ====================================
  ���� �÷��� (Collection) ����
======================================*/

// �� �ڷᱸ�� ��ü ���� �� ���� ��
//    ����� ���� Ŭ���� Ȱ��
//    �� ����� ���� �ڷ������� Ȱ��

import java.util.*;

// Ŭ���� �� ����� ���� �ڷ������� Ȱ��
class UserData
{
	private String name;
	private int age;
	
	String getName()
	{
		return name;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	int getAge()
	{
		return age;
	}
	
	void setAge(int age)
	{
		this.age = age;
	}
	
	public UserData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	// �� ����� ���� �����ڰ� ������ ���
	//    default �����ڰ� �ڵ����� ���Ե��� �ʱ� ������
	//    default ������ ������ �����ڸ� ����� ���� �����ڷ�
	//    �߰� �����ϰ� �Ǵ� ���� �Ϲ����� Ŭ���� ���� ����
	//    (�ݵ�� �����ؾ� �Ѵٴ� �������� ��Ģ�� ����.)

	public UserData()
	{
//		name = "";
//		age = 0;

		this("", 0);	//�Ű����� �� �� �޴� ������		

	}
	
}
public class Test168
{
	public static void main(String[] args)
	{
		Vector<UserData> v = new Vector<UserData>();
		
		UserData[] ud = new UserData[3];
		
		String[] str = {"�Ӽ���","������","������"};
		int[] age = {3,17,49};		
		
		for(int i=0;i<3;i++)
		{
			ud[i]=new UserData(str[i],age[i]);
			v.add(ud[i]);
		}
		
		
//		for(UserData n : ud)
//			System.out.printf("�̸�: %s, ����: %d\n",n.getName(),n.getAge());
		
		for(Object temp : v)
		{
			UserData n = (UserData)temp;
			System.out.printf("�̸�:%s, ����:%d��\n",n.getName(),n.getAge() );
		}
		
	}
}