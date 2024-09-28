import java.util.Scanner;

public class LatihanIndividu4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan usia Anda: ");
        int usia = scanner.nextInt();

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
