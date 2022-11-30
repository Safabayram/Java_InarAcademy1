package chapters.chapter13.exercises_13.Exercise_11;

public class Exercise_11 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Octagon octa = new Octagon(5);
        System.out.println("OctagonArea: " + octa.getArea() + "\nPerimeter: " + octa.getPerimeter());

        Octagon octaClone = (Octagon) octa.clone();
        int result = (octa.compareTo(octaClone));

        if (result == 1) {
            System.out.println("Octagon is bigger than its clone.");
        }
        else if (result == -1) {
            System.out.println("Octagon is smaller than its clone.");
        }
        else {
            System.out.println("Octagon is equal to its clone.");
        }

    }

}
