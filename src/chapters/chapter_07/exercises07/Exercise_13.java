package chapters.chapter_07.exercises07;

public class Exercise_13 {
    public static int getRandom(int... numbers){
        int number ;
        boolean contains;
        do {
            contains = false ;
            number = (int) (Math.random() * 54 + 1) ;
            for (int i = 0; i <numbers.length ; i++) {
                if (number == numbers[i]){
                    contains = true ;
                }
            }
        } while (contains) ;
        return number ;
    }



}
