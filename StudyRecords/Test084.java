/*==================== 
���� �迭 ����
- �迭�� ����� �ʱ�ȭ
======================*/

// ������ �������� ����ִ� �迭
// �� �迭�� ���� �����͵� ��
// ¦���� ��Ҹ� ��� ����ϰ�, 3�� ����� ��Ҹ� ��� ����ϴ�
// ���α׷��� �����Ѵ�.

public class Test084
{
	public static void main(String[] args)
	{
		int[] arr = {4,7,9,1,3,2,5,6,8};
		
		System.out.println("�迭��� ��ü ���");		
		for(int i=0;i<arr.length;i++)
			System.out.printf("%2d", arr[i]);
		
		System.out.println();
		
		System.out.println("¦�� ������ ���");		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
				System.out.printf("%2d", arr[i]);
		}
		
		System.out.println();
		
		System.out.println("3�� ��� ������ ���");		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%3==0)
				System.out.printf("%2d", arr[i]);
		}
		
	    System.out.println();
	}
}