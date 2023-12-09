package Jobsheet11;

import java.util.Scanner;

public class SegitigaAngka14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
        } else {
            
            for (int i = 1; i <= N; i++) {
                // Mencetak spasi untuk membuat pola segitiga rata kanan
                for (int j = N; j > i; j--) {
                    System.out.print(" ");
                }

                // Mencetak angka dari 1 hingga i
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }
}
