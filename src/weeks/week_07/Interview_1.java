package week_07;

public class Interview_1 {
    public static void main(String[] args) {

        String s = "asdfghjkl";
        if (isUnique(s)){
            System.out.println(s + " is a unique string");
        }else{
            System.out.println(s + " is not unique string");
        }













    }
    public static boolean isUnique(String s){

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j <s.length() ; j++) {
                if (s.charAt(i) == s.charAt(j)){
                    return  false;
                }

            }




        }
        return true;

    }
}
