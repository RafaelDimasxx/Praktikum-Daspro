import java.util.Scanner;

public class WifiKampus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String statusAkademik;
        int sks;

        System.out.println("---POLINEMA HOTSPOT---");
        System.out.println("Apa Status Akademik Anda? (Dosen/Mahasiswa)");
        statusAkademik = input.nextLine();

        if (statusAkademik.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses Wifi Diberikan (Dosen)");
        } else if (statusAkademik.equalsIgnoreCase("Mahasiswa")) {
            System.out.println("Berapa jumlah SKS yang anda ambil?");
            sks = input.nextInt();
            if (sks >= 12) {
                System.out.println("Akses Wifi Diberikan (Mahasiswa)");
            } else {
                System.out.println("Akses Wifi Tidak Diberikan");
            }
        } else {
            System.out.println("Akses Wifi Tidak Diberikan");
        }
    }
}
