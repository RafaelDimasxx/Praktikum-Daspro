import java.util.Scanner;
public class Tugas3NestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cabang, pelanggan, totalAkhirPelanggan = 0, totalItemTerjual = 0;
        System.out.print("Masukkan jumlah cabang: ");
        cabang = input.nextInt();
        System.out.println("========== MASUKKAN PENJUALAN PER-CABANG CAFE ==========");
        for(int i = 1; i <= cabang; i++) {
            System.out.println("---- Cabang " + i + " ----");
            System.out.print("Masukkan jumlah pelanggan: ");
            pelanggan = input.nextInt();
            int jumlahItem = 0;
            int jumlahItemTerjual = 0;
            
            for(int j = 1; j <= pelanggan; j++) {
                System.out.print("Masukkan jumlah item" + j + " : ");
                jumlahItem = input.nextInt();
                jumlahItemTerjual += jumlahItem;
            }
            
            System.out.println("Cabang " + i + " : ");
            System.out.println("Pelanggan: " + pelanggan);
            System.out.println("Jumlah item terjual: " + jumlahItemTerjual);
            totalAkhirPelanggan += pelanggan;
            totalItemTerjual += jumlahItemTerjual;
        }
        System.out.println("Total Seluruh Cabang: ");
        System.out.println("Pelanggan: " + totalAkhirPelanggan);
        System.out.println("Jumlah item terjual: " + totalItemTerjual);
    }
}
