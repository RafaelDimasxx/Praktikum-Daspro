import java.util.Scanner;
public class ArrayRataNilai24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiMahasiswa = new int[10];
        double total = 0;
        double rata2;
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke- " + (i + 1) + " : ");
            nilaiMahasiswa[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
        }
        rata2 = total / nilaiMahasiswa.length;
        System.out.println("Nilai rata-rata adalah : " + rata2);
    }
}
