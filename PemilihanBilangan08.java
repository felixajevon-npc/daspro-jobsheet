import java.util.Scanner;

public class PemilihanBilangan08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Sebuah Angka : ");
        int angka = sc.nextInt();

        System.out.println("Angka " + angka + (angka % 2 == 0 ? " Termasuk Bilangan Genap" : " Termasuk Bilangan Ganjil"));

    }
}
