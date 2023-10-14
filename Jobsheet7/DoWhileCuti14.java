package Jobsheet7;

import java.util.Scanner;

public class DoWhileCuti14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jmlHari;
        String konfirmasi;

        System.out.print("Jatah Cuti: ");
        jatahCuti = sc.nextInt();

        //perulangan do while
        do {
            System.out.print("\nApakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jmlHari = sc.nextInt();

                if (jmlHari <= jatahCuti) {
                    jatahCuti -= jmlHari;
                    System.out.print("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.print("Sisa jatah cuti Anda tidak mencukupi");
                    break;
                }
            }
        } while (jatahCuti > 0);
    }
}
