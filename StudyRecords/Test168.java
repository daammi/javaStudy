/* ====================================
  ■■■ 컬렉션 (Collection) ■■■
======================================*/

// ※ 자료구조 객체 선언 및 생성 시
//    사용자 정의 클래스 활용
//    → 사용자 정의 자료형으로 활용

import java.util.*;

// 클래스 → 사용자 정의 자료형으로 활용
class UserData
{
	private String name;
	private int age;
	
	String getName()
	{
		return name;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	int getAge()
	{
		return age;
	}
	
	void setAge(int age)
	{
		this.age = age;
	}
	
	public UserData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	// ※ 사용자 정의 생성자가 구성될 경우
	//    default 생성자가 자동으로 삽입되지 않기 때문에
	//    default 생성자 형태의 생성자를 사용자 정의 생성자로
	//    추가 구성하게 되는 것이 일반적인 클래스 설계 과정
	//    (반드시 설계해야 한다는 문법적인 규칙은 없다.)

	public UserData()
	{
//		name = "";
//		age = 0;

		this("", 0);	//매개변수 두 개 받는 생성자		

	}
	
}
public class Test168
{
	public static void main(String[] args)
	{
		Vector<UserData> v = new Vector<UserData>();
		
		UserData[] ud = new UserData[3];
		
		String[] str = {"임성산","공찬민","정영훈"};
		int[] age = {3,17,49};		
		
		for(int i=0;i<3;i++)
		{
			ud[i]=new UserData(str[i],age[i]);
			v.add(ud[i]);
		}
		
		
//		for(UserData n : ud)
//			System.out.printf("이름: %s, 나이: %d\n",n.getName(),n.getAge());
		
		for(Object temp : v)
		{
			UserData n = (UserData)temp;
			System.out.printf("이름:%s, 나이:%d세\n",n.getName(),n.getAge() );
		}
		
	}
}