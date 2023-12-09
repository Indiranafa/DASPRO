package Jobsheet8;

import java.util.Scanner;

public class TugasArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai: ");
        int N = sc.nextInt();

        int[] nilai = new int[N];

        for (int i = 0; i < N; i++){
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            nilai[i] = sc.nextInt();
        }

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        int hasil = nilai[0];

        for(int i = 1; i < N; i++){
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
            hasil += nilai[i];
        }

        double averange = (double) hasil / N;

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Nilai rata-rata: " + averange);

        sc.close();

    }
}
