/*==================== 
■■■ 배열 ■■■
- 다차원 배열(배열의 배열)
======================*/

public class Test095
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
/*
		for(int i=0; i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j]=n;
				arr[i][4]+=n;
				n++;
			}

		}
		
		for(int i=0; i<=4;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[4][j]+=arr[j][i];
			}
		}
*/
		for(int i=0,n=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr[i].length-1;j++)
			{
				arr[i][j]=++n;
				arr[i][arr[i].length-1]+=n;
				arr[arr.length-1][j]+=arr[i][j];
				arr[arr.length-1][arr[i].length-1]+=n;
			}				
		}
		
		for(int[] i : arr)
		{
			for(int j : i)
				System.out.printf("%4d", j);
			System.out.println();
		}
	}
}