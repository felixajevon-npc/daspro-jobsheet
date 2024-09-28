import java.util.Scanner;

public class SistemParkir {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double lamaParkir;
        String kendaraan;
        double biaya = 0;

        System.out.print("Jenis Kendaraan Anda : ");
        kendaraan = sc.nextLine();

        String lowerCaseKendaraan = kendaraan.toLowerCase();

        System.out.print("Lama Parkir Kendaraan : ");
        lamaParkir = sc.nextDouble();


        switch (lowerCaseKendaraan) {
            case "mobil":
                biaya = lamaParkir * 5000;
                break;
            case "motor":
                biaya = lamaParkir * 3000;
                break;
    
            default:
                break;
        }

        System.out.println("Biaya parkir Anda selama " + lamaParkir + " jam untuk " + lowerCaseKendaraan + " adalah Rp " + biaya);

    }
}
