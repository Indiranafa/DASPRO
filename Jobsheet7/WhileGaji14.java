package Jobsheet7;

import java.util.Scanner;

public class WhileGaji14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jmlKaryawan, jmlJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        jmlKaryawan = scan.nextInt();

        int i = 0;
        //perulangan while
        while (i < jmlKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i + 1) + ": ");
            jabatan = scan.next();

            if (jabatan.equalsIgnoreCase("direktur") || jabatan.equalsIgnoreCase("manajer") || jabatan.equalsIgnoreCase("karyawan")) {
                System.out.print("Masukkan jumlah jam lembur: ");
                jmlJamLembur = scan.nextInt();

                if (jabatan.equalsIgnoreCase("manajer")) {
                    gajiLembur = jmlJamLembur * 100000;
                } else if (jabatan.equalsIgnoreCase("karyawan")) {
                    gajiLembur = jmlJamLembur * 75000;
                }

                totalGajiLembur += gajiLembur;
                i++;
            } else {
                System.out.println("Jabatan invalid");
            }
        }
        System.out.print("Total gaji lembur: " + totalGajiLembur);
    }
}
