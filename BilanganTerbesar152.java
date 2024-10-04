import java.util.Scanner;

public class BilanganTerbesar152 {
    
    public static void main(String[] args) {
        
        Scanner input15 = new Scanner(System.in);

        int a, b, c;

        System.out.print("Masukkan bilangan pertama: ");
        a = input15.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        b = input15.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        c = input15.nextInt();

        if (a >= b) {
            if (a >= c) {
                System.out.println(a + " adalah bilangan terbesar");
            } else {
                System.out.println(c + " adalah bilangan terbesar");
            }
        } else if (b >= c) {
            System.out.println(b + " adalah bilangan terbesar");
        } else {
            System.out.println(c + " adalah bilangan terbesar");
        }
    }
}