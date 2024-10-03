import java.util.Scanner;

public class Pemilihan2Percobaan3_08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String kategori;
        double pajak, penghasilan, gajiBersih;

        while (true) {
            System.out.print("Masukan Kategori : ");
            kategori = sc.nextLine();

            if (kategori.equalsIgnoreCase("pebisnis") || kategori.equalsIgnoreCase("pekerja")) {
                break;
            } else {
                System.out.println("Input Tidak Valid.");
            }
        }
        System.out.print("Masukkan Penghasilan Anda : ");
        penghasilan = sc.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan >= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Pajak Yang Anda Dapat Sebesar : " + pajak);
            System.out.println("Pajak Dalam Persen : " + (pajak * 100) + "%");
            System.out.println("Penghasilan Bersih : " + gajiBersih);
        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Pajak Yang Anda Dapat Sebesar : " + pajak);
            System.out.println("Pajak Dalam Persen : " + (pajak * 100) + "%");
            System.out.println("Penghasilan Bersih : " + gajiBersih);
        } else {
            System.out.println("Kategori Salah");
        }
    }
}
