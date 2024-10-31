/*====================================
■■■ 주민등록번호 유효성 검사 ■■■
======================================*/

// ● 주민등록번호 검증 공식
// 
//    ① 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.
//	
//		123456-1234567
//		****** ******
//		234567 892345
//		
//	② 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.
//	
//	③ 더해진 결과값을 11로 나누어 나머지 를 취한다.
//	
//	④ 11에서 나머지를 뺀 결과값을 구한다.
//   
//  ⑤ ④ 에서 처리한 연산 결과가 주민번호를 구성하는 마지막 숫자와
//     일치하는지의 여부를 비교하여 확인한다.
//
//	⑥ 최종 결과값이 11 OR 10 이면 이를 다시 10으로 나누어 나머지를 취한다.	

// 주민번호입력(xxxxxx-xxxxxxx) : 

import java.util.*;

class ID
{
	private String id;
	private String head;
	private String tail;
	private int[] arr = new int[6];
	private int sum=0;
	
	ID()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호입력(xxxxxx-xxxxxxx) : ");
		id = sc.next();
	}
	
	void check()
	{
		if(id.length()!=14){
			System.out.println(">> 입력 오류");
			return;
		}
		if(cal())
			System.out.println(">> 정확한 주민번호~");
		else
			System.out.println(">> 잘못된 주민번호~");
	}
	
	boolean cal()
	{
		int cnt=0;
		int[] cal = {2,3,4,5,6,7,8,9};
		
		head=id.substring(0,6);
		tail=id.substring(7,id.length()-1);
		
		for(int i=0;i<arr.length;i++){
			arr[i]=head.charAt(i)-48;
			sum+=arr[i]*cal[cnt++];
		}
		
		for(int i=0;i<arr.length;i++){
			arr[i]=tail.charAt(i)-48;
			sum+=arr[i]*cal[cnt%8];
			cnt++;
		}
		
		sum%=11;
		int result=11-sum;
		
		if(result==11||result==10){
			result%=10;
			if(result==id.charAt(13)-48)
				return true;
			else
				return false;
		}
		
		if(result==id.charAt(13)-48)
				return true;
			else
				return false;
	}
}


public class Test110
{
	public static void main(String[] args)
	{
		ID id = new ID();
		id.check();
	}
}
