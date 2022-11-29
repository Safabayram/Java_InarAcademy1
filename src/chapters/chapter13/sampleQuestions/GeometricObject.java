package chapters.chapter13.sampleQuestions;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;


    protected GeometricObject(){
        dateCreated = new Date();
    }

    protected GeometricObject(String color,boolean filled){
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea()){
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;

        }else {
            return 0;
        }


    }
    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return o1.compareTo(o2) == 1 ? o1 : o2;
    }

}
