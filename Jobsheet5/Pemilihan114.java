package Jobsheet5;
import java.util.Scanner;

public class Pemilihan114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        // if (angka % 2 == 0){
        //     System.out.println("Angka "+angka+" Bilangan Genap");
        // }else{
        //     System.out.println("Angka "+angka+" Bilangan Ganjil");
        // }
        
        String hasil = angka % 2 == 0 ? "Angka " + angka + " Bilangan Genap" : "Angka " + angka + " Bilangan Ganjil";
        System.out.println(hasil);
    }
}
