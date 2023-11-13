import java.util.Scanner;

public class uts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Daftar Penjualan Kosmetik");
        System.out.println("1. Lipstik");
        System.out.println("2. Bedak");
        System.out.println("3. Maskara");
        System.out.println("4. Eyeliner");
        System.out.println("5. Blush on");
        System.out.println("6. Foundation");
        System.out.println("7. Eyeshadow");
        System.out.println("8. Pensil Alis");
        System.out.println("9. Make-up Remover");
        System.out.println("10. Pelembab");

        System.out.print("Masukkan nomor kosmetik yang ingin dibeli: ");
        int nomorKosmetik = scanner.nextInt();

        double harga;

        if (nomorKosmetik == 1) {
            harga = 50.0;
        } else if (nomorKosmetik == 2) {
            harga = 30.0;
        } else if (nomorKosmetik == 3) {
            harga = 40.0;
        } else if (nomorKosmetik == 4) {
            harga = 25.0;
        } else if (nomorKosmetik == 5) {
            harga = 35.0;
        } else if (nomorKosmetik == 6) {
            harga = 60.0;
        } else if (nomorKosmetik == 7) {
            harga = 45.0;
        } else if (nomorKosmetik == 8) {
            harga = 20.0;
        } else if (nomorKosmetik == 9) {
            harga = 15.0;
        } else if (nomorKosmetik == 10) {
            harga = 25.0;
        } else {
            System.out.println("Nomor kosmetik tidak valid.");
            return;
        }

        System.out.println("Harga kosmetik yang dipilih: $" + harga);

        scanner.close();
    }
}
