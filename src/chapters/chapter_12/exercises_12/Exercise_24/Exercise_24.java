package chapters.chapter_12.exercises_12.Exercise_24;

import java.io.PrintWriter;

public class Exercise_24 {
    public static void main(String[] args) throws Exception {
        try (
                PrintWriter output = new PrintWriter("Salary.txt")

        ) {
            final int NUMBEROFLINES = 1000;

            for (int i = 0; i < NUMBEROFLINES; i++) {
                output.print("FirstName" + i + " LastName" + i + " ");
                int rank = (int) (Math.random() * 3);

                if (rank == 0){
                    double salary = 50000 + (Math.random() * 30000);
                    output.printf("assistant %.2f", salary);
                }
                else if (rank == 1) {
                    double salary = 60000 + (Math.random() * 50000);
                    output.printf("associate %.2f", salary);
                }
                else {
                    double salary = 75000 + (Math.random() * 55000);
                    output.printf("full %.2f", salary);
                }
                output.println();



            }

        }


    }

}