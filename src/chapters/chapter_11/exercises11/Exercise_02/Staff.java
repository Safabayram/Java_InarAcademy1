package chapters.chapter_11.exercises11.Exercise_02;

import chapters.chapter_10.exercises10.MyDate;

public class Staff extends Employee{
    private String title;

    public Staff(String title) {
        this.title = title;
    }

    public Staff(String name, String adress, String phoneNumber, String e_mail, String office, double salary, MyDate dateHired, String title) {
        super(name, adress, phoneNumber, e_mail, office, salary, dateHired);
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }



}
