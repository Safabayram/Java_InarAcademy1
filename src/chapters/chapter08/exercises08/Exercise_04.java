package chapters.chapter08.exercises08;

import java.util.Arrays;

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] employeeHours =
                {{2 ,4, 3, 4, 5, 8, 8},
                        {7, 3, 4, 3, 3, 4, 4},
                        {3, 3, 4, 3, 3, 2, 2},
                        {9, 3, 4, 7, 3, 4, 1},
                        {3, 5, 4, 3, 6, 3, 8},
                        {3, 4, 4, 6, 3, 4, 4},
                        {3, 7, 4, 8, 3, 8, 4},
                        {6, 3, 5, 9, 2, 7, 9}};


        int[] totalHoursPerEmployee = sumEmployeeHours(employeeHours);
        int[] index = new int[totalHoursPerEmployee.length];
        sorts(totalHoursPerEmployee,index);

        for (int i = 0; i < totalHoursPerEmployee.length; i++) {
            System.out.printf("Employee %s worked %d hours%n", index[i], totalHoursPerEmployee[i]);
        }

        System.out.println(Arrays.toString(index));

    }

    public static int[] sumEmployeeHours(int[][] hours) {
        int[] totalHoursPerEmployee = new int[hours.length];
        for (int i = 0; i < hours.length; i++) {
            int sum = 0;
            for (int j = 0; j < hours[i].length; j++) {
                sum += hours[i][j];
            }
            totalHoursPerEmployee[i] = sum;
        }
        return totalHoursPerEmployee;
    }

    static void sorts(int[] totalHours, int[] indexList) {

        for (int i = 0; i < indexList.length; i++) {
            indexList[i] = i;
        }

        for (int i = 0; i < totalHours.length; i++) {
            int currentMax = totalHours[i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < totalHours.length; j++) {
                if (currentMax < totalHours[j]) {
                    currentMax = totalHours[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                totalHours[currentMaxIndex] = totalHours[i];
                totalHours[i] = currentMax;

                int temp = indexList[currentMaxIndex];
                indexList[currentMaxIndex] = indexList[i];
                indexList[i] = temp;
            }
            System.out.println(java.util.Arrays.toString(indexList) + " - " + java.util.Arrays.toString(totalHours));
        }
    }

}
