package week_13;

public class Home {
    private int area;
    private int numberOfRooms;
    private int numberOfBaths;
    private boolean garage;
    private int rent;
    private String aspect;
    private int age;


    public Home() {
    }

    public Home(int area,int numberOfRooms,int numberOfBaths,boolean garage,int rent,String aspect,int age){
      this.area = area;
      this.numberOfRooms = numberOfRooms;
      this.numberOfBaths = numberOfBaths;
      this.garage = garage;
      this.rent =rent;
      this.aspect = aspect;
      this.age = age;

    }

    public int getArea() {
        return area;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfBaths() {
        return numberOfBaths;
    }

    public boolean isGarage() {
        return garage;
    }

    public int getRent() {
        return rent;
    }

    public String getAspect() {
        return aspect;
    }

    public int getAge() {
        return age;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setNumberOfBaths(int numberOfBaths) {
        this.numberOfBaths = numberOfBaths;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public void setAspect(String aspect) {
        this.aspect = aspect;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Home{" +
                "area=" + area +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfBaths=" + numberOfBaths +
                ", garage=" + garage +
                ", rent=" + rent +
                ", aspect='" + aspect + '\'' +
                ", age=" + age +
                '}';
    }
}
