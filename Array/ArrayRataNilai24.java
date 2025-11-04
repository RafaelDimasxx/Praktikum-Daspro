import java.util.Scanner;
public class ArrayRataNilai24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa : ");
        int[] nilaiMahasiswa = new int[input.nextInt()];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int mhswLulus = 0;
        int mhswTidakLulus = 0;
        double rata2Lulus, rata2TidakLulus;
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke- " + (i + 1) + " : ");
            nilaiMahasiswa[i] = input.nextInt();
             
        }
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            if (nilaiMahasiswa[i] > 70) {
                totalLulus += nilaiMahasiswa[i];
                mhswLulus++;
            } else {
                totalTidakLulus += nilaiMahasiswa[i];
                mhswTidakLulus++;
            }
        }
        rata2Lulus = totalLulus / mhswLulus;
        rata2TidakLulus = totalTidakLulus / mhswTidakLulus;
        System.out.println("Nilai rata-rata mahasiswa lulus adalah : " + rata2Lulus);
        System.out.println("Nilai rata-rata mahasiswa tidak lulus adalah : " + rata2TidakLulus);
    }
}
