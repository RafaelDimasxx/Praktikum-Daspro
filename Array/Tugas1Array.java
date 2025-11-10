import java.util.Scanner;
public class Tugas1Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rata2, nilaiTotal = 0, nilaiTertinggi = 0, nilaiTerendah = 100;
        System.out.print("Berapa nilai yang ingin anda input? ");
        int[] nilaiMhsw = new int[input.nextInt()];
        for(int i = 0; i < nilaiMhsw.length; i++) {
            System.out.print("Masukkan Nilai mahasiswa ke- " + (i+1) + " : ");
            nilaiMhsw[i] = input.nextInt();
            nilaiTotal += nilaiMhsw[i];
            if (nilaiMhsw[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhsw[i];
            }
            if (nilaiMhsw[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhsw[i];
            }
        }
        rata2 = nilaiTotal / nilaiMhsw.length;
        System.out.println("Seluruh nilai mahasiswa: ");
        for(int i = 0; i < nilaiMhsw.length; i++) {
            System.out.print(nilaiMhsw[i] + ", ");
            
        }
        System.out.println();
        System.out.println("Nilai tertinggi seluruh mahasiswa: " + nilaiTertinggi);
        System.out.println("Nilai terendah seluruh mahasiswa: " + nilaiTerendah);
        System.out.println("Rata-rata seluruh mahasiswa: " + rata2);
    }
}
