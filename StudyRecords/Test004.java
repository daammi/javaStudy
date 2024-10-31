/*
 ★ 자바의 개요 및 특징 ★
 → 변수와 자료형
 → 키워드 및 식별자
*/
public class Test004
{
	public static void main(String[] args)
	{
		double height = 173;
		int age= 26;
		char grade = 'A';
		String name = "김정현";
		
		// String name = "김세진";		
		// 스코프 영역 안에서 변수명은 식별자!!!
		
		// String #name = "김인직";
		// $, _ 를 제외한 다른 특수문자는 변수의 이름으로 활용할 수 없다.
		// 그나마 사용 가능한 이들 특수문자도 함부로 사용하는 것은 고려해야 한다.
		// (일반적으로 규칙을 갖고 사용할 수 있도록 처리)
		
		// long tel = "01023455123"
		// 숫자열의 형태로 쓸 수 있는 것 처럼 보여도
		// 앞에 0이 오면 절대로 숫자형으로 쓸 수 없다.
		// 결론적으로 문자열로 저장해야만 한다.
		String tel = "01023498680";
		
		// String 주소 = "서울시 금천구"
		// 문법적으로 한글 단어를 변수명으로 사용할 수 있지만
		// 실무적인 측면에서 접근한다면 절대로 한글 단어를
		// 변수명으로 사용해서는 안된다.
		String address = "서울시 금천구";
		
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("adress: "+address);
		System.out.println("tel: "+tel);
		System.out.println("grade: "+grade);
	}
}