/*==================== 
���� �迭 ����
- ������ �迭(�迭�� �迭)
======================*/

public class Test090
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		int n=1;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{arr[i][j]=n; n++;}
		}
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr[i].length;j++)
				System.out.printf("%3d", arr[i][j]);
			System.out.println();
		}
	}
}