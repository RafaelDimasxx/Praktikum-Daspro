import java.util.Scanner;

public class Tugas2Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan: ");
        int jumPesan = input.nextInt();
        input.nextLine();
        String[] menu = new String[jumPesan];
        double[]hargaMenu = new double[jumPesan];
        int total = 0;

        for(int i = 0; i < jumPesan; i++) {
            System.out.print("Menu: ");
            menu[i] = input.nextLine();

            System.out.print("Harga menu: ");
            hargaMenu[i] = input.nextDouble();
            total += hargaMenu[i];
            
            input.nextLine();
        }
        System.out.println();
        for(int i = 0; i < jumPesan; i++) {
            System.out.println(menu[i] + " " + hargaMenu[i]);
        }
        System.out.println("TOTAL: " + total);

    }
}
