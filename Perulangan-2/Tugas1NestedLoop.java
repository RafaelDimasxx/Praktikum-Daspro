import java.util.Scanner;

public class Tugas1NestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i <= n; i++) {
            int jumlah = 0;
            int kuadrat = 0;
            System.out.print("n = " + i + " --> jumlah kuadrat = ");
            for(int j = 1; j <= i; j++) {
                kuadrat = j * j;
                jumlah += kuadrat;
                System.out.print(kuadrat);
                if (j < i) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + jumlah);
        
        }
    }
}
