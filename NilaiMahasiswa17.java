import java.util.Scanner;

public class NilaiMahasiswa17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlahNilai = scanner.nextInt();
        int[] nilaiMahasiswa = new int[jumlahNilai];

        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        double total = 0;
        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];
        
        for (int nilai : nilaiMahasiswa) {
            total += nilai;
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }
        
        double rataRata = total / jumlahNilai;
        
        System.out.printf("\nRata-rata nilai: %.2f%n", rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

        System.out.println("\n--- Hasil ---");
        System.out.print("Nilai yang dimasukkan: ");
        for (int nilai : nilaiMahasiswa) {
            System.out.print(nilai + " ");
        }
        
    }
}
