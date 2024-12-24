package class1;

public class ClassStart4 {

    public static void main(String[] args)
    {
        Student student1;
        student1 = new Student();   //x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;


        Student student2;
        student2 = new Student();   //x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];

        students[0] = student1;
        students[1] = student2;

        for(int i=0; i<students.length;i++)
            System.out.println(students[i].name + " " + students[i].age + " " + students[i].grade);

//        인스턴스를 복사하는 것이 아니라, 인스턴스 내의 참조값을 복사 & 전달!
//        자바에서 변수의 대입( = )은 모두 변수에 들어있는 값을 복사해서 전달하는 것이다.

    }


}
