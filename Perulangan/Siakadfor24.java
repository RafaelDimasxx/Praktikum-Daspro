import java.util.Scanner;

public class Siakadfor24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        for(int i = 1; i <=10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i);
            nilai = input.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
                
            } else if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}