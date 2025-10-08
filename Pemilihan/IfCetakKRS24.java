package Pemilihan;

import java.util.Scanner;

public class IfCetakKRS24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---CETAK KRS---");
        System.out.println("Apakah Anda sudah membayar UKT? (true/false)");
        boolean isUKT = input.nextBoolean();
        String pesan = (isUKT) ? "Registrasi berhasil! Silahkan cetak KRS dan minta tanda tangan DPA!" : "Registrasi ditolak, bayar UKT terlebih dahulu!";
        System.out.println(pesan);

    }
}
