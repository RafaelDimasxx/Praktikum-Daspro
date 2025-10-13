import java.util.Scanner;

public class SwitchCetakKRS24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---CETAK KRS---");
        System.out.print("Masukkan Semester Saat Ini! ");
        int semester = input.nextInt();
        
        switch (semester) {
            case 1:
                System.out.println("KRS SEMESTER 1");
                break;
            case 2:
                System.out.println("KRS SEMESTER 2");
                break;
            case 3:
                System.out.println("KRS SEMESTER 3");
                break;
            case 4:
                System.out.println("KRS SEMESTER 4");
                break;
            case 5:
                System.out.println("KRS SEMESTER 5");
                break;
            case 6:
                System.out.println("KRS SEMESTER 6");
                break;
            case 7:
                System.out.println("KRS SEMESTER 7");
                break;
            case 8:
                System.out.println("KRS SEMESTER 8");
                break;
            default:
                System.out.println("Semester Tidak Valid");
                break;
        }
    }
}
