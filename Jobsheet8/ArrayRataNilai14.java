package Jobsheet8;

import java.util.Scanner;

public class ArrayRataNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jmlMahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jmlLulus = 0;
        int jmlTidakLulus = 0;
        double rata2;


        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            }else{
                totalTidakLulus += nilaiMhs[i];
                jmlTidakLulus++;
            }
        }

        double rataLulus = jmlLulus > 0 ? totalLulus / jmlLulus : 0;
        double rataTidakLulus = jmlTidakLulus > 0 ? totalTidakLulus / jmlTidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);

        // for (int i = 0; i < nilaiMhs.length; i++){
        //     total += nilaiMhs[i];
        //     if (nilaiMhs[i] > 70) {
        //         jmlLulus++;
        //     }
        // }
        // rata2 = total/nilaiMhs.length;
        // System.out.println("Rata-rata nilai = " +rata2);
        // System.out.println("Jumlah mahasiswa yang lulus = " + jmlLulus);
    }
}
