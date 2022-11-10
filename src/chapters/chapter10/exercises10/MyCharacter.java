package chapters.chapter10.exercises10;

public class MyCharacter {
    private char ch;

    public MyCharacter(char ch){
        this.ch = ch;

    }
    public char charValue(){
        return ch;
    }
    public int compareTo(MyCharacter c) {
        return this.charValue() - c.charValue();
    }
    public boolean equals(MyCharacter c) {
        return (compareTo(c) == 0);
    }
    public static boolean isLetter(char ch) {
        return ('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z');
    }

    public static boolean isDigit(char ch) {
        return ('0' <= ch && ch <= '9');
    }
    public void toLowerCase() {
        this.ch = Character.toLowerCase(this.ch);
    }

    public void toUpperCase() {
        this.ch = Character.toUpperCase(this.ch);
    }
    public static boolean isLetterOrDigit(char ch){
        return isLetter(ch) || isDigit(ch);
    }




}
