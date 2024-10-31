/*================================================
���� �迭 ����
- �迭�� ����� �ʱ�ȭ
===================================================*/

// ������ ���� ���α׷��� �����Ѵ�.
// ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ���� �� ���� �Է�(���� ����) : 20 15
// ������ �Է�(+ - * /) : '-'
 // 20 - 15 = 5
 
 import java.util.*;
 import java.io.*;
 
 class Aclass
 {
	 protected int x, y;
	 protected char op;
	 
	 Aclass()
	 {
		 
	 }
	 
	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op,y,result);
	}
	
 }

// Aclass �� ��� �޴� Ŭ������ ����
class Bclass extends Aclass
{
	
/*
	protected int x, y;
	protected char op;
	 	 
	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op,y,result);
	}
*/

	private double result;
	
	boolean input() throws IOException
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.print("���� �� ���� �Է�(���� ����) : ");
		 String temp = br.readLine();
//		 �� str.split("������");
//		 �� str.split("\\s");         //-- ������ �� ����
		 String[] nums=temp.split("\\s");
		 
		 if(nums.length!=2)
			 return false;
		 
		 x=Integer.parseInt(nums[0]);
		 y=Integer.parseInt(nums[1]);
		 
		 System.out.print("������ �Է� : ");
		 op = (char)System.in.read();
		 
		  if(op!='+' && op!='-' && op!='*' && op!='/')
			 return false;
		 
		 return true;

	}
	 
	double calc()
	{
		switch(op)
		{
			case '+': result = x+y; break;
			case '-': result = x-y; break;
			case '*': result = x*y; break;
			case '/': result = (double)x/y; break;			
		}
		
		return result;
	}
}	

public class Test117

{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();
		
		if(!ob.input())
		{
			System.out.println("Error");
			return;
		}
		
		double result = ob.calc();
		ob.write(result);
	}
}