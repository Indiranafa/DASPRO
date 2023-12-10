public class PenjumlahanRekursif {
    // Fungsi rekursif untuk menghitung penjumlahan bilangan dari 1 hingga n
    public static int penjumlahanRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + penjumlahanRekursif(n - 1); // Memanggil dirinya sendiri dengan nilai n - 1
        }
    }

    public static void main(String[] args) {
        int f = 8; // Nilai f yang ingin dihitung penjumlahannya
        int hasil = penjumlahanRekursif(f);
        
        System.out.print("Penjumlahan dari 1 sampai " + f + " adalah: ");
        for (int i = 1; i <= f; i++) {
            if (i < f) {
                System.out.print(i + "+");
            } else {
                System.out.print(i);
            }
        }
        System.out.println(" = " + hasil);
    }
}
