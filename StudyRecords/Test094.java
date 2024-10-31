/*==================== 
■■■ 배열 ■■■
- 다차원 배열(배열의 배열)
======================*/

public class Test094
{
	public static void main(String[] args)
	{
		char[][] arr = new char[5][5];
		int n =65;
		
		for(int i=0; i<5;i++)
		{
			for(int j=4;j>=0;j--)
			{
				arr[j][i]=(char)n;
				n++;
			}
		}
		for(char[] i : arr)
		{
			for(char j : i)
				System.out.printf("%2c", j);
			System.out.println();
		}
	}
}