package Jobsheet13;

import java.util.Scanner;

public class Ucapan14 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like i could ask you anything.");
    }

    public static void UcapanTambahan(String tambahan) {
        System.out.println(tambahan);
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
        String ucapanTambahan = "Ayooo Tetap Semangat!!!";
        UcapanTambahan(ucapanTambahan);
    }
}
