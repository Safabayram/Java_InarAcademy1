package chapters.chapter_11.sampleQuestions;

import java.util.Date;

public class GeometricObject {

    private String color;
    private boolean isFilled;

    private Date dateCreated;

    public GeometricObject(String color, boolean isFilled, Date dateCreated) {
        this.color = color;
        this.isFilled = isFilled;
        this.dateCreated = dateCreated;
    }




    public GeometricObject(Date dateCreated) {
        this.dateCreated = dateCreated;
    }


    public GeometricObject() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", isFilled=" + isFilled +
                ", dateCreated=" + dateCreated +
                '}';
    }


}
