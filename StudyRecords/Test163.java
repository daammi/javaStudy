
import java.util.*;

public class Test163
{
	private static final String[] colors
		= {"����","���","�ʷ�","�Ķ�","����","����",};
	
	public static void main(String[] args)
	{
//		Queue �ڷᱸ�� ����
//		Queue �������̽� ����� �ν��Ͻ��� �����ϱ� ���ؼ���
//		new �����ڸ� �̿��Ͽ� Queue �������̽��� implements ��
//		���� Ŭ������ �����ڸ� ȣ���ؾ� �Ѵ�.
		Queue<String> qu = new LinkedList<String>();
		
		for(String str : colors)
			qu.offer(str);
			
		System.out.println(qu);
			
		while(qu.peek()!=null)
		{
			System.out.println(qu.poll());
		}
		

	}
}
