import java.util.Scanner;

public class CaseMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nilaiHuruf1 = "", nilaiHuruf2 = "", status1 = "", status2 = "", statusSemester = "";
        System.out.println("=== CEK KELULUSAN MAHASISWA ===");
        System.out.println("=== INPUT DATA ===");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("NIM: ");
        String nim = input.nextLine();
        System.out.println("--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS\t: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS\t: ");
        double nilaiUAS = input.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        double nilaiTugas = input.nextDouble();
        double nilaiAkhir = (nilaiUTS + nilaiUAS + nilaiTugas) / 3;
        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS\t: ");
        double nilaiUTS2 = input.nextDouble();
        System.out.print("Nilai UAS\t: ");
        double nilaiUAS2 = input.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        double nilaiTugas2 = input.nextDouble();
        double nilaiAkhir2 = (nilaiUTS2 + nilaiUAS2 + nilaiTugas2) / 3;
        double nilaiAkhirTotal = (nilaiAkhir + nilaiAkhir2) / 2;

        if (nilaiAkhir > 0 && nilaiAkhir <= 100) {
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf1 = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf1 = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf1 = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf1 = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf1 = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf1 = "D";
            } else {
                nilaiHuruf1 = "E";
            }
            if (nilaiAkhir >= 60) {
                status1 = "Lulus";
            } else {
                status1 = "Tidak Lulus";
            }
        }
        
        if (nilaiAkhir2 > 0 && nilaiAkhir2 <= 100) {
            if (nilaiAkhir2 > 80 && nilaiAkhir2 <= 100) {
                nilaiHuruf2 = "A";
            } else if (nilaiAkhir2 > 73 && nilaiAkhir2 <= 80) {
                nilaiHuruf2 = "B+";
            } else if (nilaiAkhir2 > 65 && nilaiAkhir2 <= 73) {
                nilaiHuruf2 = "B";
            } else if (nilaiAkhir2 > 60 && nilaiAkhir2 <= 65) {
                nilaiHuruf2 = "C+";
            } else if (nilaiAkhir2 > 50 && nilaiAkhir2 <= 60) {
                nilaiHuruf2 = "C";
            } else if (nilaiAkhir2 > 39 && nilaiAkhir2 <= 50) {
                nilaiHuruf2 = "D";
            } else {
                nilaiHuruf2 = "E";
            }
            if (nilaiAkhir2 >= 60) {
                status2 = "Lulus";
            } else {
                status2 = "Tidak Lulus";
            }
        }

        if (status1 == "Lulus" && status2 == "Lulus") {
            if (nilaiAkhirTotal >= 70) {
                statusSemester = "Lulus";
            } else {
                statusSemester = "Tidak Lulus";
            }
        } else {
            statusSemester = "Tidak Lulus";
        }

        System.out.println("======= HASIL AKADEMIK =======");
        System.out.printf("Nama: %s\n", nama);
        System.out.printf("NIM: %s\n", nim);
        System.out.println("");
        System.out.printf("%-10s\t %-8s\t %-8s\t %-8s\t %-8s\t %-8s\t %-8s\n", "Mata Kuliah", "Nilai UTS", "Nilai UAS", "Nilai Tugas",
                "Nilai Akhir", "Nilai Huruf", "Status");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s\t %-8.2f\t %-8.2f\t %-8.2f\t %-8.2f\t %-8s\t %-8s\n", "Matkul 1", nilaiUTS, nilaiUAS,
                nilaiTugas, nilaiAkhir, nilaiHuruf1, status1);
        System.out.printf("%-10s\t %-8.2f\t %-8.2f\t %-8.2f\t %-8.2f\t %-8s\t %-8s\n", "Matkul 2", nilaiUTS2, nilaiUAS2, nilaiTugas2,
                nilaiAkhir2, nilaiHuruf2, status2);
        System.out.println("");
        System.out.printf("Nilai Akhir Total: %-8.2f\n", nilaiAkhirTotal);
        System.out.printf("Status Semester: %s\n", statusSemester);


    }
}