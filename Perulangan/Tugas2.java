import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        int jenis, durasi, total = 0;
        Scanner input = new Scanner(System.in);
        
        do{
        System.out.println("Masukkan Jenis Kendaraan (1 = Mobil, 2 = Motor, 0 = Keluar): ");
        jenis = input.nextInt();
        if (jenis == 1 || jenis == 2) {
           System.out.println("Masukkan Durasi (jam): ");
           durasi = input.nextInt();
           if (durasi > 5) {
               total += durasi * 12500;
           } else if (jenis == 1) {
               total += durasi * 3000;
           } else if (jenis == 2) {
               total += durasi * 2000;
           } else {
               break;
           }
           
        } else if (jenis == 0) {
            break;
        } else {
            System.out.println("Jenis Kendaraan Tidak Valid, Input Ulang!");
            continue;
        }
        } while (jenis != 0);
        System.out.println("Total Parkir: Rp. " + total);
    }
}
