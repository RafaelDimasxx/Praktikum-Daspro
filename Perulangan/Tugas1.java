import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hargaTiket = 50000, diskon, totalPenjualan = 0, totalHarga;
        int jumlahTiket, tiketTerjual = 0;
        do {
            System.out.println("Masukkan jumlah tiket: ");
            jumlahTiket = input.nextInt();
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, mohon input ulang!");
                continue;
            } 
        
            if (jumlahTiket > 4) {
                diskon = hargaTiket * 0.10;
            } else if (jumlahTiket > 10) {
                diskon = hargaTiket * 0.15;
            } else {
                diskon = 0;
            }
            totalHarga = (hargaTiket * jumlahTiket) - diskon;
            totalPenjualan += totalHarga;
            tiketTerjual += jumlahTiket;
        } while(jumlahTiket != 0);
        
        System.out.println("Total penjualan: " + totalPenjualan);
        System.out.println("Total tiket terjual: " + tiketTerjual);
    }
}
