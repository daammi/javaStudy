/*====================================
■■■ 정렬(Sort) 알고리즘 ■■■
======================================*/

// ◎ 과제
//    사용자로부터 여러 학생의 성적 데이터를 입력받아
//	  점수가 높은 학생부터 낮은 순으로 등수를 부여하여
//	  결과를 출력하는 프로그램을 구현한다,
//	  단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.
	
// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1, 공백 구분) : 안석창 90
// 이름 점수 입력(2, 공백 구분) : 김민승 80
// 이름 점수 입력(3, 공백 구분) : 김정현 85
// 이름 점수 입력(4, 공백 구분) : 박지우 75
// 이름 점수 입력(5, 공백 구분) : 공찬민 95 
 
// -------------
// 1등 공찬민 95
// 2등 안석창 90
// 3등 김정현 85
// 4등 김민승 80
// 5등 박지우 75
// -------------

import java.util.*;

// 학생 데이터를 저장하는 클래스
class stdData {
	String name; // 학생의 이름
	int score;   // 학생의 점수
}

// 학생 관리 클래스
class Student {
	
	Scanner sc = new Scanner(System.in); // 입력을 받기 위한 Scanner 객체
	private int num;                     // 입력받은 학생 수
	stdData[] sdt;                       // 학생 정보를 저장할 배열
	
	// 생성자
	Student() {	
		do {
			System.out.print("인원 수 입력 : ");
			num = sc.nextInt(); // 학생 수 입력 받음
		} while (num < 1);       // 학생 수가 1 미만인 경우 반복
		
		sdt = new stdData[num];  // 입력받은 학생 수만큼 stdData 배열 생성
	}
	
	// 학생의 이름과 점수를 입력받는 메서드
	void input() {
		for (int i = 0; i < sdt.length; i++) {
			sdt[i] = new stdData(); // 새로운 stdData 객체 생성
			
			System.out.printf("이름 점수 입력(%d, 공백 구분) : ", i + 1);
			sdt[i].name = sc.next();    // 이름 입력
			sdt[i].score = sc.nextInt(); // 점수 입력
		}
	}
	
	// 버블 정렬을 이용하여 학생 성적을 오름차순으로 정렬하는 메서드
	void sort() {
		for (int i = 0; i < sdt.length - 1; i++) {
			boolean flag = false; // 정렬이 완료되었는지 확인하는 플래그
			
			for (int j = 0; j < sdt.length - i - 1; j++) {
				// 인접한 두 점수를 비교하여 앞 점수가 클 경우 자리 교환
				if (sdt[j].score > sdt[j + 1].score) {
					// 점수 교환 (비트 XOR 연산 이용)
					sdt[j].score = sdt[j].score ^ sdt[j + 1].score;
					sdt[j + 1].score = sdt[j + 1].score ^ sdt[j].score;
					sdt[j].score = sdt[j].score ^ sdt[j + 1].score;
					
					// 이름 교환
					String temp = sdt[j].name;
					sdt[j].name = sdt[j + 1].name;
					sdt[j + 1].name = temp;
					
					flag = true; // 교환이 발생했음을 표시
				}	
			}
			if (!flag) // 교환이 없으면 정렬 완료로 반복 종료
				break;
		}
	}
	
	// 성적 순으로 학생 데이터를 출력하는 메서드
	void print() {
		sort(); // 정렬된 데이터로 출력
		int cnt = 1; // 등수
		
		System.out.println("-------------");
		for (int i = sdt.length - 1; i >= 0; i--) // 높은 점수 순으로 출력
			System.out.printf("%d등 %s %d\n", cnt++, sdt[i].name, sdt[i].score);
		System.out.println("-------------");
	}
}

public class Test114 {
	public static void main(String[] args) {
		Student std = new Student(); // Student 객체 생성
		
		std.input(); // 학생 정보 입력
		std.print(); // 학생 정보 출력
	}
}

// 실행 결과

/*
	-------------
	1등 공찬민 95
	2등 안석창 90
	3등 김정현 85
	4등 김민승 80
	5등 박지우 75
	-------------
	계속하려면 아무 키나 누르십시오 . . .
*/