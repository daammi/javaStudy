/* ======================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=========================================================*/

import java.util.Stack;

public class Test161
{
	private static final String[] colors
		= {"����","���","�ʷ�","�Ķ�","����","����",};
	
//	������(����� ���� ������)
	public Test161()
	{
//		st ��� Stack �ڷᱸ�� ����
//		���׸��� Ȱ���Ͽ� �ڷᱸ���� ���� ������ ǥ�� �� <String>
		 Stack<String> st = new Stack<String>();
		
//		st ��� Stack �ڷᱸ���� ������ ���
//		st = colors; (X)
		for(String str : colors)
			st.add(str); // == st.push(str)
	
		st.push("����");
		
//		��� �޼ҵ�
		popStack(st);
		
	}

//      ��� �޼ҵ�
		private void popStack(Stack st)
		{
			while(!st.isEmpty())
			{
				System.out.println("pop : " + st.pop());
			}
		}
	
	
	public static void main(String[] args)
	{
		new Test161();		// �����ڸ� ȣ��!!

	}
}