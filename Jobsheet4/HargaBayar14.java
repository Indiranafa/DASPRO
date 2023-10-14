package Jobsheet4;
import java.util.Scanner;

public class HargaBayar14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, jumlah, jmlHalbuku;
        String merk_buku;
        double dis, total, bayar, jmlDiskon;

        System.out.print("Masukkan merk buku:");
        merk_buku = input.nextLine();
        System.out.print("Masukkan jumlah halaman buku: ");
        jmlHalbuku = input.nextInt();
        System.out.print("Masukkan harga barang yang dibeli: ");
        harga = input.nextInt();
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        jumlah = input.nextInt();
        System.out.println("Masukkan Diskon");
        dis = input.nextDouble();

        total = harga * jumlah;
        jmlDiskon = total * dis;
        bayar = total - jmlDiskon;

        System.out.println("Diskon yang anda dapatkan adalah " + (int)jmlDiskon);
        System.out.println("Jumlah yang harus dibayar adalah " + (int)bayar);
    }
}
