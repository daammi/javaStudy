/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- switch ����
===================================================*/

// ����ڷκ��� ������ ������ ���� �Է¹޾�
// �ش� ���� ������ ��¥�� Ȯ���� �� �ִ� ���α׷��� �����Ѵ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test043
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int year, month, day;
		
		System.out.print("������ ������ �Է��ϼ��� : ");
		year = Integer.parseInt(br.readLine());
		System.out.print("������ ���� �Է��ϼ��� : ");
		month = Integer.parseInt(br.readLine());
		
		// ��� ��
		
		/*
		if(year % 2 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			switch(month)
				{
					case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31 break;
					case 4: case 6: case 9: case 11: day = 30; break;
					default: day = 29;
				}		
		}
		else
		{
			switch(month)
				{
					case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31 break;
					case 4: case 6: case 9: case 11: day = 30; break;
					default: day = 28;
				}		
		}
		
		System.out.printf(">> %d�� %d���� %d�ϱ��� �ֽ��ϴ�.\n", year,month,day);
		
		*/
		
		// ��� ��
		
		switch(month)
		{
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31; break;
			case 4: case 6: case 9: case 11: day = 30; break;
			default: 
				if(year % 2 == 0 && year % 100 != 0 || year % 400 == 0)
				{ day = 29; }
				else
				{ day = 28; }
		}
		
		System.out.printf(">> %d�� %d���� %d�ϱ��� �ֽ��ϴ�.\n", year,month,day);
				
	}
}