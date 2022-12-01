package chapters.chapter13.exercises_13.Exercise_13;

import chapters.chapter11.exercises11.Exercise_02.Student;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[10];
    private static int numberOfStudents;


    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public Course clone() throws CloneNotSupportedException {

        Course courseClone = (Course) super.clone();

        courseClone.students = students.clone();
        return courseClone;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < this.students.length; i++) {
            String myStudent = students[i];
            if (myStudent.equals(student)) {
                students[i] = null;
                break;
            }


        }
    }


}
