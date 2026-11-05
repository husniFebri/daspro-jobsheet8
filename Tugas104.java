import java.util.*;

public class Tugas104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ;
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();
        
        int angka = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
                angka++;
            }
            System.out.println();
        }
        System.out.println("Total angka tercetak: " + angka);
    
        sc.close();
    }


}
