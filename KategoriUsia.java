import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usia = -1;

        while (true) {
            System.out.print("Masukkan usia Anda: ");
            if (scanner.hasNextInt()) {
                usia = scanner.nextInt();
                
                if (usia >= 0) {
                    break; 
                } else {
                    System.out.println("Usia harus berupa angka positif. Silakan coba lagi.");
                }
            } else {
                System.out.println("Input tidak valid. Masukkan angka.");
                scanner.next();  
            }
        }

        if (usia >= 0 && usia <= 12) {
            System.out.println("Kategori: Anak");
        } else if (usia >= 13 && usia <= 19) {
            System.out.println("Kategori: Remaja");
        } else if (usia >= 20 && usia <= 64) {
            System.out.println("Kategori: Dewasa");
        } else if (usia >= 65) {
            System.out.println("Kategori: Lansia");
        }

        scanner.close();
    }
}
