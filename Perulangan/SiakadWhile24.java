import java.util.Scanner;

public class SiakadWhile24 {
    public static void main(String[] args) {
        double nilai;
        int jmlMhsw, i = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa");
        jmlMhsw = input.nextInt();
        while (i < jmlMhsw) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i+1));
            nilai = input.nextDouble();
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid, masukkan nilai lagi! ");
                continue;
            } 
            if (nilai > 80 && nilai <=100) {
                System.out.println("Nilai A");
                System.out.println("Bagus, pertahankan nilainya");
            } else if (nilai > 73 && nilai <=80) {
                System.out.println("Nilai B+");
            } else if (nilai > 65 && nilai <=73) {
                System.out.println("Nilai B");
            } else if (nilai > 60 && nilai <=65) {
                System.out.println("Nilai C+");
            } else if (nilai > 50 && nilai <=60) {
                System.out.println("Nilai C");
            } else if (nilai > 39 && nilai <=50) {
                System.out.println("Nilai D");
            } else {
                System.out.println("Nilai E");
            }
            i++;
        }
    }
}
