package week_08;

public class Interview_1 {
    public static void main(String[] args) {

        String s = "safa";
        String s1 = "fasa";

        System.out.println(checkRotation(s, s1));


    }

    public static boolean checkRotation(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        String s3 = a + a;
        if (s3.contains(b)) {
            return true;
        }
        return false;
    }
}

    /*public static boolean checkRotation(String a,String b,boolean isRotation){
        if (a.length() != b.length()){
            return false;
        }




    }
    /*public static String rotation(String s1,int i){
        String s3 = "";
        for (int j = i; j <s1.length() ; j++) {
           s3 += s1.charAt(j);

        }
        for (int j = 0; j <i ; j++) {
            s3 += s1.charAt(j);



        }
        return s3;

    }
}*/
