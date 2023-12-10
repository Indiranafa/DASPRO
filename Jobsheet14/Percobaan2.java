import java.util.Scanner;

public class Percobaan2 {
    public static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        }else{
            int hasilSebelumnya = hitungPangkat(x, y - 1);
            System.out.print(x + "x");
            return x * hasilSebelumnya;
        }
    }

    public static void cetakDeretPangkat(int x, int y) {
        int hasil = hitungPangkat(x, y);
        System.out.println("1 = " + hasil);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bilangan;
        int pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = scan.nextInt();
        System.out.print("Pangkat: ");
        pangkat = scan.nextInt();

        System.out.print("Deret perhitungan pangkatnya: ");
        cetakDeretPangkat(bilangan, pangkat);
    }
}
