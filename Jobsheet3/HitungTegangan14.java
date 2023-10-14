package Jobsheet3;
import java.util.Scanner;

public class HitungTegangan14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Rtotal;

        System.out.println("Masukkan Nilai R1 : ");
        double R1 = sc.nextDouble(); // Nilai resistor pertama dalam seri
        System.out.println("Masukkan Nilai R2 : ");
        double R2 = sc.nextDouble(); // Nilai resistor kedua dalam seri
        System.out.println("Masukkan Nilai R3 : ");
        double R3 = sc.nextDouble(); // Nilai resistor dalam paralel dengan R1
        System.out.println("Masukkan Nilai R4 : ");
        double R4 = sc.nextDouble(); // Nilai resistor dalam paralel dengan R2

        double Rparalel = 1.0 / ((1.0 / R1) + (1.0 / R2) + (1.0 / R3));
        System.out.println("Nilai Rparalel: " + Rparalel);
        
        System.out.println("Masukkan nilai arus I (Ampere): ");
        double I = sc.nextDouble();

        Rtotal = Rparalel + R4;
        double V = I * Rtotal;
        System.out.println("Nilai Tegangan (V) dalam rangkaian campuran adalah: " + V + " volt");
    }

     // public static void main(String[] args) {
    // double R1 = 100.0;
    // double R2 = 200.0;
    // double R3 = 150.0;
    // double R4 = 50.0;

    // double I = 0.5;
    // double Rtotal = R1 + R2 + R3 + R4;
    // double V = I * Rtotal;
    // System.out.println("Nilai Tegangan (V) dalam rangkaian adalah: " + V + "
    // volt");
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Masukkan Nilai R1 : ");
    // double R1 = sc.nextDouble();
    // System.out.println("Masukkan Nilai R2 : ");
    // double R2 = sc.nextDouble();
    // System.out.println("Masukkan Nilai R3 : ");
    // double R3 = sc.nextDouble();
    // System.out.println("Masukkan Nilai R4 : ");
    // double R4 = sc.nextDouble();
    // System.out.println("Masukkan Nilai I (Ampere) : ");
    // double I = sc.nextDouble();
    // double Rtotal = R1 + R2 + R3 + R4;
    // double V = I * Rtotal;
    // System.out.println("Nilai Tegangan (V) dalam rangkaian adalah: " + V + "
    // volt");
    // }
}
