package Jobsheet13;
import java.util.Scanner;

public class NilaiMahasiswa {

    static int jumlahMahasiswa;
    static int jumlahTugas;

    static int JUMLAH_MAHASISWA = 5;
    static int JUMLAH_HARI = 7;

    static int[][] nilaiMahasiswa;
    static String[] namaMahasiswa;

    // Fungsi untuk meninputkan data nilai dan nama mahasiswa
    public static void inputDataMahasiswa() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Membersihkan new line

        System.out.print("Masukkan jumlah tugas: ");
        jumlahTugas = scanner.nextInt();
        scanner.nextLine(); // Membersihkan new line

        nilaiMahasiswa = new int[jumlahMahasiswa][jumlahTugas];
        namaMahasiswa = new String[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();
        
            System.out.println("Masukkan nilai mahasiswa " + namaMahasiswa[i]);
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Nilai pada tugas ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); // Membersihkan new line
        }        

        scanner.close();
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa dari minggu pertama sampai ketujuh
    public static void tampilkanNilaiMahasiswa() {
        System.out.println("\nNilai Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa: " + namaMahasiswa[i]);
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.println("Tugas ke-" + (j + 1) + ": " + nilaiMahasiswa[i][j]);
            }
            System.out.println();
        }
    }

     // Fungsi untuk mencari pada hari keberapakah terdapat nilai tertinggi dibanding hari lain dari keseluruhan mahasiswa
     public static void cariTugasNilaiTertinggi() {
        int[] totalNilaiPerTugas = new int[jumlahTugas];
    
        // Menghitung total nilai per tugas dari semua mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahTugas; j++) {
                totalNilaiPerTugas[j] += nilaiMahasiswa[i][j];
            }
        }
    
        // Mencari tugas dengan nilai tertinggi
        int tugasNilaiTertinggi = 0;
        int nilaiTertinggi = totalNilaiPerTugas[0];
        for (int i = 1; i < jumlahTugas; i++) {
            if (totalNilaiPerTugas[i] > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiPerTugas[i];
                tugasNilaiTertinggi = i;
            }
        }
    
        System.out.println("Tugas dengan nilai tertinggi adalah tugas ke-" + (tugasNilaiTertinggi + 1));
    }
    
    // Fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi
    public static void tampilkanMahasiswaNilaiTertinggi() {
        int nilaiTertinggi = 0;
        int indexMahasiswa = 0;
        int tugasNilaiTertinggi = 0;
    
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahTugas; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    indexMahasiswa = i;
                    tugasNilaiTertinggi = j;
                }
            }
        }
    
        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + namaMahasiswa[indexMahasiswa] +
                " pada tugas ke-" + (tugasNilaiTertinggi + 1) + " dengan nilai " + nilaiTertinggi);
    }

    public static void main(String[] args) {
        inputDataMahasiswa();
        tampilkanNilaiMahasiswa();
        cariTugasNilaiTertinggi();
        tampilkanMahasiswaNilaiTertinggi();
    }
}
