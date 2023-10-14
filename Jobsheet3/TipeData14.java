package Jobsheet3;

public class TipeData14 {
    public static void main(String[] args) {
        char golonganDarah = 'A';
        byte jarak = (byte) 140;
        short jmlPenduduk = 1024;
        float suhu = 60.50F;
        double berat = 0.5467812345;
        long saldo = 150000000;
        int angkaDesimal = 0x10;

        System.out.println("Golongan darah\t: " + (byte) golonganDarah);
        System.out.println("Jarak\t:" + jarak);
        System.out.println("Jumlah Penduduk Dalam 1 Dusun\t:" + jmlPenduduk);
        System.out.println("Suhu\t:" + suhu);
        System.out.println("Berat\t:" + (float) berat);
        System.out.println("Saldo\t:" + saldo);
        System.out.println("Angka Desimal\t:" + angkaDesimal);
    }
}
