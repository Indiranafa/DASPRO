package Jobsheet5;
import java.util.Scanner;

public class Pemilihan214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nilai UAS : ");
        float uas = sc.nextFloat();
        System.out.print("Nilai UTS : ");
        float uts = sc.nextFloat();
        System.out.print("Nilai Kuis : ");
        float kuis = sc.nextFloat();
        System.out.print("Nilai Tugas : ");
        float tugas = sc.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        //System.out.println("Nilai akhir = " + total + " sehingga " + message); 

        if (80<total && total<=100){
            System.out.println("predikat A, Nilai Setara 4, Kualifikasi Sangat Baik");
        }else if (73<total && total<= 80){
            System.out.println("predikat B+, Nilai Setara 3.5, Kualifikasi Lebih dari Baik");
        }else if (65<total && total<= 73){
            System.out.println("predikat B, Nilai Setara 3, Kualifikasi Baik");
        }else if (60<total && total<= 65){
            System.out.println("predikat C+, Nilai Setara 2.5, Kualifikasi Lebih dari Cukup");
        }else if (50<total && total<=60) {
            System.out.println("predikat C, Nilai Setara 2, Kualifikasi Cukup");
        }else if (39<total && total<50){
            System.out.println("predikat D, Nilai Setara 1, Kualifikasi Kurang");
        }else {
            System.out.println("predikat E, Nilai Setara 0, Kualifikasi Gagal");
        }

        System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
}
