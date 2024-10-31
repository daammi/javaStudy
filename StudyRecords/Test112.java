/*====================================
■■■ 정렬(Sort) 알고리즘 ■■■
======================================*/

/*

○ 정렬
   : 데이터를 특정한 규칙에 맞게 순서대로 나열(오름차순, 내림차순)
   
○ 정렬의 목적
   : 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
     → 보기 좋게, 찾아보기 쉽게 (검색하기 위함)
	 
○ 정렬의 종류
   : 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬, ...

*/

// 버블 정렬(Bubble Sort)


public class Test112
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j+1]^a[j];
					a[j]=a[j]^a[j+1];
				}	
			}
		}
		
		for(int i=0;i<5;i++)
			System.out.printf("%3d", a[i]);
		System.out.println();
	}
}