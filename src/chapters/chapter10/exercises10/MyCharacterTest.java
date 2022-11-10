package chapters.chapter10.exercises10;

public class MyCharacterTest {
    public static void main(String[] args) {
        MyCharacter myCharacter = new MyCharacter('S');
        System.out.println(myCharacter.charValue());
        MyCharacter myCharacter1 = new MyCharacter('c');
        myCharacter1.toUpperCase();
        System.out.println(myCharacter1.charValue());
        System.out.println(myCharacter);
        MyCharacter.isLetter('s');
        System.out.println(myCharacter.compareTo(myCharacter1));
    }
}
