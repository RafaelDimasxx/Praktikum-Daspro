import java.util.Scanner;

public class Kafe24 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelanggan);
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan potongan harga 10% disetiap pembelian!");
        }

        System.out.println("==== Menu Resto Kafe ====");
        System.out.println("1. Kopi Hitam - Rp.15.000 ");
        System.out.println("2. Cappuchino - Rp.20.000 ");
        System.out.println("3. Latte - Rp.25.000 ");
        System.out.println("4. Teh Tarik - Rp.15.000 ");
        System.out.println("5. Roti Bakar - Rp.20.000 ");
        System.out.println("6. Mie Goreng - Rp.25.000 ");
        System.out.println("================================");
        System.out.println("Silahkan pilih menu yang anda inginkan!");

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Selamat anda mendapat diskon 50%");
        } else if(kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Selamat anda mendapat diskon 30%");
        } else {
            System.out.println("Kode promo tidak valid");
        }
    }
   
    
    public static void main(String[] args) {
        Menu("Budi", true, "DISKON30");
    }
}