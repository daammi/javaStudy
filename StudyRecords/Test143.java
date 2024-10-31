/*================================================
■■■ 자바의 주요(중요) 클래스 ■■■
- StringBuffer 클래스
==================================================*/

/*
◎ StringBuffer 클래스

   문자열을 처리하는 클래스로 String 클래스와의 차이점은
   String 클래스는 내부 문자열 데이터의 수정이 불가능하지만
   StringBuffer 클래스는 문자열을 사용할 떄
   내부 문자열을 실행 단계에서 변경할 수 있다.
   
   즉, StringBuffer 객체는 가변적인 길이를 가지므로
   객체를 생성하는 시점에서 미리 그 크기나 값을 지정하거나
   실행 시점에 버퍼의 크기를 바꿀 수 있는 기능을 제공한다.
   
   또한, JDK 1.5 이후 부터는
   문자열을 처리하는 StringBuilder 라는 클래스도 제공한다.
   StringBuilder 클래스의 기능은 StringBuffer 클래스와 동일하지만
   가장 큰 차이점은 multi-thread unsafe 라는 점이다.
   즉, Syncronization 이 없기 때문에
   StringBuffer 보다 빠르며 동시성(동기화) 문제가 없다면
   StringBuilder 를 사용하는 것이 성능을 향상시킬 수 있다.
*/


public class Test143
{
	public static void main(String[] args)
	{
		String str1 = new String("seoul");
		String str2 = new String("seoul");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
//		false
//		true
		
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");
//		String 클래스 외에는 모든 문자열 관련 클래스가 
//	    new 연산자를 통해서만 메모리 할당 가능.
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));		
//		false
//		false

		System.out.println("----------------------------------------");
		
		System.out.println(sb1);					// StringBuffer 타입
		System.out.println(sb1.toString());			// String 타입
		
		System.out.println(sb1.toString().equals(sb2.toString()));	
		
		System.out.println("----------------------------------------");
		
		StringBuffer sb3 = new StringBuffer();		// 기본 생성자 호출
													// 기본적으로 생성되는 버퍼의 크기는 『16』
		
//		capacity();
		System.out.println("버퍼 크기 : " + sb3.capacity());
		
		String name = "박";
		name += "세";
		name += "진";
		name += "짱";
		
		System.out.println(name);
		
		sb3.append("seoul");
		sb3.append("korea");
		sb3.append("우리나라");		
		sb3.append("대한민국");
		
		System.out.println(sb3);
		System.out.println(sb3.toString());
		System.out.println("버퍼 크기 : " + sb3.capacity());
		
		String tmp1 = "java and oracle";
		System.out.println(tmp1.toUpperCase());		  // String 타입의 Method
		
		String tmp2 = "JAVA AND ORACLE";
		System.out.println(tmp2.toLowerCase());       // String 타입의 Method
		
		
//		◎ 대상 문자열 중 seoul 앞에 "한국" 이라는 문자열 추가
		sb3.insert(0, "한국");
		System.out.println(sb3);

//		◎ 대상 문자열 중 korea 뒤에 "사랑" 이라는 문자열 추가
		sb3.insert(sb3.indexOf("korea")+"korea".length(), "사랑");
		System.out.println(sb3);		
	
//		◎ 대상 문자열 중 "우리나라" 문자열 삭제	
//		sb3.delete(14,18);
//		System.out.println(sb3);
		
//		◎ 대상 문자열 중 "우리나라" 문자열 삭제	
		sb3.delete(sb3.indexOf("우리나라"),sb3.indexOf("우리나라")+"우리나라".length());
		System.out.println(sb3);
		
//		◎ 대상 문자열(sb3) 에서
//		   "korea" 이후 모든 문자열 삭제(korea 포함)
		sb3.delete(sb3.indexOf("korea"),sb3.length() );
		System.out.println(sb3);
	
//		버퍼 크기 다시 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());
		
//		버퍼 크기 조절
//		→ 현재 문자열을 담아둘 수 있는 버퍼의 크기로...
//		trimToSize();
		sb3.trimToSize();
		
//		버퍼 크기 조절 이후 버퍼 크기 다시 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());		
	}
}