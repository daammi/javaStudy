/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- if ��
- if ~ else �� �ǽ�
===================================================*/

// ����ڷκ��� ������ ���� �� ���� �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

import java.io.*;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		
		// ��� ��
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2 ,num3, temp;
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num3 = Integer.parseInt(br.readLine());
		
		if(num2 >= num3){
			temp = num3;
			num3 = num2;
			num2 = temp;
		}
		if(num1 >= num2){
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		if(num2 >= num3){
			temp = num3;
			num3 = num2;
			num2 = temp;
		}
		
		System.out.printf("\n>> ���� ��� : %d ~ %d ~  %d\n", num1, num2, num3);
		*/
		
		
		// ��� ��
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2 ,num3;
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num3 = Integer.parseInt(br.readLine());
		
		if(num2 >= num3){
		num3 = num3^num2;
		num2 = num2^num3;
		num3 = num3^num2;
		}
		
		if(num1 >= num2){
		num1 = num1^num2;
		num2 = num2^num1;
		num1 = num1^num2;
		}
		
		if(num2 >= num3){
		num3 = num3^num2;
		num2 = num2^num3;
		num3 = num3^num2;
	    }		
			
				
		System.out.printf("\n>> ���� ��� : %d ~ %d ~ %d\n", num1, num2, num3);
	}
}




