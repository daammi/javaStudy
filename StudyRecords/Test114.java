/*====================================
���� ����(Sort) �˰��� ����
======================================*/

// �� ����
//    ����ڷκ��� ���� �л��� ���� �����͸� �Է¹޾�
//	  ������ ���� �л����� ���� ������ ����� �ο��Ͽ�
//	  ����� ����ϴ� ���α׷��� �����Ѵ�,
//	  ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
	
// ���� ��)
// �ο� �� �Է� : 5
// �̸� ���� �Է�(1, ���� ����) : �ȼ�â 90
// �̸� ���� �Է�(2, ���� ����) : ��ν� 80
// �̸� ���� �Է�(3, ���� ����) : ������ 85
// �̸� ���� �Է�(4, ���� ����) : ������ 75
// �̸� ���� �Է�(5, ���� ����) : ������ 95 
 
// -------------
// 1�� ������ 95
// 2�� �ȼ�â 90
// 3�� ������ 85
// 4�� ��ν� 80
// 5�� ������ 75
// -------------

import java.util.*;

// �л� �����͸� �����ϴ� Ŭ����
class stdData {
	String name; // �л��� �̸�
	int score;   // �л��� ����
}

// �л� ���� Ŭ����
class Student {
	
	Scanner sc = new Scanner(System.in); // �Է��� �ޱ� ���� Scanner ��ü
	private int num;                     // �Է¹��� �л� ��
	stdData[] sdt;                       // �л� ������ ������ �迭
	
	// ������
	Student() {	
		do {
			System.out.print("�ο� �� �Է� : ");
			num = sc.nextInt(); // �л� �� �Է� ����
		} while (num < 1);       // �л� ���� 1 �̸��� ��� �ݺ�
		
		sdt = new stdData[num];  // �Է¹��� �л� ����ŭ stdData �迭 ����
	}
	
	// �л��� �̸��� ������ �Է¹޴� �޼���
	void input() {
		for (int i = 0; i < sdt.length; i++) {
			sdt[i] = new stdData(); // ���ο� stdData ��ü ����
			
			System.out.printf("�̸� ���� �Է�(%d, ���� ����) : ", i + 1);
			sdt[i].name = sc.next();    // �̸� �Է�
			sdt[i].score = sc.nextInt(); // ���� �Է�
		}
	}
	
	// ���� ������ �̿��Ͽ� �л� ������ ������������ �����ϴ� �޼���
	void sort() {
		for (int i = 0; i < sdt.length - 1; i++) {
			boolean flag = false; // ������ �Ϸ�Ǿ����� Ȯ���ϴ� �÷���
			
			for (int j = 0; j < sdt.length - i - 1; j++) {
				// ������ �� ������ ���Ͽ� �� ������ Ŭ ��� �ڸ� ��ȯ
				if (sdt[j].score > sdt[j + 1].score) {
					// ���� ��ȯ (��Ʈ XOR ���� �̿�)
					sdt[j].score = sdt[j].score ^ sdt[j + 1].score;
					sdt[j + 1].score = sdt[j + 1].score ^ sdt[j].score;
					sdt[j].score = sdt[j].score ^ sdt[j + 1].score;
					
					// �̸� ��ȯ
					String temp = sdt[j].name;
					sdt[j].name = sdt[j + 1].name;
					sdt[j + 1].name = temp;
					
					flag = true; // ��ȯ�� �߻������� ǥ��
				}	
			}
			if (!flag) // ��ȯ�� ������ ���� �Ϸ�� �ݺ� ����
				break;
		}
	}
	
	// ���� ������ �л� �����͸� ����ϴ� �޼���
	void print() {
		sort(); // ���ĵ� �����ͷ� ���
		int cnt = 1; // ���
		
		System.out.println("-------------");
		for (int i = sdt.length - 1; i >= 0; i--) // ���� ���� ������ ���
			System.out.printf("%d�� %s %d\n", cnt++, sdt[i].name, sdt[i].score);
		System.out.println("-------------");
	}
}

public class Test114 {
	public static void main(String[] args) {
		Student std = new Student(); // Student ��ü ����
		
		std.input(); // �л� ���� �Է�
		std.print(); // �л� ���� ���
	}
}

// ���� ���

/*
	-------------
	1�� ������ 95
	2�� �ȼ�â 90
	3�� ������ 85
	4�� ��ν� 80
	5�� ������ 75
	-------------
	����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/