import java.util.Scanner;

public class SayiSiralama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.print("3. sayıyı giriniz: ");
        int sayi3 = scanner.nextInt();

        // Sayıları küçükten büyüğe sıralama
        if (sayi1 > sayi2) {
            int gecici = sayi1;
            sayi1 = sayi2;
            sayi2 = gecici;
        }

        if (sayi2 > sayi3) {
            int gecici = sayi2;
            sayi2 = sayi3;
            sayi3 = gecici;
        }

        if (sayi1 > sayi2) {
            int gecici = sayi1;
            sayi1 = sayi2;
            sayi2 = gecici;
        }

        System.out.println("Küçükten büyüğe sıralama: " + sayi1 + ", " + sayi2 + ", " + sayi3);
    }
}
