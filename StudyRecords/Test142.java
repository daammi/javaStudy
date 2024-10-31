/*================================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- String Ŭ����
==================================================

����ڷκ��� ��Ģ��������� �Է¹޾�
�ش� ������ ó������� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)

������� �Է�(num1+num2) : 5+3
>> 5 + 3 = 8
����Ϸ��� �ƹ� Ű�� ��������...

������� �Է�(num1+num2) : 5-3  ���ڿ��� �Է¹ް�
>> 5 - 3 = 2
����Ϸ��� �ƹ� Ű�� ��������...

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test142
{
	
	public static void main(String[] args) throws IOException
	{
		String num;
		String temp1, temp2;
		int n1, n2;
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������� �Է�(num1+num2) : ");
		num = br.readLine();
		
		String[] arr = {"+", "-", "*", "/"};
		
		for(String i : arr){
			
			int pos = num.indexOf(i);
			if(pos>-1)
			{
				n1 = Integer.parseInt(num.substring(0,pos));
				n2 = Integer.parseInt(num.substring(pos+1));
				
				int result = 0;
				char op = num.charAt(pos);
				switch(op)
				{
					case '+': result=n1+n2; break;
					case '-': result=n1-n2; break;
					case '*': result=n1*n2; break;
					case '/': result=n1/n2; break;					
				}
				
				String s = String.format("%d %c %d = %d", n1,op,n2,result);
				System.out.println(s);
				break;
					
			}
		
		}
		
	}
}