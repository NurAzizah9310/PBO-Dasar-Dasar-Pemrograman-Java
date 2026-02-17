import java.util.Scanner;

public class No2_NurAzizahSantoso_Ganjil {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah uang: ");
        int uang = input.nextInt();
        
        input.nextLine();
        
        System.out.print("Apakah sedang hujan? (ya/tidak): ");
        String kondisi = input.nextLine();
        
        boolean hujan = kondisi.equalsIgnoreCase("ya");
        
        if ((uang > 5000) && (!hujan)) {
            System.out.println("Pergi beli gorengan! Letsssgooo");
        } else {
            System.out.println("Gagal beli gorengan, mending bobo");
        }
        
        input.close();
    }
}
