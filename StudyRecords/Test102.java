/*================================================
���� Ŭ������ �ν��Ͻ� ����
- �������а� ��������ý���(���� ������, ���� ������, ���� ������, ���� ������)
===================================================*/

import java.util.*;

class CircleTest2
{
//	CircleTest2�� �������, �ν��Ͻ� ����, ���� ����
//	int num;
	
//	   ��
	
//	���� ����(Information Hiding)
//	�ν��Ͻ� ������ private �̶�� ���������������� ������
//	Ŭ���� ���ο����� ���� �� ������ �����ϰ� �ϰڴٴ� �ǹ�
//	int �� ���� ���� �� �ڵ� 0 ���� �ʱ�ȭ ����
	
	private int num;
	
//	getter / setter ����

	public int getNum()
	{
		return this.num;	
	}
	
	public void setNum(int num)
	{
		this.num = num;
	}
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		num = sc.nextInt();
	}
	
	double calArea()
	{
		return num*num*3.141592;
	}
	
	void write(double area)
	{
		System.out.println("������ : " + num);
		System.out.println("���� : " + area);		
	}
}

public class Test102
{
	public static void main(String[] args)
	{
//		CircleTest2 �ν��Ͻ� ����
		CircleTest2 ob1 = new CircleTest2();
		
//	 �� ����ν�� �����ϰ�
//		CircleTest2 �� num �� �����͸� ������ �� �ִ� ���
		ob1.setNum(10);

		double result = ob1.calArea();
		
		ob1.write(result);
		
	}
}