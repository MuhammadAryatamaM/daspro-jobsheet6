import java.util.Scanner;

public class DiskonBuku15 {
    
    public static void main(String[] args) {
    
        Scanner input15 = new Scanner(System.in);

        String jenisBuku, hari;
        double diskon;
        int jmlBeli;

        System.out.print("Masukkan hari ini: ");
        hari = input15.nextLine();
        System.out.print("Buku apa yang ingin dibeli? (kamus/novel/lainnya): ");
        jenisBuku = input15.nextLine();
        System.out.print("Berapa jumlah buku yang dibeli? : ");
        jmlBeli = input15.nextInt();

        if (hari.equalsIgnoreCase("rabu")) {
            if (jenisBuku.equalsIgnoreCase("kamus")) {
                if (jmlBeli > 2) {
                    diskon = 0.118;
                } else {
                    diskon = 0.1;
                }
                System.out.println("Diskon akhir yang anda dapatkan sebesar " + diskon);

            } else if (jenisBuku.equalsIgnoreCase("novel")){
                if (jmlBeli > 3) {
                    diskon = 0.0886;
                } else {
                    diskon = 0.0793;
                }
                System.out.println("Diskon akhir yang anda dapatkan sebesar " + diskon);
                
            } else if ((!jenisBuku.equalsIgnoreCase("kamus")) && (!jenisBuku.equalsIgnoreCase("novel"))) {
                if (jmlBeli > 3) {
                    diskon = 0.05;
                } else {
                    diskon = 0;
                } 
                System.out.println("Diskon akhir yang anda dapatkan sebesar " + diskon);
            }
        } else {
            diskon = 0;
            System.out.println("Diskon akhir yang anda dapatkan sebesar " + diskon);
        }
    }
}