package Pemilihan;

import java.util.Scanner;

public class IfCetakKRS24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---CETAK KRS---");
        System.out.println("Apakah Anda sudah membayar UKT? (true/false)");
        boolean isUKT = input.nextBoolean();
        if (isUKT) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA!");
        } else {
            System.out.println("Registrasi ditolak, bayar UKT terlebih dahulu!");
        }
        
    }
}
