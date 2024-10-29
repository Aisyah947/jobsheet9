import java.util.Scanner;

public class KafeMenu17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", 
            "Mie Goreng", 
            "Roti Bakar", 
            "Kentang Goreng", 
            "Teh Tarik", 
            "Cappucino", 
            "Chocolate Ice"
        };

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = scanner.nextLine();

        boolean ditemukan = false;
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(makananDicari)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Makanan '" + makananDicari + "' tersedia di menu.");
        } else {
            System.out.println("Makanan '" + makananDicari + "' tidak ada di menu.");
        }

    }
}
