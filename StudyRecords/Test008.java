// �� ������ �ڷ��� ��
// �� ������ �ڷ��� �ǽ� �� �׽�Ʈ : char

public class Test008
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		char ch1, ch2, ch3;
		String ch4;
		int num;
				
		// ���� �� ó��
		ch1 = 'A';
		ch2 = '\n';
		ch3 = '��';
		ch4 = "1234";
		   
		num = (int)ch1;
		// ����� �� ��ȯ(���� �� ��ȯ)
		// num = ch1; -=> �ڵ� �� ��ȯ
		
		// ��� ���
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		System.out.println("ch3 : "+ch3);
		System.out.println("ch4 : "+ch4);
		
		System.out.println("num : "+num);
		
		System.out.printf("num : %c �׸��� num : %d\n", num, num);
		// num : A �׸��� num : 65


	}
}