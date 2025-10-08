package Pemilihan;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("angka genap");
        } else {
            System.out.println("angka ganjil");
        }
    }
}
