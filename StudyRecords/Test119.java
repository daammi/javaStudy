/*================================================
■■■ 클래스 고급 ■■■
- 추상 클래스 (abstract)
==================================================*/

/*
○ 추상 클래스는

   선언만 있고 정의가 없는 하나 이상의 메소드(추상 메소드)를 갖는 클래스로
   하위 클래스(자식 클래스)에서 오버라이딩 할 것으로 예상되는 메소드에 대해
   메모리 낭비 없이 미리 호출 계획을 세워두기 위해 만든다.
   
○ 형식 및 구조

   [접근제어지시자] abstract class 클래스명
   {
	   [접근제어지시자] abstract 자료형 메소드명([매개변수], ...)
   }
   
○ 특징

   클래스가 적어도 하나 이상의 추상 메소드를 포함할 때
   그 클래스는 클래스 앞에 abstract 키워드를 붙여
   추상 클래스로 명시해야 하며, 추상 클래스로 선언한 경우에는
   불완전한 형태의 클래스이므로 객체를 생성할 수 없다.
   추상 메소드가 존재하지 않는 추상 클래스마저도
   객체를 생성할 수 없는 것이다.
   
   즉, 추상 클래스는 독립적으로 존재할 수 없기 때문에
   상속을 위해서만 존재하며,
   추상 클래스를 상속받은 하위 클래스에서는
   반드시 추상 메소드를 오버라이딩 해야한다.
   
※ abstract 키워드는
   클래스와 메소드에서만 사용할 수 있으며
   멤버 변수나 로컬 변수에서는 사용할 수 없다.
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
	
	// final 키워드로 인해
	// 이 클래스를 상속받는 클래스에서
	// 이 메소드를 재정의 할 수 없다.
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
	
	// final 키워드로 인해
	// 이 클래스를 상속받는 클래스에서
	// 이 메소드를 재정의 할 수 없다.	
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
	
}

// 추상클래스를 extends 하는 순간 추상화 되어버렸!
// 이때, Override 를 통하여 구체화 한다.
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