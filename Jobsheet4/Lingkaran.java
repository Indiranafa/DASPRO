package Jobsheet4;
import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        Double phi = 3.14, keliling, luas;

        System.out.print("Masukkan jari-jari lingkaran: ");
        r = input.nextInt();
        keliling = 2*phi*r;
        luas = phi*r*r;

        System.out.println(keliling);
        System.out.println(luas);
    }
}
