package chapters.chapter_10.exercises10;

public class MyStringBuilder2 {
    private String s;

    public MyStringBuilder2() {
        s = "";
    }

    public MyStringBuilder2(char[] chars) {
        s = String.valueOf(chars);
    }

    public MyStringBuilder2(String s) {
        this.s = s;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        String string = this.toString();
        String start = string.substring(0, offset);
        String end = string.substring(offset);
        String result = start + s.toString() + end;
        this.s = result;
        return new MyStringBuilder2(this.s);
    }

    public MyStringBuilder2 reverse() {
        String newStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            newStr += s.charAt(i) + "";
        }
        return new MyStringBuilder2(newStr);
    }

    public MyStringBuilder2 substring(int begin) {
        String newStr = "";
        for (int i = begin; i < s.length(); i++) {
            newStr += s.charAt(i) + "";
        }
        return new MyStringBuilder2(newStr);
    }

    public String toString() {
        return s;
    }

    public int length() {
        return s.length();
    }

    public char charAt(int index) {
        return s.charAt(index);
    }

    public MyStringBuilder2 toUpperCase() {
        for (int i = 0; i < this.length(); i++) {
            if (Character.isLowerCase(this.s.charAt(i))) {
                Character.toUpperCase(this.s.charAt(i));
            }
        }
        return new MyStringBuilder2(this.s);
    }


}
