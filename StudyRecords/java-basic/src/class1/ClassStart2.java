package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] student = {"학생1", "학생2", "학생3"};
        int[] age = {15, 16, 17};
        int[] grade = {80, 90, 70};

        for (int i = 0; i < student.length; i++) {
            System.out.printf("%s - %d - %d \n", student[i], age[i], grade[i]);
        }

    }
}

