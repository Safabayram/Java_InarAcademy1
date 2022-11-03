package chapters.chapter09.sampleQuestions;

public class Student {
    private int id;
    private String name;
    private java.util.Date dateCreated;

    public Student(int ssn, String newName) {
        id = ssn;
        name = newName;
        dateCreated = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }
}
class StudentTest{
    public static void main(String[] args) {

        Student student = new Student(111223333, "safa");
        java.util.Date dateCreated = student.getDateCreated();
        dateCreated.setTime(200000);



    }
}


