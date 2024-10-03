import java.util.Scanner;

public class Pemilihan2Percobaan215Modif1 {
    
    public static void main(String[] args) {
        
        int pilihan_menu, harga;
        double diskon, total_bayar, total_qris;
        String member, qris;

        Scanner input15 = new Scanner(System.in);

        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("-----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input15.nextInt();
        input15.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input15.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl: " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea: " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling: " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon: " + total_bayar);

            System.out.print("Apakah Anda akan menggunakan QRIS (y/n) ? = ");
            qris = input15.nextLine();

            if (qris.equalsIgnoreCase("y")) {
                total_qris = total_bayar - 1000;
                System.out.println("Harga yang perlu Anda bayar sekarang adalah: " + total_qris);
            } else if (qris.equalsIgnoreCase("n")) {
                System.out.println("Terima kasih sudah berbelanja");
            } else {
                System.out.println("Masukkan opsi qris dengan benar");
            }

        } else if (member.equalsIgnoreCase("n")) {

            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl: " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea: " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling: " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            System.out.println("Total bayar: " + harga);

            System.out.print("Apakah Anda akan menggunakan QRIS (y/n) ? = ");
            qris = input15.nextLine();

            if (qris.equalsIgnoreCase("y")) {
                total_qris = harga - 1000;
                System.out.println("Harga yang perlu Anda bayar sekarang adalah: " + total_qris);
            } else if (qris.equalsIgnoreCase("n")) {
                System.out.println("Terima kasih sudah berbelanja");
            } else {
                System.out.println("Masukkan opsi qris dengan benar");
            }

        } else {
            System.out.println("Member tidak valid");
        }

        System.out.println("--------------------------------------");
    }
}