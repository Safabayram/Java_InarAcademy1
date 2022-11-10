package chapters.chapter10.exercises10;

public class MyStringBuilder1 {

    private String s;

    public MyStringBuilder1(String s) {
        this.s = s;
    }
    public MyStringBuilder1 append(MyStringBuilder1 s) {
        String newStr  = this.s;
        newStr += s;
        return new MyStringBuilder1(newStr);
    }
    public MyStringBuilder1 append(int i) {
        String newStr  = this.s;
        newStr += i + "";
        return new MyStringBuilder1(newStr);
    }

    public int length() {
        return s.length();
    }

    public MyStringBuilder1 toLowerCase() {
        this.s = this.s.toLowerCase();
        return new MyStringBuilder1(this.s);
    }
    public MyStringBuilder1 substring(int begin, int end) {
        this.s = this.s.substring(begin, end);
        return new MyStringBuilder1(this.s);
    }
    public String toString() {
        return this.s;
    }













}
