package Jobsheet11;

import java.util.Scanner;

public class NestedLoop_NIM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] temps = new int[5][7];

        for (int i = 1; i < temps.length; i++){
            System.out.println("Kota ke-" + i);
            int total = 0;
            for (int j = 0; j < temps[0].length; j++){
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextInt();
                total += temps[i][j];
            }
            double average = (double) total / temps[0].length;
            System.out.println("Rata-rata kota ke-" + i + ": " + average);
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++){
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (int temp : temps[i]) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }

        int kota = 0;
        for (int i = 0; i < temps.length; i++){
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (int temp : temps[i]) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
        

    }
}
