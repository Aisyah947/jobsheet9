import java.util.Scanner;

public class ModifikasiSearchNilai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah elemen array
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int n = scanner.nextInt();
        
        // Inisialisasi array dengan panjang n
        int[] arrNilai = new int[n];

        // Input elemen array
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = scanner.nextInt();
        }

        // Input nilai yang ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = scanner.nextInt();
        int hasil = -1; // Default jika nilai tidak ditemukan

        // Mencari nilai dalam array
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i; // Menyimpan indeks jika ditemukan
                break; // Keluar dari loop jika ditemukan
            }
        }

        // Menampilkan hasil
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan dalam array.");
        }

        scanner.close(); // Menutup scanner
    }
}
