package chapters.chapter_11.exercises11.Exercise_02;

public class Student extends Person{
    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 2;
    public final static int JUNIOR = 3;
    public final static int SENIOR = 4;

    public Student(int status) {
        this.status = status;
    }

    public Student(String name, String adress, String phoneNumber, String e_mail, int status) {
        super(name, adress, phoneNumber, e_mail);
        this.status = status;
    }

    public String getStatus() {
        switch (status) {
            case 1 : return "freshman";
            case 2 : return "sophomore";
            case 3 : return "junior";
            case 4 : return "senior";
            default : return "Unknown";
        }
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String toString() {
        return super.toString() + "\nStatus: " + getStatus();
    }




}

