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
    public static int hitungTotalHarga(int pilihanMenu[], int banyakItem[], double diskon) {
        int[] hargaItems = {15000, 20000, 25000, 15000, 20000, 25000};
        int totalHargaAwal = 0;
        for (int i = 0; i < pilihanMenu.length; i++) {
            totalHargaAwal += hargaItems[pilihanMenu[i] - 1] * banyakItem[i];
        }
        double potongan = totalHargaAwal * diskon;
        int totalHarga = (int) (totalHargaAwal - potongan);
        return totalHarga;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu("Rafael", true);
        System.out.println("Berapa menu yang ingin anda pesan?");
        int menu = input.nextInt();
        int[] banyakItem = new int[menu];
        int[] pilihanMenu = new int[menu]; 
        for(int i = 0; i < banyakItem.length; i++) {
            System.out.print("Masukkan angka menu ke-" + (i + 1) + " yang ingin anda pesan: ");
            pilihanMenu[i] = input.nextInt();
            System.out.println("Masukkan jumlah item yang ingin anda pesan! ");
            banyakItem[i] = input.nextInt();
        }
            
        input.nextLine();
        System.out.print("Kode promo: ");
        String kodePromo = input.nextLine();
        double diskon = 0;
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = 0.5;
            System.out.println("Selamat anda mendapat diskon 50%");
        } else if(kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = 0.3;
            System.out.println("Selamat anda mendapat diskon 30%");
        } else {
            System.out.println("Kode promo tidak valid");
        }
        

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, diskon);
        System.out.println("Total harga: Rp." + totalHarga);
    }
}