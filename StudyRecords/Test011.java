
// �� ������ �ڷ���
//  
// Q. ���簢���� ���̿� �ѷ��� ���ϴ� ���α׷��� �ۼ��Ѵ�.
//    ���� : 10, ���� : 20

import java.util.Scanner;

public class Test011
{	
	public static void main(String[] args)
	{
		//����
		/*
		int width = 10, height = 20;
		System.out.printf("���� : %d\n�ѷ� : %d\n", width*height, 2*(width+height));
		*/
		
		
		// ���� ���� �� �ʱ�ȭ
		int width = 10;
		int height = 20;
		
		// ���� �� ó��
		int area = width * height;
		int length = (width + height) * 2;
		
		// ��� ���
		System.out.println("���� : " + area);
		System.out.println("�ѷ� : " + length);
		
		System.out.printf("%d & %d\n", area, length);
	}
}