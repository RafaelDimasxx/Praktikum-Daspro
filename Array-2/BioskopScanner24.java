import java.util.Scanner;

public class BioskopScanner24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        String[][]penonton = new String[4][2];
        
        
        while (true) {
            System.out.println("======= MENU BIOSKOP =======");
            System.out.println("Input data penonton (1)");
            System.out.println("Tampilkan Daftar Penonton (2)");
            System.out.println("Exit (3)");
            menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                   do {
                    System.out.print("Masukkan nama: ");
                    nama = input.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = input.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = input.nextInt();
                    input.nextLine();
                    
                    if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Kursi sudah ditempati. Pilih kursi yang lain!");
                        continue;
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                    }
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = input.nextLine();
                    
                    if (next.equalsIgnoreCase("y")) {
                        continue;
                    } else {
                        break;
                    }
                   } while (true);
                case 2: 
                    for(int i = 0; i < penonton.length; i++){
                        for(int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                penonton[i][j] = "****";
                            }
                        }
                        System.out.println(String.join(", ", penonton[i]));
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih");
                    System.exit(0);
                default:
                    break;
            }
        }
        
            
        
    }
}
