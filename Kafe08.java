import java.util.Scanner;

public class Kafe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;

        System.out.print("Masukkan Keanggotaan (true/false) : " );
        keanggotaan = sc.nextBoolean();
        System.out.print("Masukkan Jumlah Pembelian Kopi : ");
        jmlKopi = sc.nextInt();
        System.out.print("Masukkan Jumlah Pembelian Teh : ");
        jmlTeh = sc.nextInt();
        System.out.print("Masukkan Jumlah Pembelian Roti : ");
        jmlRoti = sc.nextInt();

        double totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh ) + (jmlRoti * hargaRoti);
        double nominalBayar;

        if (keanggotaan == true) {
            nominalBayar = totalHarga - (diskon * totalHarga); 
        } else {
            nominalBayar = totalHarga; 
        }

        System.out.println("Keanggotaan Pelanggan : " + keanggotaan);
        System.out.println("Item Pembelian : " + jmlKopi + " Kopi, " + jmlTeh + " Teh, " + jmlRoti + " Roti");
        System.out.println("Nominal Bayar Rp." + nominalBayar);
        
        sc.close();
    }     
}
