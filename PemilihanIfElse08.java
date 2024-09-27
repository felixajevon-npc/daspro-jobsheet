import java.util.Scanner;

public class PemilihanIfElse08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukkan Angka 1: ");
        angka1 = sc.nextDouble();

        System.out.print("Masukkan Angka 2: ");
        angka2 = sc.nextDouble();

        System.out.print("Masukkan Operator (+ - * :) : ");
        operator = sc.next().charAt(0);

        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == ':') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Error: Pembagi tidak boleh nol.");
                return; 
            }
        } else {
            System.out.println("Error: Operator yang dimasukkan tidak valid.");
        }

        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}
