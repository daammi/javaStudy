/*==================== 
���� �迭 ����
- �迭�� ����� �ʱ�ȭ
======================*/

// char �ڷ����� �迭�� �����
// �� �迭�� �� �濡 ���ĺ� �빮�ڸ� ä���
// ä���� �� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�.
// ��, ä��� ������ ����ϴ� ������ ���� �и��Ͽ� ó���� �� �ֵ��� �Ѵ�.

public class Test085
{
	public static void main(String[] args)
	{
		char[] arr = new char[26];
		
		for(int i=0; i<arr.length;i++)
			arr[i] = (char)(65+i);
		
		for(int i=0; i<arr.length;i++)
			System.out.printf("%c ", arr[i]);
		
		System.out.println();
	}
}