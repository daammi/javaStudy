/* ================================================
���� ������(Operator) ����
- ���� ������(���� ������)
=================================================== 

����ڷκ��� ������ ������ �Է¹޾� �Է¹��� ������ �������, ��������, 0���� �����Ͽ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�. ��, �Է� �����ʹ� BufferedReader�� Ȱ���Ͽ� ó���ϰ�,
���� ������(���� ������)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.

���� ��)
������ ���� �Է� : -42
-42 �� ����
����Ϸ��� �ƹ� Ű�� ��������.

������ ���� �Է� : 1024
1024 �� ���
����Ϸ��� �ƹ� Ű�� ��������.

������ ���� �Է� : 0
0 �� ��
����Ϸ��� �ƹ� Ű�� ��������.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test027
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		String strResult;
		
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		
		/*
		
		n �� 0���� ũ�� �� ture   �� n �� ���
		                �� false  �� n �� 0 ���� �۴�   �� true   �� n �� ����
						                                �� false  �� n �� ��
		(n > 0) ? ("���") : (�ٽ� Ȯ��);
		                     ------------
							 (n < 0) ? ("����") : ("��");
		(n > 0) ? ("���") : ((n < 0) ? ("����") : ("��"));
		
		strResult = (n > 0) ? ("���") : ((n < 0) ? ("����") : ("��"));
		
		*/
		
		
		strResult = (n > 0) ? ("���") : ((n < 0) ? ("����") : ("��"));
		// 567
		// strResult (n > 0) ? ("���") : ((n < 0) ? ("����") : ("��"));
		// strResult (567 > 0) ? ("���") : ((n < 0) ? ("����") : ("��"));
		// strResult (true) ? ("���") : ((n < 0) ? ("����") : ("��"));
		// strResult "���";
		
		// -5
		// strResult (n > 0) ? ("���") : ((n < 0) ? ("����") : ("��"));
		// strResult (-5 > 0) ? ("���") : ((n < 0) ? ("����") : ("��"));
		// strResult (false > 0) ? ("���") : ((n < 0) ? ("����") : ("��"));
		// strResult ((n < 0) ? ("����") : ("��"));
		// strResult ((-5 < 0) ? ("����") : ("��"));
		// strResult ((true) ? ("����") : ("��"));
		// strResult "����";
		
		strResult = (n > 0) ? ("���") : ((n < 0) ? ("����") : ("��"));
		
		System.out.printf("%d �� %s\n", n, strResult);
		
		
	
	}
}