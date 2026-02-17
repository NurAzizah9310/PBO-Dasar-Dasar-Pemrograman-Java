import java.util.Scanner;

public class No1_NurAzizahSantoso_Ganjil {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama: ");
        int a = input.nextInt();
        
        System.out.print("Masukkan bilangan kedua: ");
        int b = input.nextInt();
        
        System.out.print("Masukkan bilangan ketiga: ");
        int c = input.nextInt();
        
        int jumlah = a + b + c;
        int kurang = a - b - c;
        int kali = a * b * c;
        double bagi = (double)a / b / c;
        
        System.out.println("\nHasil Penjumlahan: " + jumlah);
        System.out.println("Hasil Pengurangan: " + kurang);
        System.out.println("Hasil Perkalian: " + kali);
        System.out.printf("Hasil Pembagian: %.3f", bagi);
        
        input.close();
    }
}
