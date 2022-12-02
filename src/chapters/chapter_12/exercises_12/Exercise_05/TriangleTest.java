package chapters.chapter_12.exercises_12.Exercise_05;

public class TriangleTest {

    public static void main(String[] args) {

        try {
            Triangle myTriangle = new Triangle(1,3,2);
            Triangle myTriangle1 = new Triangle(5,8,6);
        }catch (IllegalTriangleException ex){
            System.out.println(ex.getMessage());
        }


        System.out.println("system is running");
    }

}
