/* ========================================
  ■ 객체 직렬화 (Object Serialization) ■
==========================================*/

/*
○ 객체 직렬화(Object Serialization)는

   메모리에 생성된 클래스 객체의 멤버 변수의 현재 상태를
   그대로 보존해서 파일에 저장하거나
   네트워크를 통해 전달할 수 있는 기능으로
   멤버 변수의 값을 보존한다거나
   다른 네트워크에 있는 호스트에 값을 보낼 경우 사용하게 된다.

   즉, 객체 직렬화는 내용물을 바이트 단위로 변환하여
   파일 또는 네트워크를 통해 송수신(스트림)이 가능하게
   만들어주는 것으로 이 때, 객체란 멤버 변수의 메모리만으로 구성된 것을 말한다.

   따라서, 메소드와 생성자는 객체 직렬화의 대상에서 제외된다.
	  

○ 객체 직렬화의 장점

   객체 자체의 내용을 입출력 형식에 구애받지 않고
   객체를 파일에 저장함으로써 영속성을 제공할 수 있으며
   객체 자체를 네트워크를 통해 손쉽게 교환(송수신)할 수 있게 된다.
                                      ￣￣ → (전송 및 수신)

   객체 직렬화는 자바 1.1 이후에 도입되었는데
   그 이유는 RMI 와 Bean 때문이었다.

   RMI 는 원래 객체 통신을 지원해야 하기 때문에
   객체가 그대로(특정 상태를 유지한 채로) 이동할 수 있어야 한다.
   따라서 이를 지원하기 위해서는 객체 직렬화가 필수적이었다.

   또한, Bean 은 설계 시 상태에 대한 정보를 저장할 때
   이 객체 직렬화를 사용하면 편하게 객체 상태를 저장할 수 있다.

   ※ RMI(Remote Method Invocation)
      서로 다른 가상 기계장치에 존재하는 함수를
	  호출하고 실행하는 기능을 담당한다.
	  서로 다른 통신 구조에 위치한 각각의 원격 객체들 간의
	  통신 구조를 지원하는 개념으로 이해하면 좋겠다.

	  
   ※ Bean(빈, 자바 빈)
      C/S(Client, Server) 구조적 모델에서 서버측 구조에 해당하며,
	  재사용 가능한 소프트웨어 개체를 만들 수 있게 하는 컴포넌트 기술.
	  작성된 개체의 공유가 가능하며 프로젝트에 쉽게 포함시킬 수 있도록 한다.
	  클라이언트에게 빈이라는 프로그램 컴포넌트를 분배하는 방식으로 처리.

----------------------------------------------------------
implements 하기만 하면
자바가 객체 직렬화가 필요한 클래스라는 사실을 알 수 있게 된다.
-------------↓-------------------------------------------
	
○ Serializable 인터페이스
 
   객체 직렬화를 하기 위해 먼저 객체 직렬화가 가능하도록
   java.io.Serializable 인터페이스를 구현해 주어야 한다.
   이 인터페이스는 객체 직렬화가 제공되어야 한다는 사실을
   JVM 에 알려주는 역할을 수행한다.
   또한, Serializable 인터페이스는
   다른 인터페이스와 달리 구현해야 할 메소드가 없기 때문에
   단지 선언만 해주면 된다.

   형식)
   ①
   public class 클래스명 implements Serializable
   {
	   ...
   }

   ②
   Serializable 인터페이스를 구현한 후
   ObjectInputStream 클래스와 ObjectOutputStream 클래스를 이용하여
   객체 단위로 입출력을 수행하게 된다.

   ※ 멤버 변수가 static 으로 선언된 경우(즉, 클래스 변수일 경우)
      객체 직렬화의 대상에서 제외된다.

○ Object Stream [객체 직렬화 해제 → Byte를 다시 객체로 변경...]

	[Byte 기반 스트림.]
   java.io.ObjectinputStream 클래스는 → (객체를 읽어들이는 Stream)
   java.io.ObjectOutputStream 클래스에 의해 → (객체를 내보내는 Stream)

   파일에 저장되어 있는 객체나 네트워크를 통해 전달된 객체의
   직렬화를 해제하는 기능을 제공한다.

   단, java.io.Serializable 인터페이스와
   java.io.Serializable 인터페이스를 지원해주는 객체에 대해서만
   사용이 가능하다.
 
                                 ↓(*영속성을 갖는)
   즉, Serializable 인터페이스와 Externalizable 인터페이스를
                                 ￣￣￣￣￣￣￣
   구현한 객체에서만 사용이 가능하다는 것이다.
   이 때, readObject() 메소드를 이용하여
   스트림으로부터 직렬화된 객체를 읽을 수 있으며
   이렇게 읽은 객체는 배열, 문자열 또는 각 객체 등   ▶ 다운 캐스팅 
   원래의 형(Type)으로 캐스팅 해 주어야 한다.        (Object → 원래의 형(String, arr...)

	=======================================================
   직렬화 되어 있거나, 영속성을 갖도록 구성되어 있지 않다면
   ObjectStream 사용할 수 없다.
   ========================================================
	

*/

// [개인 필기]====================================================================

/*
	
	[RMI] (PDA 사용을 대비하여 만들어진 자바의 기술이다.)------------------
	다른 실행 환경에 있는 객체의 메소드를
	로컬에서 생성한 객체의 메소드와 다름 없이
	호출할 수 있도록 하는 자바의 분산 객체 기술
	-----------------------------------------------------------------------
	exit(-1) → RMI를 염두에 두고 만들어진 메소드(매개변수 -1)
	A와 B 디바이스 사이에서
	제대로 종료됐음을 확인하기 위해서 return 값 -1 을 만들어 낸 것이다.
	A가 종료를 명령했을 때, B 디바이스에서 제대로 종료되었다는 의미로 -1 값을
	반환한다.
	-----------------------------------------------------------------------
	[Bean]
	속성만 존재하는 클래스를 Bean이라고 한다.
	-----------------------------------------------------------------------
	
	
	★컴포넌트 : 여러 개의 프로그램 함수들을 모아
	             하나의 특정한 기능을 수행할 수 있도록 구성한 작은 기능적 단위

	게임의 팩 하나하나가 컴포넌트...
	게임팩이 지켜야 하는 것들을 러프하게 만들어서(인터페이스와 비슷)
	어떤 게임이 됐든 간에 그 규격만 만족하면 게임기에서 동작할 수 있도록.
	→ Java bean
	기본 가이드라인 구현 → 부분적으로 하나씩 구현하여 
	                        기능들을 끼워 넣을 수 있게된다.

*/

// 멤버변수만이 객체 직렬화의 대상이다. (사과의 개수, 가진 돈 ...)

// 메모리에 있는 객체를 파일로 변환해서 전달하기 위해 거치는 과정을
// 객체 직렬화 라고 한다

// 클래스 저장이 객체 저장인가? Ⅹ! → 설계도 저장이다.

// 사과 장수라는 객체(인스턴스가 생성된 객체) → Memory 

// 네트워크 통해서 전송, 파일로 저장하려 할 때 어떻게 처리해야 하나?
// → 1과 0의 형태로 쪼개져서 저장.

// 직렬화 : Serialization ▶ 잘게 쪼개진 데이터에 각각에 번호를 붙이는 것이다.
// (직렬 병렬의 그 직렬이 아니라, 잘게 쪼갠 데이터에 번호를 붙인다는 의미이다.)

// 쪼개진 각각의 조각에 Serial Number(이름과 같은 용도의 번호)를 붙인다면
// 나중에 붙이는 과정에서 더욱 용이하게 객체를 복원할 수 있을 것이다.

// 전달하려는 데이터를 잘게 쪼개서 캡슐화하는 과정을 거쳐야 제대로 전달된다...
// ===============================================================================

// getProperty() → 속성(인코딩 방식)을 가져올 때!
// 아! 인코딩 방식 읽어올 때 사용했었다!!!!!!!!
// System.out.println("디폴트 캐릭터셋 : " + System.getProperty("file.encoding"));

import java.util.*;
import java.io.*;

public class Test183
{
	public static void main(String[] args) throws Exception
	{
/*		String appDir = System.getProperty("user.dir");
		
		System.out.println(appDir);
//		→ C:\JavaStudy
*/
/*
		Properties prop = System.getProperties();
		// Properties : Map → key, value
		
		String key, value;
		
		Iterator<?> it = prop.keySet().iterator();
		while(it.hasNext())
		{
			key = (String)it.next();
			value = prop.getProperty(key);
			System.out.println(key + " : " + value);
		}
*/

		String appDir = System.getProperty("user.dir");
		// 시스템 자원으로부터 사용중인 디렉터리 정보 얻어오기
	
		// 파일 객체 생성
		File f0 = new File(appDir, "\\data\\test.ser");		// 확장자 『*.sers』
		//-- appDir → C:\JavaStudy
		//-- appDir 위치를 기준으로 "\\data\\test.ser"의 파일을 구성하겠다는 의미.
		//-- 결과적으로 C:\JavaStudy\data\test.ser 구성
		
//		System.out.println(f0.getParentFile().exists());
		//-- false
		//-- test.ser 파일이 만들어진 디렉터리 경로가 구성되어 있지 않다.
		//   즉, data 폴더가 없다.
		
		// ※ C:\JavaStrudy 경로에 data 디렉터리 생성 후 다시 확인
		//-- true
		
		if(!f0.getParentFile().exists())
		{
			f0.getParentFile().mkdirs();
		}
		
		Hashtable<String, String> h1 = new Hashtable<String, String>();
		
		h1.put("2409123", "김민승");
		h1.put("2409225", "문제정");
		h1.put("2409250", "안예지");
		h1.put("2409120", "공찬민");		
		
		System.out.println(h1.get("2409250"));
		
		
		// 파일 전용 출력 스트림 생성(파일을 내보낼 수 있는 수도꼭지 열기)
		FileOutputStream fos = new FileOutputStream(f0);
		//-- 파일 전용 출력 스트림에
		//   f0 라는 파일 객체를 띄우겠다.
		// InputStreamReader isr = new InputStreamReader(System.in);
		
		// 객체 전용 출력 스트림 생성(객체를 내보낼 수 있는 수도꼭지 열기)
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//-- 객체 전용 출력 스트림으로
		//   fos 라는 파일 전용 출력 스트림을 감싸겠다.
		//   BufferedReader br = new BufferedReader(isr);
		
		// ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f0));
		// ===================          ==================     --------------------
		//      오브젝트                 파일 → 오브젝트?             파일
		
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ※ ObjectOutputStream 클래스는
		//    객체들을 출력하는 기능을 제공하는 클래스로
		//    출력 스트림에 출력하기 전에
		//    내부적으로 객체 직렬화를 수행하게 된다.
		//    자바 기본 데이터 또는 객체들을
		//    파일에 저장하거나 네트워크를 통해 전달하기 위해
		//    전달할 객체를 직렬화 하는 기능을 제공하는 것이다.

		
		// Stream에 h1을 기록하겠다.
		// 생성된 스트림에 내보낼 객체를 기록.
		oos.writeObject(h1);
		//-- out.write(ch); 와 같은 개념의 구문

		// 객체 전용 리소스 반납 (겉을 감싼 것이 ObjectOutputStream 이므로 oos 먼저 close())
		oos.close();
		//-- ObjectOutputStream 리소스 반납

		// 파일 전용 리소스 반납
		fos.close();
		//-- FileOutputStream 리소스 반납.

		// (객체를 직렬화하여 파일로) 내보내기 끝~!!!
		
		//------------------------------------------------------------------------

		// (객체를 직렬화하여 내보낸 파일) 읽어들이기 시작~!!!
		
		if(f0.exists())
		{
			// f0 파일을 파일 입력 스트림으로 읽어들이고
			FileInputStream fis = new FileInputStream(f0);
			
			// fis 파일 입력 스트림으로부터 객체 입력 스트림을 얻어내기
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 객체 입력 스트림 으로부터 읽어들인 객체
			Hashtable h2 = (Hashtable)ois.readObject();	// 오브젝트 → 해시테이블 (다운캐스팅)
			
			ois.close();
			
			fis.close();
			
			// 여기까지 읽어들이는 작업 끝!!
			// ----------------------------------------------------------------------------------
		
			String key;
			String value;
			
			Enumeration e = h2.keys();
			
			while(e.hasMoreElements())
			{
				key = (String)e.nextElement();
				value = (String)h2.get(key);			
				System.out.println(key + " : " + value);
			}
		
		}
		else
		{
			System.out.println("읽어들일 파일이 존재하지 않습니다~");
		}
		

		
	}
}