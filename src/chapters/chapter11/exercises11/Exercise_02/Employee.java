package chapters.chapter11.exercises11.Exercise_02;

import chapters.chapter10.exercises10.MyDate;

public class Employee extends Person{
    private String office;
    private double salary;
    MyDate dateHired;

    public Employee() {
        this(null,null,null,null,null,0,new MyDate());

    }



    public Employee(String name, String adress, String phoneNumber, String e_mail, String office, double salary, MyDate dateHired) {
        super(name, adress, phoneNumber, e_mail);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return this.office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public MyDate getDateHired() {
        return this.dateHired;
    }
    public String toString() {
        return super.toString() + "\nOffice : " + this.office + "\nSalary : " + this.salary + "$" + "\n" + dateHired.toString();
    }








}
