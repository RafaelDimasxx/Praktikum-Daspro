import java.util.Scanner;

public class NilaiKelompok24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        float totalNilai, rataNilai, rataTertinggi = 0;
        int kelompokTertinggi = 0;
        int i = 1;
        while(i <= 6) {
            totalNilai = 0;
            System.out.println("\nKelompok " + i);
            for(int j = 1; j <=5; j++) {
                System.out.print("Nilai dari kelompok penilai " + j + " : ");
                nilai = input.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("==== Rata-rata nilai kelompok " + i + " adalah " + rataNilai + " ====");
            if(rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
            i++;
        }
        System.out.println("\nKelompok dengan rata-rata tertinggi: Kelompok " + kelompokTertinggi +
                " dengan rata-rata " + rataTertinggi);
    }
}
