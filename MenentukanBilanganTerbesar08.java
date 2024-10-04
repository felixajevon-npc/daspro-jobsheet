import java.util.Scanner;

public class MenentukanBilanganTerbesar08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2, bil3;

        System.out.print("Masukkan Bilangan Pertama : ");
        bil1 = sc.nextInt();
        System.out.print("Masukkan Bilangan Kedua : ");
        bil2 = sc.nextInt();
        System.out.print("Masukkan Bilangan Ketiga : ");
        bil3 = sc.nextInt();

        int max = bil3;

        if (bil1 > max) {
            max = bil1;
        }

        if (bil2 > max) {
            max = bil2;
        }

        System.out.println("Bilangan Terbesar Adalah " + max);
    }
}
