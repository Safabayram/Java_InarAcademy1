package chapters.chapter_11.exercises11.Exercise_05;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<String> students;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<String>();
    }
    public void addStudent(String student) {
        students.add(student);
    }
    public int getNumberOfStudents() {
        return students.size();
    }
    public String getCourseName() {
        return courseName;
    }
    public void dropStudent(String student) {
        students.remove(student);
    }
    public String toString() {
        return students.toString();
    }







}
