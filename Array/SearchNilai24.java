import java.util.Scanner;

public class SearchNilai24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak nilai yang akan diinput! ");
        int[] arrNilai = new int[input.nextInt()];
        int key = 0;
        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
            arrNilai[i] = input.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari! ");
        key = input.nextInt();
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i + 1;
                
                break;
            } else {
                
            }
        }
        if (hasil == 0) {
            System.out.println("Nilai yang dicari tidak ditemukan");
        } else {
            System.out.println("Nilai " + key + " milik mahasiswa ke-" + hasil);
        }
    }
}
