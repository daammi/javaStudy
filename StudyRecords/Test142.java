/*================================================
■■■ 자바의 주요(중요) 클래스 ■■■
- String 클래스
==================================================

사용자로부터 사칙연산수식을 입력받아
해당 연산의 처리결과를 출력하는 프로그램을 구현한다.

실행 예)

연산수식 입력(num1+num2) : 5+3
>> 5 + 3 = 8
계속하려면 아무 키나 누르세요...

연산수식 입력(num1+num2) : 5-3  문자열로 입력받게
>> 5 - 3 = 2
계속하려면 아무 키나 누르세요...

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
		
		System.out.print("연산수식 입력(num1+num2) : ");
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