import java.util.Scanner;

public class BilanganTerbesar15 {
    
    public static void main(String[] args) {
        
        Scanner input15 = new Scanner(System.in);

        int a, b, c;

        System.out.print("Masukkan bilangan pertama: ");
        a = input15.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        b = input15.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        c = input15.nextInt();

        if ((a >= b) && (a >= c)) {
            System.out.println(a + " adalah bilangan terbesar");
        } else if ((b >= c) && (b >= a)) {
            System.out.println(b + " adalah bilangan terbesar");
        } else if ((c >= a) && (c >= b)) {
            System.out.println(c + " adalah bilangan terbesar");
        } else {
            System.out.println("Input invalid");
        }
    }
} 