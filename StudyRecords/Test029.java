/* ================================================
���� ������(Operator) ����
- ���� ������(���� ������)
- �ΰ� �̻��� �����̸� '�� ������'
=================================================== */
/* 
 ������ �Ǻ� ����
 ������ 4�� ����̸鼭 
 100�� ����� �ƴϰų� 
 400�� ����̸� ����!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year;
		String strResult;
			
		System.out.print("������ ������ �Է��ϼ��� : ");
		year = Integer.parseInt(br.readLine());
		
		// (������ 4�� ���  &&  ������ 100�� ��� �ƴ�)  ||  ������ 400�� ���
		strResult = ((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0)? "����" : "���";
		
		//bool = (year % 4 == 0) ? (year % 100 == 0? (year % 400 == 0? true : false) : true): false;
		
		System.out.printf("%d�� �� %s\n",year,strResult);
		
	}
}

// ������

/*
������ ������ �Է��ϼ��� : 2024
2024�� �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
