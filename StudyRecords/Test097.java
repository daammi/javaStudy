/*==================== 
���� �迭 ����
- ������ �迭(�迭�� �迭)
======================*/

// ����)
// ������ �迭�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// A
// C B
// D E F
// J I H G
// K L M N O

public class Test097
{
   public static void main(String[] args)
   {
//	    �ֿ� ���� ���� �� �ʱ�ȭ
        char[][] arr = new char[5][5];
        int n = 0;

//		�迭�� ���� ��� ���� �ڵ�
//		�̶�, Test096.java�� �ٸ� ���� 1��� 3�� �� i�� Ȧ���϶� ���� �ڿ��� ���� ���ٴ� ���̴�.
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)					//-- i�� ¦���϶� �ùٸ��� ��´�.
			{
                for(int j=0;j<i+1;j++)
                {
                    arr[i][j]=(char)(65+n++);
                }
            }
            else                        //-- i�� Ȧ���϶� �ڿ������� ��´�.
            {
                for(int j=0;j<i+1;j++)
                {
                    arr[i][i-j]=(char)(65+n++);
                }
            }
        }
		
//      ��� ��� (by ���� for��)
		for (char[] i : arr)
		{	
			for (char j : i)
				System.out.printf("%2c", j);
			System.out.println();
		}
    } 
}

// ������

/*
	 A
	 C B
	 D E F
	 J I H G
	 K L M N O
	����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/