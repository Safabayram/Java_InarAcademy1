package chapters.chapter10.exercises10;

public class Course {
    private String courseName;
    private String[] students = new String[3];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {

        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }

        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int index = getIndexOfStudent(student);

        if (index == -1) {
            System.out.printf("There aren't any student named %s int this course.\n", student);
            return;
        }

        for (int i = index; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }
        numberOfStudents--;
    }

    public int getIndexOfStudent(String student) {

        for (int i = 0; i < students.length; i++) {
            if (student.equals((students[i]))) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {

        students = new String[100];
        numberOfStudents = 0;

    }



}
