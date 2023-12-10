public class DeretDescendingRekursif {

    public static void deretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1); // Memanggil dirinya sendiri dengan nilai n - 1
        }
    }

    public static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int n = 10; // Ubah nilai n sesuai dengan keinginan Anda
        System.out.println("Menggunakan Rekursif:");
        deretDescendingRekursif(n);
        System.out.println("\n\nMenggunakan Iteratif:");
        deretDescendingIteratif(n);
    }
}
