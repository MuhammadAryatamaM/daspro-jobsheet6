import java.util.Scanner;

public class HargaSepatu15 {
    
    public static void main(String[] args) {
        
        Scanner input15 = new Scanner(System.in);

        int ukuran, harga;
        String merk, kategori;

        System.out.print("Masukkan merk (specs/910/ortus): ");
        merk = input15.nextLine();

        if (merk.equalsIgnoreCase("specs")){
            System.out.print("Masukkan kategori (slip on/high top): ");
            kategori = input15.nextLine();
            if (kategori.equalsIgnoreCase("slip on")) {
                System.out.print("Masukkan ukuran (36-40): ");
                ukuran = input15.nextInt();
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                        System.out.println("Harganya sebesar : Rp" + harga);
                    } else {
                        System.out.println("Ukuran invalid");
                    }
                } else {
                    System.out.println("Ukuran invalid");
                }
            } else if (kategori.equalsIgnoreCase("high top")) {
                System.out.print("Masukkan ukuran (40-44): ");
                ukuran = input15.nextInt();
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                        System.out.println("Harganya sebesar : Rp" + harga);
                    } else {
                        System.out.println("Ukuran invalid");
                    }
                } else {
                    System.out.println("Ukuran invalid");
                }
            } else {
                System.out.println("Kategori invalid");
            }
        } else if (merk.equalsIgnoreCase("910")){
            System.out.print("Masukkan kategori (woman/man): ");
            kategori = input15.nextLine();
            if (kategori.equalsIgnoreCase("woman")) {
                System.out.print("Masukkan ukuran (36-41): ");
                ukuran = input15.nextInt();
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                        System.out.println("Harganya sebesar : Rp" + harga);
                    } else {
                        System.out.println("Ukuran invalid");
                    }
                } else {
                    System.out.println("Ukuran invalid");
                }
            } else if (kategori.equalsIgnoreCase("man")) {
                System.out.print("Masukkan ukuran (41-44): ");
                ukuran = input15.nextInt();
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                        System.out.println("Harganya sebesar : Rp" + harga);
                    } else {
                        System.out.println("Ukuran invalid");
                    }
                } else {
                    System.out.println("Ukuran invalid");
                }
            } else {
                System.out.println("Kategori invalid");
            }
        } else if (merk.equalsIgnoreCase("ortus")){
            System.out.print("Masukkan kategori (kids/adult): ");
            kategori = input15.nextLine();
            if (kategori.equalsIgnoreCase("kids")) {
                System.out.print("Masukkan ukuran (36-40): ");
                ukuran = input15.nextInt();
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                        System.out.println("Harganya sebesar : Rp" + harga);
                    } else {
                        System.out.println("Ukuran invalid");
                    }
                } else {
                    System.out.println("Ukuran invalid");
                }
            } else if (kategori.equalsIgnoreCase("adult")) {
                System.out.print("Masukkan ukuran (40-44): ");
                ukuran = input15.nextInt();
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                        System.out.println("Harganya sebesar : Rp" + harga);
                    } else {
                        System.out.println("Ukuran invalid");
                    }
                } else {
                    System.out.println("Ukuran invalid");
                }
            } else {
                System.out.println("Kategori invalid");
            }
        } else {
            System.out.println("Merk invalid");
        }
    }
}