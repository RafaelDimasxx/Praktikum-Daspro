import java.util.Scanner;

public class Kafe24 {
    public static void Menu(String namaPelanggan, boolean isMember) {
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
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 25000, 15000, 20000, 25000};
        int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;
        return totalHarga;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu("Rafael", true);
        System.out.println("Masukkan nomor menu yang ingin anda pesan! ");
        int pilihanMenu = input.nextInt();
        System.out.println("Masukkan jumlah item yang ingin anda pesan! ");
        int banyakItem = input.nextInt();
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
        System.out.println("Total harga: Rp." + totalHarga);
    }
}