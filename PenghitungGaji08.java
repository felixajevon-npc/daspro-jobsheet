import java.util.Scanner;

public class PenghitungGaji08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jmlJamKerja, gajiPerJam;

        System.out.print("Masukkan Jam Kerja Anda : ");
        jmlJamKerja = sc.nextDouble();

        System.out.print("Masukkan Gaji Anda : ");
        gajiPerJam = sc.nextDouble();

        double gajiKotor = jmlJamKerja * gajiPerJam;
        double bonus = gajiKotor * 0.10;
        double gajiSebelumPajak = gajiKotor + bonus;

        double pajak = gajiSebelumPajak * 0.05;
        double gajiTotal = gajiSebelumPajak - pajak;

        System.out.println("Total Gaji Anda Adalah : Rp." + gajiTotal );
    }
}
