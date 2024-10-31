/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문(while문) 실습
===================================================*/

public class Test048
{
	public static void main(String[] args)
	{
		// 방법 ①
		
		/*
		int i=0, sum=0;
		
		while(i<100)
		{
			i++;
				
			sum +=i;
			
			switch(i)
			{
				case 10: System.out.printf("1 ~ %d 까지의 합 : %d\n", i, sum); break;
				case 20: System.out.printf("1 ~ %d 까지의 합 : %d\n", i, sum); break;
				case 30: System.out.printf("1 ~ %d 까지의 합 : %d\n", i, sum); break;
				case 40: System.out.printf("1 ~ %d 까지의 합 : %d\n", i, sum); break;
				case 50: System.out.printf("1 ~ %d 까지의 합 : %d\n", i, sum); break;
				case 60: System.out.printf("1 ~ %d 까지의 합 : %d\n", i, sum); break;
				case 70: System.out.printf("1 ~ %d 까지의 합 : %d\n", i, sum); break;
				case 80: System.out.printf("1 ~ %d 까지의 합 : %d\n", i, sum); break;
				case 90: System.out.printf("1 ~ %d 까지의 합 : %d\n", i, sum); break;
				case 100: System.out.printf("1 ~ %d 까지의 합 : %d\n", i, sum); break;	
				
			}
			
		}
		*/
		
		// 방법 ②
		
		int i=0, sum=0;
		
		while(i++<100)
		{
			
			sum += i;
			
			if(i%10==0)
				System.out.printf("1 ~ %d 까지의 합 : %d\n", i, sum);
		}
		
		
	}
}