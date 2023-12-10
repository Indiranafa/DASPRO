import java.util.Scanner;

public class CekPrimaRekursif {
    // Fungsi rekursif untuk mengecek apakah suatu bilangan prima atau bukan
    public static boolean cekPrimaRekursif(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return cekPrimaRekursif(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angka; // Ubah nilai angka sesuai dengan bilangan yang ingin dicek
        System.out.print("Masukkan Angka: ");
        angka = scan.nextInt();

        if (cekPrimaRekursif(angka, 2)) {
            System.out.println(angka + " adalah bilangan prima.");
        } else {
            System.out.println(angka + " bukan bilangan prima.");
        }
    }
}
