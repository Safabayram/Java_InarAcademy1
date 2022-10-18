package chapters.chapter08.exercises08;

public class Exercise_03 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int [][] listOfCorrect = new int[answers.length][2];

        for (int student = 0; student <answers.length ; student++) {
            int correctCount = 0;
            for (int answer = 0; answer < answers[student].length; answer++) {
                if (answers[student][answer] == keys[answer])
                    correctCount++;

            }
            listOfCorrect[student][0] = student;
            listOfCorrect[student][1]= correctCount;



        }
        sortTheStudentsList(listOfCorrect);

        for (int i = 0; i < listOfCorrect.length; i++) {
            System.out.println("Student " + listOfCorrect[i][0] + "'s correct count is " +
                    listOfCorrect[i][1]);
        }

    }
    public static void sortTheStudentsList(int [][] array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i][1];
            int minIndex = array[i][0];
            for (int j = i + 1; j < array.length ; j++) {
                if (min > array[j][1]){
                    min = array[j][1];
                    minIndex = array[j][0];
                }

            }
            if (minIndex != array[i][0]){

                int temp = array[i][1];
                array[i][1] = array[minIndex][1];
                array[minIndex][1] = temp;

                temp = array[i][0];
                array[i][0] = array[minIndex][0];
                array[minIndex][0] = temp;




            }
        }

    }


}
