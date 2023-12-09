package Jobsheet13;
import java.util.Scanner;

public class Kubus14 {
    public static double hitungVolume(double sisi) {
        return sisi*sisi*sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nilai sisi kubus: ");
        double sisiKubus = scan.nextDouble();

        double volume = hitungVolume(sisiKubus);
        System.out.println("Volume Kubus: " + volume);

        double luasPermukaan = hitungLuasPermukaan(sisiKubus);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
    }
}
