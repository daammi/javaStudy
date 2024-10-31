/*==================== 
■■■ 배열 ■■■
- 다차원 배열(배열의 배열)
======================*/

// 1  8  9  16  17
// 2  7 10  15  18
// 3  6 11  14  19
// 4  5 12  13  20    


public class Test093
{
	public static void main(String[] args)
	{
		int[][] arr = new int[4][5];
		int n =1;
		
		for(int i=0; i<5;i++)
		{
			if(i%2==0){
				for(int j=0;j<4;j++)
				{
					arr[j][i]=n;
					n++; 
				}
			}
			else
			{
				for(int j=3;j>=0;j--)
				{
					arr[j][i]=n;
					n++;
				}
			}
		}
		for(int[] i : arr)
		{
			for(int j : i)
				System.out.printf("%3d", j);
			System.out.println();
		}
	}
}
