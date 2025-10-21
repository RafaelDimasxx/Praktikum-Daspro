import java.util.Scanner;

public class KafeDoWhile24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        double hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        do {
            System.out.print("Masukkan nama pelanggan (batal untuk keluar): ");
            namaPelanggan = input.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi Dibatalkan");
                break;
            }
            System.out.print("Masukkan jumlah kopi: ");
            kopi = input.nextInt();
            System.out.print("Masukkan jumlah teh: ");
            teh = input.nextInt();
            System.out.print("Masukkan jumlah roti: ");
            roti = input.nextInt();
            double totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp. " + totalHarga);
            input.nextLine();
        } while (true);
        
        System.out.println("Transaksi Selesai");
    }
}