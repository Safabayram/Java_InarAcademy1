package chapters.chapter11.exercises11.Exercise_02;

import chapters.chapter10.exercises10.MyDate;

public class Test {
    public static void main(String[] args) {


        Person myPerson = new Person("safa", "ankara", "123456", "sb@gmail.com");
        Student myStudent = new Student("ahmet", "konya", "78977", "adas@hotmail.com", 1);
        Employee myEmploye = new Employee("ersin", "bolu", "54654654", "qwe@gmail.com", "istanbul", 45, new MyDate());
        Faculty myFaculty = new Faculty("ali", "manisa", "54685", "asd@hot.com", "izmir", 23000, new MyDate(), "42", "ceo");
        Staff myStaff = new Staff("ayse", "bursa", "56465", "sdasda", "ankara", 42, new MyDate(), "chief financial executor");

        System.out.println(myPerson);
        System.out.println(myStudent);
        System.out.println(myEmploye);
        System.out.println(myFaculty);
        System.out.println(myStaff);

    }


}
