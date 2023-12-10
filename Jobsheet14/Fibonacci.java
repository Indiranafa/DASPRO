public class Fibonacci {
   // Fungsi rekursif untuk menghitung jumlah pasangan marmut pada bulan ke-n
   public static int hitungPasanganMarmut(int bulan) {
    if (bulan <= 2) {
        return bulan;
    } else {
        return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
    }
}

    public static void main(String[] args) {
        int bulan = 12; // Bulan yang ingin dihitung
        int pasanganProduktif = 0; // Jumlah pasangan marmut yang produktif
        int pasanganBelumProduktif = 0; // Jumlah pasangan marmut yang belum produktif
        int totalPasangan;

        System.out.println("Bulan\tProduktif\tBelum Produktif\tTotal Pasangan");
        for (int i = 1; i <= bulan; i++) {
            int jumlahPasangan = hitungPasanganMarmut(i);

            totalPasangan = pasanganProduktif + pasanganBelumProduktif;
            System.out.println(i + "\t" + pasanganProduktif + "\t\t" + pasanganBelumProduktif + "\t\t" + totalPasangan);

            pasanganBelumProduktif = pasanganProduktif;
            pasanganProduktif = jumlahPasangan;
        }
    }
}
