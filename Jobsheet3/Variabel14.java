package Jobsheet3;

public class Variabel14 {
    public static void main(String[] args) {
        String Hobby = "Bermain Petak Umpet";
        boolean isPandai = true;
        char JenisKelamin = 'P';
        byte Umur = 14;
        double $ipk = 3.25, tinggi = 1.78;

        System.out.println(Hobby);
        System.out.println("Apakah Pandai? " + isPandai);
        System.out.println("Jenis Kelamin: " + JenisKelamin);
        System.out.println("Umur saya saat ini: " + Umur);
        System.out.println(String.format("Saya ber-IPK %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}
