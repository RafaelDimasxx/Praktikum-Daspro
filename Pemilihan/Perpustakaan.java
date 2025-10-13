import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean bawaKTM;
        boolean registOnline;

        System.out.println("Apakah Anda membawa KTM? (true/false)");
        bawaKTM = input.nextBoolean();

        if (bawaKTM) {
            System.out.println("Selamat Datang");
        } else {
            System.out.println("Apakah Anda sudah mendaftar online? (true/false)");
            registOnline = input.nextBoolean();
            if (registOnline) {
                System.out.println("Selamat Datang");
            } else {
                System.out.println("Mohon membawa KTM atau lakukan registrasi online dahulu!");
            }
        }
    }
}
