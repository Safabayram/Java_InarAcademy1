package chapters.chapter10.exercises10;

public class CourseTest {
    public static void main(String[] args) {
        Course ınar = new Course("INAR");


        ınar.addStudent("Safa");
        ınar.addStudent("kamil");
        ınar.addStudent("leyla");


        ınar.dropStudent("leyla");


        System.out.println("\nThe students in the course " + ınar.getCourseName() + ":");
        String[] students = ınar.getStudents();
        for (int i = 0; i < ınar.getNumberOfStudents(); i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();
    }
}

