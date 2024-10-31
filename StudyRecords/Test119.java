/*================================================
���� Ŭ���� ��� ����
- �߻� Ŭ���� (abstract)
==================================================*/

/*
�� �߻� Ŭ������

   ���� �ְ� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������
   ���� Ŭ����(�ڽ� Ŭ����)���� �������̵� �� ������ ����Ǵ� �޼ҵ忡 ����
   �޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����.
   
�� ���� �� ����

   [��������������] abstract class Ŭ������
   {
	   [��������������] abstract �ڷ��� �޼ҵ��([�Ű�����], ...)
   }
   
�� Ư¡

   Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 ������ ��
   �� Ŭ������ Ŭ���� �տ� abstract Ű���带 �ٿ�
   �߻� Ŭ������ ����ؾ� �ϸ�, �߻� Ŭ������ ������ ��쿡��
   �ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ �� ����.
   �߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ����������
   ��ü�� ������ �� ���� ���̴�.
   
   ��, �߻� Ŭ������ ���������� ������ �� ���� ������
   ����� ���ؼ��� �����ϸ�,
   �߻� Ŭ������ ��ӹ��� ���� Ŭ����������
   �ݵ�� �߻� �޼ҵ带 �������̵� �ؾ��Ѵ�.
   
�� abstract Ű�����
   Ŭ������ �޼ҵ忡���� ����� �� ������
   ��� ������ ���� ���������� ����� �� ����.
*/

abstract class SuperSortInt119
{
	private int[] value;
	
	protected void sort(int[] value)
	{
		this.value  = value;
		sorting();
	}
	
	protected abstract void sorting();
	
	protected int dataLength()
	{
		return value.length;	
	}
	
	// final Ű����� ����
	// �� Ŭ������ ��ӹ޴� Ŭ��������
	// �� �޼ҵ带 ������ �� �� ����.
	protected final int compare(int i, int j)
	{
		int x=value[i];
		int y=value[j];
		
		if(x==y)
			return 0;
		else if(x>y)
			return 1;
		else
			return -1;
	}
	
	// final Ű����� ����
	// �� Ŭ������ ��ӹ޴� Ŭ��������
	// �� �޼ҵ带 ������ �� �� ����.	
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
	
}

// �߻�Ŭ������ extends �ϴ� ���� �߻�ȭ �Ǿ����!
// �̶�, Override �� ���Ͽ� ��üȭ �Ѵ�.
public class Test119  extends SuperSortInt119
{
	static int[] data = {7,10,3,28,7};
	
	Test119()
	{
		sort(data);
	} 
	 
	@Override
	public void sorting(){
	for(int i=0;i<dataLength()-1;i++){
		for(int j=i+1;j<dataLength();j++){
			if(compare(i,j)==1)
				swap(i,j);
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		
		Test119 ob = new Test119();
		
		for(int i : data)
			System.out.printf("%3d",i);
		
		System.out.println();
	}
}