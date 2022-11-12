package chapters.chapter10.exercises10;

import java.util.Arrays;

public class Exercise_25 {
    public static void main(String[] args) {
        String[] splittedArray = split("#ab##12#453", "#");
        for (int i = 0; i < splittedArray.length; i++) {
            System.out.print(splittedArray[i] + " ");
        }
        System.out.println();
    }


    public static String[] split(String s, String regex) {
        char[] chars = s.toCharArray();
        char[] charRegex = getRegex(regex);
        String[] splittedArray = new String[chars.length];
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            boolean isContainsRegex = false;
            for (int j = 0; j < charRegex.length; j++) {
                if (chars[i] == charRegex[j]) {
                    isContainsRegex = true;
                }

            }
            if (isContainsRegex) {
                if (splittedArray[count] == null) {
                    splittedArray[count] = "" + chars[i];

                } else {
                    count++;
                    splittedArray[count] = "" + chars[i];


                }
                count++;
            } else {
                if (splittedArray[count] == null) {
                    splittedArray[count] = "" + chars[i];
                } else {
                    splittedArray[count] = "" + chars[i];
                }
            }

        }
        String[] result = new String[count + 1];
        System.arraycopy(splittedArray, 0, result, 0, result.length);
        return result;


    }

    public static char[] getRegex(String regex) {
        if (regex.length() == 1) {
            return regex.toCharArray();
        } else {
            char[] array = regex.toCharArray();
            return Arrays.copyOfRange(array, 1, array.length - 1);
        }
    }
}

