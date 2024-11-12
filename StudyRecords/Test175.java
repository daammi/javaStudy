/* ====================================
  ���� �÷��� (Collection) ����
======================================*/

// Set �� HashSet, TreeSet
// - ���� ����
// - �ߺ��� ������� �ʴ� ����(�⺻)

/*
�� TreeSet<E> Ŭ����

   java.util.TreeSet<E> Ŭ������
   Set �������̽��� ����� SortedSet �������̽��� ������ Ŭ������
   �����͸� �߰��ϸ� �����͵��� �ڵ����� �������� ������ �ȴ�.
*/


// VO  - Value Object
// DTO - Data Transfer Object
// DAO - Data Access Object

// �� �ǹ����� �ַ� ����ϴ� ��
// DTO	- Data Transfer Object
// DAO	- Data Access Object

// VO DTO ����� �����̴�.
// ���� ������ ���� �����Ѵ�...
 
// VO �������ε� ���
// DAO

/*
	1. VO (Value Object)
	����: Value Object�� ���� Ư���� ���� ǥ���ϱ� ���� ���Ǵ� ��ü��, �ش� �� ��ü�� �߿��� ��쿡 ���˴ϴ�. VO�� �Һ���(immutable)�� �����ϸ�, ������ ���� ������ �� VO�� ���� ������ ���ֵ˴ϴ�.
	�ֿ� Ư¡:
	�Һ���(Immutable): VO ��ü�� �Ӽ��� �� �� �����Ǹ� ������� �ʽ��ϴ�. �Һ����� ���� ���� �ϰ����� ������ �� �ֽ��ϴ�.
	���(Equality): VO�� ���� ���(Equality)�� ���ϴ� �� ������ �Ӵϴ�. ��, ������ ���� ����ִ� �� VO�� ���� ������ ���ֵ˴ϴ�.
	����: Money, Address, Coordinate�� ���� ��ü�� VO�� ���˴ϴ�. ���� ���, �� Money ��ü�� ������ �ݾװ� ��ȭ�� ���� ��� ������ ������ ���ֵ˴ϴ�.
	2. DTO (Data Transfer Object)
	����: DTO�� �ý����� ���� ���� ���� �����͸� �����ϱ� ���� ��ü��, �ַ� ��Ʈ�ѷ��� ���� �� �Ǵ� ������ Ŭ���̾�Ʈ �� ������ ������ ���� ���˴ϴ�. DTO�� ����Ͻ� ������ ����, ���� �����͸��� ��� �ֽ��ϴ�.
	�ֿ� Ư¡:
	�ܼ��� ������ ����: DTO�� ������ ������ �������θ� ���Ǹ�, � ����Ͻ� ������ �������� �ʽ��ϴ�.
	�ַ� ����ȭ(Serialization) ���: Ŭ���̾�Ʈ-���� ��� ��� �����͸� ����ȭ�Ͽ� �����ϰ�, ���� �������� ������ȭ�Ͽ� ��ü�� ��ȯ�մϴ�.
	����: ���� ���, ����� ������ �����ϴ� UserDTO Ŭ�������� id, name, email ���� �Ӽ��� ���Ե˴ϴ�.
	3. DAO (Data Access Object)
	����: DAO�� �����ͺ��̽����� ��ȣ�ۿ��� �����ϴ� ��ü�Դϴ�. �����ͺ��̽��� �����Ͽ� �����͸� ��ȸ�ϰų� �����ϴ� ����� �����ϸ�, �����ͺ��̽��� ����Ͻ� ������ �и��ϱ� ���� ���˴ϴ�.
	�ֿ� Ư¡:
	�����ͺ��̽� ���� ����: DAO�� SQL ������ ORM(Object-Relational Mapping)�� ���� �����ͺ��̽� CRUD(Create, Read, Update, Delete) �۾��� �����մϴ�.
	����Ͻ� �������� �и�: ����Ͻ� �������� ���� �����ͺ��̽��� �������� �ʰ�, DAO�� ���� �����ͺ��̽��� ���������ν� �ڵ��� ������������ ���뼺�� ���Դϴ�.
	����: ���� ��� UserDAO�� �����ͺ��̽����� User ������ ��ȸ�ϰų�, ���ο� User�� �����ϴ� ���� �۾��� �����մϴ�.
*/

import java.util.*;

class MyComparator<T> implements Comparator<T>
{
	
	// �� ����� �����ϴ� �޼ҵ� ������
	// �Ű������� ���� ������
	// GradeDTO Ÿ������ �����ϵ���
	// �θ� Ŭ���� Comparator�� compare() �޼ҵ带
	// �������̵� �ϰ� �ִ�.
	
	@Override
	public int compare(T o1, T o2)
	{
		GradeDTO s1 = (GradeDTO)o1;
		GradeDTO s2 = (GradeDTO)o2;
	
		// �й� ����(��������);
//		return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
	
		// �й� ����(��������);
//		return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());		
	
//		return s1.getTot() - s2.getTot();
		
//		return s2.getTot() - s1.getTot();
//
//		return s1.getName().compareTo(s2.getName()); 
		
		return s2.getName().compareTo(s1.getName()); 
	}
	
	// compare�� ���� ���� �� ���� o1, o2�� ����
	// ������ ������ �ڿ� �� o2�� �� ū ���̰�
	// ����� ������ �տ� �� o1�� �� ū ���̸�
	// 0�� ������ ���� ���ٴ� ������ �̿��Ͽ� compare() �޼ҵ��
	// ���ڿ� ũ�⸦ ���Ѵ�.
}

/*
	public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // ��ĳ����: Dog ��ü�� Animal Ÿ������ ����
        Animal myCat = new Cat(); // ��ĳ����: Cat ��ü�� Animal Ÿ������ ����
        
        // Animal Ÿ�����δ� Dog�� fetch() �޼ҵ忡 ������ �� �����Ƿ� �ٿ�ĳ������ �ʿ�
        if (myDog instanceof Dog) {
            Dog dog = (Dog) myDog;  // �ٿ�ĳ����
            dog.fetch();            // Dog�� fetch() �޼ҵ� ȣ��
        }
        
        // ���������� Cat�� scratch() �޼ҵ带 ����ϱ� ���� �ٿ�ĳ������ �ʿ�
        if (myCat instanceof Cat) {
            Cat cat = (Cat) myCat;  // �ٿ�ĳ����
            cat.scratch();          // Cat�� scratch() �޼ҵ� ȣ��
        }
    }
}

*/

class GradeDTO
{
	// �ֿ� �Ӽ� ����
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public GradeDTO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public GradeDTO()
	{
		this("","",0,0,0);
	}
	
	// getter / setter ����
	public String getHak()
	{
		return hak;
	}
	
	public void setHak(String hak)
	{
		this.hak = hak;
	}
   
   	public String getName()
	{
		return name;
	}
	
   	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getKor()
	{
		return kor;
	}
	
	public void setKor(int kor)
	{
		this.kor = kor;
	}
	
	public int getEng()
	{
		return eng;
	}
	
	public void setEng(int eng)
	{
		this.eng = eng;
	}
	
	public int getMat()
	{
		return mat;
	}
	
	public void setMat(int mat)
	{
		this.mat = mat;
	}
	
	public int getTot()
	{
		return kor+eng+mat;
	}
}

public class Test175
{
	public static void main(String[] args)
	{
		TreeSet<String> set	 = new TreeSet<String>();
		
		set.add("�͸���Į��");
		set.add("������ũ");
		set.add("��");
		set.add("���ǽ�");
		set.add("��ġ");
		set.add("õ�����ı׷���");
		set.add("�ּ�ȸ��");
		set.add("����");	
		set.add("������");
		set.add("�������йи�");
		set.add("�����������");
		
		
		// Iterator �� Ȱ���Ͽ� set ��� ��ü ���
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------");
		
//		TreeSet<GradeDTO> set2 = new TreeSet<GradeDTO>();
		TreeSet<GradeDTO> set2 = new TreeSet<GradeDTO>(new MyComparator<GradeDTO>());
		
		set2.add(new GradeDTO("2409123","������",90,80,70));
		set2.add(new GradeDTO("2409225","������",91,81,71));
		set2.add(new GradeDTO("2409332","�ڼ���",88,78,68));
		set2.add(new GradeDTO("2409156","���¹�",70,60,50));
		set2.add(new GradeDTO("2409133","������",99,88,77));
		set2.add(new GradeDTO("2409452","�ȼ�â",56,86,96));	
		
		Iterator<GradeDTO> it2 = set2.iterator();
		while(it2.hasNext())
		{
			GradeDTO dto = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n"
							 , dto.getHak(), dto.getName()
							 , dto.getKor(), dto.getEng(), dto.getMat()
							 , dto.getTot());
		}
		System.out.println();
		
		// �� �Ұ� �� ���� �Ұ� �� ��Ÿ�� ����
	}
		
}

