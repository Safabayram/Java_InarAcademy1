package chapters.chapter_11.exercises11.Exercise_02;

import chapters.chapter_10.exercises10.MyDate;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String officeHours, String rank) {
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(String name, String adress, String phoneNumber, String e_mail, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, adress, phoneNumber, e_mail, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + "Faculty{" +
                "officeHours='" + officeHours + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
