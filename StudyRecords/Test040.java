/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- switch ����
===================================================*/

/*
�� ���� ���ù��̶� �ϸ�, switch �� ������ ���� ���� ����
   ���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.
   
�� ���� �� ����
   switch (����)
   {
		case ���1: ����1; [break;]
		case ���2: case ���3: ����2; [break;]
				:
		[default : ���� n+1; [break;]]
   }
   
   switch ���� �����ġ� �� case�� ������� ��
   byte, short, int, long ���̾�� �Ѵ�.
   + char
   + String
   
   case �� �ڿ� ��break;�� �� ���� ������ ���
   ���� case ���� ������ ����ؼ� �����ϰ� �ȴ�.		 (�� �⺻ ��)
   ��break;�� �� ������ ���
   �ش� �������� ������ ���� �� switch ���� ���� ������. (�� �Ϲ� ��)
*/

import java.io.*;

public class Test040
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;				// �̸�
		int kor, eng, mat, tot;		// ��������, ��������, ��������, ����
		int avg;					// ���
		
		char grade;					// ���
		
		System.out.print("�̸� �Է� : ");
		name = br.readLine();
		
		System.out.print("�������� �Է� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : ");
		mat = Integer.parseInt(br.readLine());
		
		tot = kor + eng + mat;
		avg = tot / 3;
		
		switch(avg/10)
		{
			case 10: case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			
			default: grade = 'F'; break;
		}
		
		System.out.printf("%s���� ����ǥ�Դϴ�.\n���� : %d, ��� : %d, ���� : %c \n", name, tot, avg, grade);
		
	}
}