package chapters.chapter_09.exercises09;

public class Fan {
    public static int SLOW = 1;
    public static int MEDIUM = 2;
    public static int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "white";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }
    public String toString() {
        return "speed " + speed + "\n" + "color " + color + "\n"
                + "radius " + radius + "\n" + ((on) ? "fan is on" : " fan is off");
    }

}
