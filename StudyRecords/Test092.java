/*==================== 
■■■ 배열 ■■■
- 다차원 배열(배열의 배열)
======================*/

public class Test092
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		
/*
		for(int i=0;i<5;i++)
		{
			for(int n=1,j=i ;n<=5 ;n++)
			{
				arr[i][j]=n;
				j++; 
				j%=5;
			}
		}
*/
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                arr[i][j] = (5 - i + j) % 5 + 1;
        }

		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr[i].length;j++)
				System.out.printf("%3d", arr[i][j]);
			System.out.println();
		}
	 	
	}
}

