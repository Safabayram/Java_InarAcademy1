package chapters.chapter_11.exercises11.Exercise_05;

public class CourseTest {
    public static void main(String[] args) {
        Course myCourse = new Course("Inar");

        System.out.println(myCourse.getCourseName());
        myCourse.addStudent("safa");
        myCourse.addStudent("ahmet");
        myCourse.addStudent("leyla");

        System.out.println(myCourse.getNumberOfStudents());
        System.out.println(myCourse.toString());

        myCourse.dropStudent("leyla");

        System.out.println(myCourse.toString());

    }


}
