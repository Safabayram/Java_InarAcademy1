package chapters.chapter_10.exercises10;

public class MyString {
    private char[] chars;

    public MyString(char[] chars){
        this.chars = new char[chars.length];
        for (int i = 0; i < chars.length ; i++) {
            this.chars[i] = chars[i];

        }
    }
    public char charAt(int index){
        return chars[index];
    }
    public int length(){
        return chars.length;
    }

    public MyString subString(int begin,int end){
        char[] ch = new char[end -begin];
        for (int i = begin,j = 0; i <end ; i++,j++) {
            ch[j] = chars[i];

        }
        return new MyString(ch);
    }
    public MyString toLowerCase() {
        char[] ch = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            ch[i] = Character.toLowerCase(chars[i]);
        }

        return new MyString(ch);
    }
    public boolean equals(MyString s) {
        if (chars.length != s.length())
            return false;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] != s.charAt(i))
                return false;
        }
        return true;
    }
    public static MyString valueOf(int i) {
        String s = i + "";
        return new MyString(s.toCharArray());
    }





}
