import java.util.*;

public class Tugas204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        
        if (n < 3) {
            System.out.println("Nilai n minimal harus 3.");
        } else {
            int jumlahAngka = 0;
            
            for (int i = 1; i <= n; i++) {
                
                for (int j = 1; j <= n; j++) {
                    int hasil = i * j;
                    System.out.printf("%4d", hasil);                
                    jumlahAngka += hasil;
                }
                System.out.println();
            }
            System.out.println("Jumlah seluruh angka: " + jumlahAngka);
        }
        
        sc.close();
    }
}
