import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();

        // Çin Zodyağı hesaplama
        String cinZodyagi = getCinZodyagi(dogumYili);

        // Sonucu ekrana yazdırma
        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi);
    }

    // Çin Zodyağı hesaplama fonksiyonu
    public static String getCinZodyagi(int dogumYili) {
        String[] Burclar = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        int index = dogumYili % 12;
        return Burclar[index];
    }
}
