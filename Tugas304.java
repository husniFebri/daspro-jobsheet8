import java.util.Scanner;

public class Tugas304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();
        
        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal harus 1.");
        } else {
            int totalBarangSeluruhToko = 0;
            int barangTerbanyak = -1;
            int tokoTerbanyak = 0;
            
            for (int i = 1; i <= jumlahToko; i++) {
                System.out.print("Masukkan jumlah pelanggan toko " + i + ": ");
                int jumlahPelanggan = sc.nextInt();
                int totalBarang = 0;

                for (int j = 1; j <= jumlahPelanggan; j++) {
                    System.out.print("Masukkan jumlah barang yang dibeli pelanggan ke-" + j + ": ");
                    int barangPelanggan = sc.nextInt();
                    
                    while (barangPelanggan < 0) {
                        System.out.print("! Jumlah barang tidak boleh negatif. Masukkan ulang: ");
                        barangPelanggan = sc.nextInt();
                    }    
                    totalBarang += barangPelanggan;
                }
                totalBarangSeluruhToko += totalBarang;
                if (totalBarang > barangTerbanyak) {
                    barangTerbanyak = totalBarang;
                    tokoTerbanyak = i;
                }
                System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarang);
            }
            
            System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        
        sc.close();
    }
}
