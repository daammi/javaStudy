/* ================================================
���� ���� �帧�� ��Ʈ��(���) ����
- return ����
=================================================== 

�� return Ű���尡 ���ϴ� �ǹ�
1. ���� ��ȯ
2. �޼ҵ� ����

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n,s;
		
		//System.out.print("������ ���� �Է� : ");
		System.out.print("������ ���� �Է�(10 �̻�) : ");
		n = Integer.parseInt(br.readLine());
		
		if (n < 10)
		{
			System.out.println("10 �̻��� ������ �Է��ؾ� �մϴ�.");
			return;			// return xxx;
			// rutern �� �� ��� �޼ҵ� ���� �� return ���� �����ϰ� �ִ� �޼ҵ�
			// �� main() �޼ҵ� �� ���α׷� ����
		}		
		
		s = 0;
		for (int i=1; i<=n; i++)
		{
			s += i;
		}
		System.out.println("���� ��� : " + s);
		
		
	}
}

//���� ���

/*
������ ���� �Է�(10 �̻�) : 100
���� ��� : 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�(10 �̻�) : 5
10 �̻��� ������ �Է��ؾ� �մϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

06. �޼ҵ��� ��� ȣ��

�޼ҵ� ���� ����ο��� �ڱ� �ڽ��� �ٽ� ȣ���Ͽ� �ݺ��Ѵ�.


 //  ��
 public static void main(String[] args)
 {
	showHi(3); 
 }

public static void showHi(int cnt) ---> ���� �ڵ� ! ���ĺ���
 {	
	System.out.println("Hi~ "); //  ��¹�

	showHi(cnt--);				//  1 ����

	if (cnt == 1)				// ���ǽ� 
		return;
}
�� �ڵ�� �������� �������ǳ�, ��Ÿ�ӿ��� ���� ������ Hi~�� ����Ѵ�.

������ �ľ��ϰ� �����غ���.

// ��
public static void showHi(int cnt)		
{	
	System.out.println("Hi~ ");		//  ��¹�
	if (cnt == 1)					// ���ǽ�
		return;
	showHi(--cnt);					
}
������� �ֻ�ܿ��� 1ȸ ��������Ƿ� ��� 1�� �����ϰ� �ٽ� �����ؾ� ���ѷ����� ��ĥ �� �ִ�. 

�Լ��� ���ϴܿ� ��ġ�ؾ��Ѵ�. �� �׷��� �ڿ� �ۼ��� �ڵ�� �� ���� ������� �ʴ´�.

�����Ƚ��� 1 �ٷ� ���ҽ��Ѽ� ���ڷ� �Ѱ��.