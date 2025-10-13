import java.util.Scanner;

public class IfElseCetakKRS24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---CETAK KRS---");
        System.out.print("Masukkan Semester Saat Ini! ");
        int semester = input.nextInt();
        
        if (semester == 1) {
            System.out.println("KRS SEMESTER 1");
        } else if (semester == 2) {
            System.out.println("KRS SEMESTER 2");
        } else if (semester == 3) {
            System.out.println("KRS SEMESTER 3");
        } else if (semester == 4) {
            System.out.println("KRS SEMESTER 4");
        } else if (semester == 5) {
            System.out.println("KRS SEMESTER 5");
        } else if (semester == 6) {
            System.out.println("KRS SEMESTER 6");
        } else if (semester == 7) {
            System.out.println("KRS SEMESTER 7");
        } else if (semester == 8) {
            System.out.println("KRS SEMESTER 8");
        } else {
            System.out.println("Semester Tidak Valid");
        }
    }
}

