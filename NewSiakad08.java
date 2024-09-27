import java.util.Scanner;

public class NewSiakad08{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nama, nim, grade = " ", kualifikasi = " ";
        char kelas; 
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan Nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan Nomor Absen : ");
        absen = sc.nextByte();
        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Ujian : ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        if (nilaiAkhir > 80.0 && nilaiAkhir <= 100.0) {
            grade = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73.0 && nilaiAkhir <= 80.0) {
            grade = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65.0 && nilaiAkhir <= 73.0) {
            grade = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60.0 && nilaiAkhir <= 65.0) {
            grade = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50.0 && nilaiAkhir <= 60.0) {
            grade = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39.0 && nilaiAkhir <= 50.0) {
            grade = "D";
            kualifikasi = "Kurang";
        } else if (nilaiAkhir <= 39.0) {
            grade = "E";
            kualifikasi = "Gagal";
        }

        System.out.println("Nama : " + nama + "NIM : " + nim);
        System.out.println("Kelas : " + kelas + "Absen : " + absen);
        System.out.println("Mahasiswa Dengan Nama " + nama + " (NIM " + nim + ") Kelas " + kelas + " Nomor Absen " + absen);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Akhir Huruf : " + grade);
        System.out.println("Kualifikasi : " + kualifikasi);

    }
}