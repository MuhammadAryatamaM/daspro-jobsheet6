import java.util.Scanner;

public class Pemilihan2Percobaan315 {
    
    public static void main(String[] args) {
        
        Scanner input15 = new Scanner(System.in);

        int penghasilan, gajiBersih;
        String kategori;
        double pajak = 0;
        
        System.out.print("Masukkan Kategori : ");
        kategori = input15.nextLine();
        System.out.print("Masukkan besarnya penghasilan : ");
        penghasilan = input15.nextInt();
        
        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }

            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Penghasilan Bersih: " + gajiBersih);

        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }

            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Penghasilan Bersih: " + gajiBersih);
        } else {
            System.out.println("Kategori salah");
        }
    }
}