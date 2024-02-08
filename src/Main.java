import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double boy, kilo,endeks;

        System.out.println("boyunuzu giriniz");
        boy = scanner.nextDouble();
        System.out.println("kilonuzu giriniz");
        kilo=scanner.nextDouble();

        endeks = kilo /(boy * boy);

        System.out.println("endeks: " + endeks);

    }
}