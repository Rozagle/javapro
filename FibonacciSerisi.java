import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin kaç elemanını görmek istiyorsunuz? ");
        int elemanSayisi = scanner.nextInt();

        System.out.println(elemanSayisi + " Elemanlı Fibonacci Serisi:");

        // İlk iki elemanı belirliyoruz
        int oncekiEleman = 0;
        int simdikiEleman = 1;

        // Fibonacci serisini bulup ekrana yazdırma
        for (int i = 1; i <= elemanSayisi; i++) {
            System.out.print(oncekiEleman + " ");

            int toplam = oncekiEleman + simdikiEleman;
            oncekiEleman = simdikiEleman;
            simdikiEleman = toplam;
        }

        scanner.close();
    }
}
