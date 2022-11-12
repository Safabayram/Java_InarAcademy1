package week_14.assignment_1;

public class Animal {
    String name;
    double height;
    double weight;
    boolean hasSwimmingSkills;
    boolean hasFlyingSkills;

    public Animal() {
        this(null, 0, 0, false, false);
    }


    public Animal(String name, double height, double weight, boolean hasSwimmingSkills, boolean hasFlyingSkills) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hasSwimmingSkills = hasSwimmingSkills;
        this.hasFlyingSkills = hasFlyingSkills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHasSwimmingSkills() {
        return hasSwimmingSkills;
    }

    public void setHasSwimmingSkills(boolean hasSwimmingSkills) {
        this.hasSwimmingSkills = hasSwimmingSkills;
    }

    public boolean isHasFlyingSkills() {
        return hasFlyingSkills;
    }

    public void setHasFlyingSkills(boolean hasFlyingSkills) {
        this.hasFlyingSkills = hasFlyingSkills;
    }


    public void runs(String name) {

        System.out.println(name + "is running");
    }

    public void eats(String name) {

        System.out.println(name + "is eating");
    }

    public void roar(String name) {
        System.out.println(name + "is roaring");


    }

    public void sleep(String name) {
        System.out.println(name + "is sleeping");
    }


}
