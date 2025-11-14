import java.util.Scanner;
public class Tugas3Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] menu = {
                "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };
        String makanan = "";
        String makananFix = "";
        String next = "";
        do {
            System.out.println("Mau pesan apa? ");
            makanan = input.nextLine();
            
        for(int i = 0; i < menu.length; i++) {
            if (makanan.equalsIgnoreCase(menu[i])) {
                makananFix = menu[i];
                break;
            } else {
                makananFix = "";
            }
        }
        if (makananFix != "") {
            System.out.println(makananFix + " ada."); 
            
        } else {
            System.out.println("Menu tidak tersedia.");
        }
        
        System.out.println("Ada lagi?(y/n)");
        next = input.nextLine();
        } while (next.equalsIgnoreCase("y"));
        System.out.println("===== SAMPAI JUMPA KEMBALI =====");
        
}
}
