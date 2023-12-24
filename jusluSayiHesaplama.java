import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int us = scanner.nextInt();

        int sonuc = usHesapla(taban, us);

        System.out.println("Sonuç: " + sonuc);

        scanner.close();
    }

    // Recursive metot
    static int usHesapla(int taban, int us) {
        // Üs 0 ise 1 döndür
        if (us == 0) {
            return 1;
        } else {
            // Üs değeri kadar tabanı kendisiyle çarparak recursive olarak devam et
            return taban * usHesapla(taban, us - 1);
        }
    }
}
