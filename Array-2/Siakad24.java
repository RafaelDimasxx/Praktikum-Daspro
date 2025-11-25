import java.util.Scanner;

public class Siakad24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah Mahasiswa dan Mata Kuliah: ");
        int jmlMahasiswa = input.nextInt();
        int jmlMatkul = input.nextInt();
        int[][] nilai = new int[jmlMahasiswa][jmlMatkul];
        for(int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;
            for(int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai matakuliah " + (j+1) + ": ");
                nilai[i][j] = input.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerSiswa/nilai[i].length);
        }
        System.out.println("===================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");

        for (int j = 0; j < jmlMatkul; j++) {
            double totalPerMatkul = 0;

            for(int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j +1) + " : " + totalPerMatkul/nilai.length);
        }

    }
}
