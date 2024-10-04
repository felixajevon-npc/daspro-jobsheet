import java.util.Scanner;

public class Pemilihan2Percobaan2_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu;
        String member, jenis_pmbayaran;
        double total_bayar, diskon, harga;

        while (true) {
            System.out.println("+---------------------------------------+");
            System.out.println("|============ MENU KAFE JTI ============|");
            System.out.println("+---------------------------------------+");
            System.out.println("|1. Kopi\t\t\t\t|");
            System.out.println("|2. Teh\t\t\t\t\t|");
            System.out.println("|3. Roti\t\t\t\t|");
            System.out.println("+---------------------------------------+");

            System.out.print("Masukkan Angka Dari Menu Yang Dipilih : ");
            menu = sc.nextInt();

            if (menu == 1 || menu == 2 || menu == 3) {
                break;
            } else {
                System.out.println("Menu Tidak Ada. Silakan pilih menu yang valid.");
            }
        }

        sc.nextLine();

        while (true) {
            System.out.print("Apakah Punya Member (y/n) ? : ");
            member = sc.nextLine();

            if (member.equalsIgnoreCase("y") || member.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Input tidak valid.");
            }
        }

        System.out.print("Jenis Pembayaran (Mendapat Potongan Jika Menggunakan Qris) : ");
        jenis_pmbayaran = sc.nextLine();

        if (jenis_pmbayaran.equalsIgnoreCase("qris")) {
            if (member.equalsIgnoreCase("y")) {
                diskon = 0.10;
                System.out.println("Besar Diskon = 10%");
                if (menu == 1) {
                    harga = 12000;
                    System.out.println("Harga Kopi : " + harga);
                } else if (menu == 2) {
                    harga = 7000;
                    System.out.println("Harga Teh : " + harga);
                } else if (menu == 3) {
                    harga = 20000;
                    System.out.println("Harga Roti : " + harga);
                } else {
                    System.out.println("Menu Tidak Ada");
                    return;
                }

                total_bayar = harga - (harga * diskon) - 1000;
                System.out.println("Anda Mendapat Potongan Rp.1.000");
                System.out.println("Total Bayar Setelah Diskon Dan Potongan : " + total_bayar);

            } else if (member.equalsIgnoreCase("n")) {
                if (menu == 1) {
                    harga = 12000;
                    System.out.println("Harga Kopi : " + harga);
                } else if (menu == 2) {
                    harga = 7000;
                    System.out.println("Harga Teh : " + harga);
                } else if (menu == 3) {
                    harga = 20000;
                    System.out.println("Harga Roti : " + harga);
                } else {
                    System.out.println("Menu Tidak Ada");
                    return;
                }

                total_bayar = harga - 1000;
                System.out.println("Anda Mendapat Potongan Rp.1.000");
                System.out.println("Total Bayar Setelah Diskon Dan Potongan : " + total_bayar);
            }
        } else {
            if (member.equalsIgnoreCase("y")) {
                diskon = 0.10;
                System.out.println("Besar Diskon = 10%");
                if (menu == 1) {
                    harga = 12000;
                    System.out.println("Harga Kopi : " + harga);
                } else if (menu == 2) {
                    harga = 7000;
                    System.out.println("Harga Teh : " + harga);
                } else if (menu == 3) {
                    harga = 20000;
                    System.out.println("Harga Roti : " + harga);
                } else {
                    System.out.println("Menu Tidak Ada");
                    return;
                }

                total_bayar = harga - (harga * diskon);
                System.out.println("Total Bayar Setelah Diskon : " + total_bayar);

            } else if (member.equalsIgnoreCase("n")) {
                if (menu == 1) {
                    harga = 12000;
                    System.out.println("Harga Kopi : " + harga);
                } else if (menu == 2) {
                    harga = 7000;
                    System.out.println("Harga Teh : " + harga);
                } else if (menu == 3) {
                    harga = 20000;
                    System.out.println("Harga Roti : " + harga);
                } else {
                    System.out.println("Menu Tidak Ada");
                    return;
                }

                total_bayar = harga;
                System.out.println("Total Bayar Setelah Diskon : " + total_bayar);
            }
        }

    }
}
