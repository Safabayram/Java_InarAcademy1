package chapters.chapter_13.exercises_13.Exercise_13;

public class CourseTest {
    public static void main(String[] args) throws CloneNotSupportedException {


        Course myCourse = new Course("Inar");

        myCourse.addStudent("safa");
        myCourse.addStudent("ahmet");
        myCourse.addStudent("burak");


        Course c = myCourse.clone();

        String[] students = myCourse.getStudents();
        String[] students2 = c.getStudents();

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " ");


        }
        for (int i = 0; i < students.length; i++) {
            System.out.print(students2[i] + " ");


        }


    }


}
